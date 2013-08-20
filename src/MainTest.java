import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MainTest {

    public static final int STRINGS_NR = 10;

    public static void main(String[] args) throws IOException {
        SuffixTree trie = new SuffixTree();

        String commonSubsequence = "uasivyoiuesbvryaosiudfhasldkjfnhcasdjhfasudvoaewiuryoaisudfyvudashfvioaushdfoiuashdfoiuasdfhcnuscdhf" +
                                   "oasuvhdfoasiudhfcnoasdfihvabsduhfcanosdufhvasodiufhnacsdufhvashodfuiacnshdofuhfasodufhsadfiuhsuvhanv" +
                                   "aosviduxlnvuretyqreqpweryxewmruvbszxcvhgasdfyqwerasdfljhcxvzxcvuazxcnvvberuqwoerbvasdfhavsjdkfhasdou" +
                                   "fhasdoufsydfouawyeofuiavwyeoasiudhfasdhfaosdufhoaweiufadufhasdfhasncaudsfhauertyabvrutyasodufhvahsdf" +
                                   "uahsdiufhaeryaoiusydroavsudofhasdfjhaoseiuryabsdouraysueryaboseiuryaosdiurhasdjfahseuiryaoeiurayvsdr";

        long startTime = System.nanoTime();
        int length = 9500;
        String[] randomStrings = new String[STRINGS_NR];
        for(int i = 0; i < STRINGS_NR; i++){
            String word = generateRandomString(length);
            int splitPosition = new Random().nextInt(length);
            String half1 = word.substring(0, splitPosition);
            String half2 = word.substring(splitPosition, length);
            StringBuilder sb = new StringBuilder();
            sb.append(half1);
            sb.append(commonSubsequence);
            sb.append(half2);
            word = sb.toString();
            System.out.println(word);
            randomStrings[i] = word;
        }

        long stringGenerationTime = System.nanoTime();
        System.out.println("\nstrings generation: " + (nanoToSeconds(stringGenerationTime - startTime)) + "\n");

        for(int i = 0; i < STRINGS_NR; i++){
            trie.addWord(randomStrings[i]);
        }

        long endInsertTime = System.nanoTime();
        System.out.println("insert: " + (nanoToSeconds(endInsertTime - stringGenerationTime)) + "\n");

        String longestSubstring = trie.getLongestSubstring();

        if(longestSubstring.charAt(longestSubstring.length() - 1) == '@'){
            longestSubstring = longestSubstring.substring(0, longestSubstring.length() - 1);
        }

        System.out.println("longest substring: " + longestSubstring);
        System.out.println("\nis right: " + (longestSubstring.equalsIgnoreCase(commonSubsequence) + "").toUpperCase());
        long endSearchTime = System.nanoTime();
        System.out.println("\nsearch: " + (nanoToSeconds(endSearchTime - endInsertTime)) + "\n");

        System.out.println();
    }

    private static String nanoToSeconds(long nano){
        long nanos  = nano % 1000;
        long micro  = (nano - nanos) / 1000;
        long micros = micro % 1000;
        long mili   = (micro - micros) / 1000;
        long milis  = mili % 1000;
        long second = (mili - milis) / 1000;

        return MessageFormat.format("{0}s {1}ms {2}us {3}ns", second, milis, micros, nanos);
    }

    private static String generateRandomString(int length){
        StringBuilder sb = new StringBuilder();
        Random random = new Random(new Date().getTime());
        for (int i = 0; i < length; i++){
            sb.append((char)(97 + random.nextInt(25)));
        }
        return sb.toString();
    }
}

    class SuffixTree {

        private Vertex rootVertex;
        private Map<Integer, String> wordMap = new HashMap<Integer, String>();

        public SuffixTree() {
            rootVertex = new Vertex(null);
        }

        public Vertex getRootVertex() {
            return rootVertex;
        }

        public void addWord(String word){
            wordMap.put(wordMap.size(), word);
            int wordIndex = wordMap.size() - 1;
            for (int i = 0; i < word.length() - 1; i++) {
                addSuffix(word, wordIndex, i);
            }
        }

        public void addSuffix(String suffix, int wordIndex, int startPosition) {
            addSuffix(suffix, wordIndex, rootVertex, startPosition);
        }

        private void addSuffix(String suffix, int wordIndex, Vertex parent, int shift) {
            Map.Entry<Edge, Vertex> matchingNode = findMatchingVertex(suffix, parent, shift);
            if (matchingNode != null) {
                Vertex vertex = matchingNode.getValue();
                Edge edge = matchingNode.getKey();
                String vertexString = getVertexString(edge);
                int prefixLength = calcPrefixLength(suffix, vertexString, shift);

                if (suffix.length() - shift - prefixLength == 0) {
                    vertex.addWordIndex(wordIndex);
                    return;
                } else if (vertexIsPrefix(vertexString, prefixLength)) {
                    vertex.addWordIndex(wordIndex);
                    addSuffix(suffix, wordIndex, vertex, shift + prefixLength);
                } else {
                    Edge prefixEdge = new Edge(edge.getWordIndex(), edge.getStartIndex(), edge.getStartIndex() + prefixLength);
                    Vertex prefixVertex = new Vertex(parent, vertex.getIndexes());

                    parent.removeChild(edge);

                    edge.setStartIndex(edge.getStartIndex() + prefixLength);

                    Edge newEdge = new Edge(wordIndex, shift + prefixLength, suffix.length());
                    Vertex newVertex = new Vertex(prefixVertex);
                    newVertex.addWordIndex(wordIndex);

                    parent.addChild(prefixEdge, prefixVertex);
                    parent.addWordIndex(wordIndex);

                    prefixVertex.addChild(edge, vertex);
                    prefixVertex.addWordIndex(edge.getWordIndex());

                    prefixVertex.addChild(newEdge, newVertex);
                    prefixVertex.addWordIndex(wordIndex);
                }
            } else {
                Edge edge = new Edge(wordIndex, shift, suffix.length());
                Vertex vertex = new Vertex(parent);
                vertex.addWordIndex(wordIndex);

                parent.addChild(edge, vertex);
            }
        }

        private boolean vertexIsPrefix(String vertexString, int prefixLength) {
            return vertexString.length() <= prefixLength;
        }

        private int calcPrefixLength(String suffix, String vertexString, int shift) {
            int cnt = 0;
            int length = Math.min(suffix.length() - shift, vertexString.length());
            for (int i = 0; i < length; i++) {
                if (suffix.charAt(i + shift) == vertexString.charAt(i)) {
                    ++cnt;
                } else {
                    break;
                }
            }
            return cnt;
        }

        private Map.Entry<Edge, Vertex> findMatchingVertex(String suffix, Vertex parent, int shift) {
            Map.Entry<Edge, Vertex> match = null;
            Map<Edge, Vertex> children = parent.getChildren();
            if (children != null) {
                for (Map.Entry<Edge, Vertex> entry : children.entrySet()) {
                    Edge edge = entry.getKey();
                    String vertexString = getVertexString(edge);
                    if (isVertexSuitable(suffix, vertexString, shift)) {
                        match = entry;
                        break;
                    }
                }
            }
            return match;
        }

        private boolean isVertexSuitable(String suffix, String vertexString, int shift) {
            return vertexString.charAt(0) == suffix.charAt(shift);
        }

        private String getVertexString(Edge edge) {
            return wordMap.get(edge.getWordIndex()).substring(edge.getStartIndex(), edge.getEndIndex());
        }

        public String getWord(int wordIndex) {
            return wordMap.get(wordIndex);
        }

        public String getLongestSubstring() {
            Set<String> subSet = Collections.synchronizedSet(new TreeSet<String>(new Comparator<String>() {
                @Override
                public int compare(String string1, String string2) {
                    return string2.length() - string1.length();
                }
            }));
            getSubstrings(rootVertex, subSet, "");

            return subSet.iterator().next();
        }

        private void getSubstrings(Vertex parent, Set<String> strings, String substring) {
            int commonSubstringsCounter = 0;
            for(Map.Entry<Edge, Vertex> entry : parent.getChildren().entrySet()){
                if(entry.getValue().getIndexes().size() == wordMap.size()){
                    Edge edge = entry.getKey();
                    String vertexString = wordMap.get(edge.getWordIndex()).substring(edge.getStartIndex(), edge.getEndIndex());
                    getSubstrings(entry.getValue(), strings, substring + vertexString);
                    commonSubstringsCounter++;
                }
            }
            if(commonSubstringsCounter == 0){
                strings.add(substring);
            }
        }
    }

    class Edge {
        private int startIndex;
        private int endIndex;
        private int wordIndex;

        public Edge(int wordIndex, int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.wordIndex = wordIndex;
        }


        public int getStartIndex() {
            return startIndex;
        }


        public void setStartIndex(int startIndex) {
            this.startIndex = startIndex;
        }


        public int getEndIndex() {
            return endIndex;
        }


        public int getWordIndex() {
            return wordIndex;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Edge edge = (Edge) o;

            if (endIndex != edge.endIndex) return false;
            if (startIndex != edge.startIndex) return false;
            if (wordIndex != edge.wordIndex) return false;

            return true;
        }


        @Override
        public int hashCode() {
            int result = startIndex;
            result = 31 * result + endIndex;
            result = 31 * result + wordIndex;
            return result;
        }
    }

    class Vertex {

        private Vertex parent;
        private Map<Edge, Vertex> children = new HashMap<Edge, Vertex>();
        private Set<Integer> indexes = new HashSet<Integer>();

        public Vertex(Vertex parent) {
            this(parent, new HashSet<Integer>());
        }

        public Vertex(Vertex parent, Set<Integer> indexes) {
            this.parent = parent;
            this.indexes.addAll(indexes);
        }

        public void addChild(Edge edge, Vertex vertex){
            children.put(edge, vertex);
        }

        public Vertex getParent() {
            return parent;
        }

        public Map<Edge, Vertex> getChildren(){
            return Collections.unmodifiableMap(children);
        }

        public void addWordIndex(Integer wordIndex){
            indexes.add(wordIndex);
        }

        public Set<Integer> getIndexes() {
            return indexes;
        }

        public void removeChild(Edge edge) {
            children.remove(edge);
        }

        public void addChildren(Map<Edge, Vertex> children) {
            this.children.putAll(children);
        }
    }
