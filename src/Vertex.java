import java.util.*;

public class Vertex {

    private Vertex parent;
    private Map<Edge, Vertex> children = new HashMap<Edge, Vertex>();
    private Set<Integer> indexes = new HashSet<Integer>();

    public Vertex(Vertex parent, int wordIndex) {
        this.parent = parent;
        indexes.add(wordIndex);
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
}
