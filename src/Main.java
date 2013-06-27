import java.util.Map;

public class Main {

    public static void main(String[] args) {
        SuffixTree trie = new SuffixTree();
        String data1 = "abbababb@";
        String data2 = "bbabbaba@";
        trie.addWord(data1);
        trie.addWord(data2);
        for(int i = 0; i < data1.length() - 1; i++){
            String substring = data1.substring(i, data1.length());
            System.out.println(i + " :: " + substring);
            trie.addSuffix(data1, 0, i);
//            printTree(trie.getRootVertex(), trie, 0);
        }
        System.out.println();

        for(int i = 0; i < data2.length() - 1; i++){
            String substring = data2.substring(i, data2.length());
            System.out.println(i + " :: " + substring);
            trie.addSuffix(data2, 1, i);
        }

        printTree(trie.getRootVertex(), trie, 0);
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
            System.out.println(suffix + " " + edge.getStartIndex() + "->" + edge.getEndIndex());
            printTree(entry.getValue(), trie, level + 1);
        }
    }
}
