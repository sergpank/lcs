import java.util.*;

public class Vertex {

    private Vertex parent;
    private Map<Edge, Vertex> children = new TreeMap<Edge, Vertex>();
    private List<Integer> indexes = new ArrayList<Integer>();

    public Vertex(Vertex parent, int index) {
        this.parent = parent;
        indexes.add(index);
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

    public void addIndex(Integer wordIndex){
        indexes.add(wordIndex);
    }

    public List<Integer> getIndexes() {
        return indexes;
    }
}
