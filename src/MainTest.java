import stree.SuffixTree;

public class MainTest {

    public static void main(String[] args) {
        SuffixTree tree = new SuffixTree();
        tree.addWord("abcdeggg");
        tree.addWord("abcdeggfgsdfhdgjdf");
        tree.addWord("abcdeddd");
        tree.addWord("abcdeaaa");
        tree.addWord("acaaa$");
        tree.addWord("abaaa$");
        tree.addWord("abcdeabxabcd$");

        System.out.println(tree.getLongestSubstring());
    }
}
