import java.util.*;

public class Vertex {

    private Map<Edge, Vertex> children = new TreeMap<Edge, Vertex>();
    private List<Integer> indexes = new ArrayList<Integer>();

    public void addChild(Edge edge, Vertex vertex){
        children.put(edge, vertex);
    }

    public Map<Edge, Vertex> getChildren(){
        return Collections.unmodifiableMap(children);
    }

    public List<Integer> getIndexes() {
        return indexes;
    }
}
