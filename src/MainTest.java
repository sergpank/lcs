import stree.SuffixTree;

public class MainTest {

    public static void main(String[] args) {
        SuffixTree tree = new SuffixTree();
        tree.addWord("abcdeggg");
        tree.addWord("abcdeddd");
        tree.addWord("abcdeddd");
        tree.addWord("abcdeaaa");

        System.out.println(tree.getLongestSubstring());
    }
}
