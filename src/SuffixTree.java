import java.util.HashMap;
import java.util.Map;

public class SuffixTree {

    private Vertex rootVertex;
    private Map<Integer, String> wordMap = new HashMap<Integer, String>();

    public SuffixTree() {
        rootVertex = new Vertex(null, -1);
    }

    public void addWord(String word){
        wordMap.put(wordMap.size(), word);
    }

    public Vertex getRootVertex() {
        return rootVertex;
    }

    public void addSuffix(String suffix, int wordIndex){
        addSuffix(suffix, wordIndex, rootVertex, 0);
    }

    private void addSuffix(String suffix, int wordIndex, Vertex previousParent, int previousMatchPosition){
        Vertex parentVertex =  findMatchingVertex(suffix, previousParent);
        if(parentVertex != null){

        } else{
            Edge edge = new Edge(wordIndex, previousMatchPosition, suffix.length());
            Vertex vertex = new Vertex(parentVertex, wordIndex);
            previousParent.addChild(edge, vertex);
        }
    }

    private Vertex findMatchingVertex(String suffix, Vertex parent) {
        Vertex parentVertex = null;
        Map<Edge,Vertex> children = parent.getChildren();
        if(children != null) {
            for(Map.Entry<Edge, Vertex> entry : children.entrySet()){
                Edge edge = entry.getKey();
                String vertexString = getVertexString(edge);
                if(isSuffixPrefix(suffix, vertexString)) {
                    parentVertex = entry.getValue();
                }
            }
        }
        return parentVertex;
    }

    private boolean isSuffixPrefix(String suffix, String vertexString) {
        return vertexString.charAt(0) == suffix.charAt(0);
    }

    private String getVertexString(Edge edge) {
        return wordMap.get(edge.getWordIndex()).substring(edge.getStartIndex(), edge.getEndIndex());
    }

    public String getWord(int wordIndex) {
        return wordMap.get(wordIndex);
    }
}
