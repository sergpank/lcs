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

    private void addSuffix(String suffix, int wordIndex, Vertex parent, int previousMatchPositionInSuffix){
        Map.Entry<Edge, Vertex> matchingNode =  findMatchingVertex(suffix, parent);
        if(matchingNode != null){
            Vertex vertex = matchingNode.getValue();
            Edge edge = matchingNode.getKey();
            String vertexString = getVertexString(edge);
            int lastMatchIndex = getLasMatchIndex(suffix, vertexString);

            if(vertexIsPrefix(vertexString, lastMatchIndex)){
                addSuffix(suffix.substring(lastMatchIndex), wordIndex, vertex, previousMatchPositionInSuffix + lastMatchIndex);
            } else {
                Vertex prefixVertex = new Vertex(parent, wordIndex);
                int prefixEndIndex = edge.getStartIndex() + lastMatchIndex;
                Edge prefixEdge = new Edge(wordIndex, edge.getStartIndex(), prefixEndIndex);

                parent.removeChild(edge);
                parent.addChild(prefixEdge, prefixVertex);
                parent.addIndex(wordIndex);

                Edge edgeChunk = new Edge(wordIndex, prefixEndIndex, edge.getEndIndex());
                prefixVertex.addChild(edgeChunk, vertex);

                int endIndex = wordMap.get(wordIndex).length();
                Edge newEdge = new Edge(wordIndex, previousMatchPositionInSuffix + lastMatchIndex, endIndex);
                Vertex newVertex = new Vertex(prefixVertex, wordIndex);

                prefixVertex.addChild(newEdge, newVertex);
                prefixVertex.addIndex(wordIndex);
            }

        } else{
            Edge edge = new Edge(wordIndex, previousMatchPositionInSuffix, previousMatchPositionInSuffix + suffix.length());
            Vertex vertex = new Vertex(parent, wordIndex);
            parent.addChild(edge, vertex);
        }
    }

    private boolean vertexIsPrefix(String vertexString, int lastMatchIndex) {
        return vertexString.length() - lastMatchIndex == 1;
    }

    private int getLasMatchIndex(String suffix, String vertexString) {
        int cnt = 0;
        int length = Math.min(suffix.length(), vertexString.length());
        for(int i = 0; i < length; i++){
            if (suffix.charAt(i) == vertexString.charAt(i)) {
                ++cnt;
            }
        }
        return cnt;
    }

    private Map.Entry<Edge, Vertex> findMatchingVertex(String suffix, Vertex parent) {
        Map.Entry<Edge, Vertex> match = null;
        Map<Edge,Vertex> children = parent.getChildren();
        if(children != null) {
            for(Map.Entry<Edge, Vertex> entry : children.entrySet()){
                Edge edge = entry.getKey();
                String vertexString = getVertexString(edge);
                if(isVertexSuitable(suffix, vertexString)) {
                    match = entry;
                }
            }
        }
        return match;
    }

    private boolean isVertexSuitable(String suffix, String vertexString) {
        return vertexString.charAt(0) == suffix.charAt(0);
    }

    private String getVertexString(Edge edge) {
        return wordMap.get(edge.getWordIndex()).substring(edge.getStartIndex(), edge.getEndIndex());
    }

    public String getWord(int wordIndex) {
        return wordMap.get(wordIndex);
    }
}
