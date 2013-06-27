import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SuffixTree trie = new SuffixTree();

        int strNmbr = Integer.parseInt(reader.readLine());

        for(int i = 0; i < strNmbr; i++){
            trie.addWord(reader.readLine() + "@");
        }

        printTree(trie.getRootVertex(), trie, 0);

        System.out.println("Longest: " + trie.getLongestSubstring());
    }

    private static void printTree(Vertex vertex, SuffixTree trie, int level) {
        if(vertex.getParent() == null){
            System.out.println("ROOT");
        }
        for(Map.Entry<Edge, Vertex> entry : vertex.getChildren().entrySet()){
            Edge edge = entry.getKey();
            for (int i = 0; i < level; i++){
                System.out.print("    ");
            }
            String suffix = trie.getWord(edge.getWordIndex()).substring(edge.getStartIndex(), edge.getEndIndex());
            System.out.print(suffix + " " + edge.getStartIndex() + "->" + edge.getEndIndex() + " | ");
            for(Integer index : entry.getValue().getIndexes()){
                System.out.print(index + ", ");
            }
            System.out.println();
            printTree(entry.getValue(), trie, level + 1);
        }
    }
}
