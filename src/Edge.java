public class Edge {
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

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getWordIndex() {
        return wordIndex;
    }

    public void setWordIndex(int wordIndex) {
        this.wordIndex = wordIndex;
    }
}
