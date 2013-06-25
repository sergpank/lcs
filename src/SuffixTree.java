import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SuffixTree {

    private Vertex rootVertex;
    private List<String> words = new ArrayList<String>();

    public Vertex getRootVertex() {
        return rootVertex;
    }

    public void addSuffix(String suffix){
        for(Map.Entry<Edge, Vertex> entry : rootVertex.getChildren().entrySet()){
            Edge edge = entry.getKey();
            String vertexString = getVertexString(edge);
            if(isSuffixPrefix(suffix, vertexString)){
//                findSimilarityIndex;
//                split edge if necessary;
//                insert suffix;
            }
        }
    }

    private boolean isSuffixPrefix(String suffix, String vertexString) {
        return vertexString.charAt(0) == suffix.charAt(0);
    }

    private String getVertexString(Edge edge) {
        return words.get(edge.getWordIndex()).substring(edge.getStartIndex(), edge.getEndIndex());
    }
}
