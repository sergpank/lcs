import java.util.Map;

public class Main {

    public static void main(String[] args) {
        SuffixTree trie = new SuffixTree();
        String data = "abcde";
        trie.addWord(data);
        for(int i = 0; i < data.length(); i++){
            trie.addSuffix(data.substring(i, data.length()), 1);
        }

        printTree(trie.getRootVertex(), trie);
    }

    private static void printTree(Vertex vertex, SuffixTree trie) {
        for(Map.Entry<Edge, Vertex> entry : vertex.getChildren().entrySet()){
            Edge edge = entry.getKey();
            System.out.print(trie.getWord(edge.getWordIndex()).substring(edge.getStartIndex(), edge.getEndIndex()));
            printTree(entry.getValue(), trie);
        }
    }
}
