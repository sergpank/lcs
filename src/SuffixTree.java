import java.util.*;

public class SuffixTree {

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
                Vertex prefixVertex = new Vertex(parent);

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

        for (String s : subSet) {
            System.out.println(s);
        }

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
