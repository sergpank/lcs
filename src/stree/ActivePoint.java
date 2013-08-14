package stree;

public class ActivePoint {
    private Vertex activeNode;
    private Edge activeEdge;
    private int activeLength;

    public ActivePoint(Vertex activeNode, Edge activeEdge, int activeLength) {
        this.activeNode = activeNode;
        this.activeEdge = activeEdge;
        this.activeLength = activeLength;
    }

    public Vertex getActiveNode() {
        return activeNode;
    }

    public void setActiveNode(Vertex activeNode) {
        this.activeNode = activeNode;
    }

    public Edge getActiveEdge() {
        return activeEdge;
    }

    public void setActiveEdge(Edge activeEdge) {
        this.activeEdge = activeEdge;
    }

    public int getActiveLength() {
        return activeLength;
    }

    public void setActiveLength(int activeLength) {
        this.activeLength = activeLength;
    }

    public void incrementActiveLength(char c, int wordIndex) {
        if (activeLength == activeEdge.length()) {
            activeLength = 1;
            activeEdge.addWordIndex(wordIndex);
            activeEdge = activeEdge.getEndVertex().findEdgeStartingWith(c);
            activeNode = activeEdge.getStartVertex();
        } else {
            ++activeLength;
        }
    }

    public void decrementActiveLength() {
        --activeLength;
    }

    public boolean isNeedToInsert(char c, String subsuffix, int wordIndex) {
        if(activeLength == activeEdge.length()){
            return activeEdge.getEndVertex().findEdgeStartingWith(c) == null;
        } else if(activeLength > activeEdge.length()){
            subsuffix = subsuffix.substring(activeEdge.length());
            activeLength -= activeEdge.length();
            activeEdge.addWordIndex(wordIndex);
            activeEdge = activeEdge.getEndVertex().findEdgeStartingWith(subsuffix.charAt(0));
            return isNeedToInsert(c, subsuffix, wordIndex);
        } else{
            return activeEdge.getCharAt(activeLength) != c;
        }
    }
}
