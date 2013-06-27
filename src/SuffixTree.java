import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class SuffixTree {

    private Vertex rootVertex;
    private Map<Integer, String> wordMap = new HashMap<Integer, String>();

    public SuffixTree() {
        rootVertex = new Vertex(null, -1);
    }

    public Vertex getRootVertex() {
        return rootVertex;
    }

    public void addWord(String word){
        wordMap.put(wordMap.size(), word);
    }

    public void addSuffix(String suffix, int wordIndex, int startPosition){
        addSuffix(suffix, wordIndex, rootVertex, startPosition);
    }

    private void addSuffix(String suffix, int wordIndex, Vertex parent, int shift){
        Map.Entry<Edge, Vertex> matchingNode =  findMatchingVertex(suffix, parent, shift);
        if(matchingNode != null){
            Vertex vertex = matchingNode.getValue();
            Edge edge = matchingNode.getKey();
            String vertexString = getVertexString(edge);
            int prefixLength = calcPrefixLength(suffix, vertexString, shift);

            if(vertexIsPrefix(vertexString, prefixLength)){
                addSuffix(suffix, wordIndex, vertex, shift + prefixLength);
            } else {
                Edge prefixEdge = new Edge(edge.getWordIndex(), edge.getStartIndex(), edge.getStartIndex() + prefixLength);
                Vertex prefixVertex = new Vertex(parent, edge.getWordIndex());

                parent.removeChild(edge);

                edge.setStartIndex(edge.getStartIndex() + prefixLength);
                vertex.addWordIndex(wordIndex);

                Edge newEdge = new Edge(wordIndex, shift + prefixLength, suffix.length());
                Vertex newVertex = new Vertex(prefixVertex, wordIndex);

                parent.addChild(prefixEdge, prefixVertex);
                parent.addWordIndex(wordIndex);
                prefixVertex.addChild(edge, vertex);
                prefixVertex.addChild(newEdge, newVertex);
                prefixVertex.addWordIndex(wordIndex);
            }

        } else{
            Edge edge = new Edge(wordIndex, shift, suffix.length());
            Vertex vertex = new Vertex(parent, wordIndex);
            parent.addChild(edge, vertex);
        }
    }

    private boolean vertexIsPrefix(String vertexString, int prefixLength) {
        return vertexString.length() - prefixLength <= 1;
    }

    private int calcPrefixLength(String suffix, String vertexString, int shift) {
        int cnt = 0;
        int length = Math.min(suffix.length() - shift, vertexString.length());
        for(int i = 0; i < length; i++){
            if (suffix.charAt(i + shift) == vertexString.charAt(i)) {
                ++cnt;
            } else{
                break;
            }
        }
        return cnt;
    }

    private Map.Entry<Edge, Vertex> findMatchingVertex(String suffix, Vertex parent, int shift) {
        Map.Entry<Edge, Vertex> match = null;
        Map<Edge,Vertex> children = parent.getChildren();
        if(children != null) {
            for(Map.Entry<Edge, Vertex> entry : children.entrySet()){
                Edge edge = entry.getKey();
                String vertexString = getVertexString(edge);
                if(isVertexSuitable(suffix, vertexString, shift)) {
                    match = entry;
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

    @Override
    public String toString() {
        return printTree(rootVertex, "", 0);
    }

    private String printTree(Vertex vertex, String string, int level) {
        if(vertex.getParent() == null){
            string += "ROOT\n";
        }
        for(Map.Entry<Edge, Vertex> entry : vertex.getChildren().entrySet()){
            Edge edge = entry.getKey();
            for (int i = 0; i < level; i++){
                string += "    ";
            }
            String suffix = this.getWord(edge.getWordIndex()).substring(edge.getStartIndex(), edge.getEndIndex());
            string += MessageFormat.format("{0} {1}->{2}", suffix, edge.getStartIndex(), edge.getEndIndex());
            string += printTree(entry.getValue(), string, level + 1);
        }
        return string;
    }
}
