package stree;

import java.util.*;

public class SuffixTree {

    private Vertex rootVertex;
    private Map<Integer, String> wordMap = new HashMap<Integer, String>();
    private ActivePoint activePoint;
    private Index currentPosition = new Index(0);
    private Integer remainder = 0;
    private Vertex candidateForSuffixLink;

    public SuffixTree() {
        rootVertex = new Vertex();
    }

    public void addWord(String word) {
        activePoint = new ActivePoint(rootVertex, null, 0);
        wordMap.put(wordMap.size(), word);
        int wordIndex = wordMap.size() - 1;
        currentPosition = new Index(0);
        remainder = 1;
        while (currentPosition.index < word.length()) {
            candidateForSuffixLink = null;
            ++currentPosition.index;
            String subsuffix = getSubsuffix(word);
            addSuffix(subsuffix, wordIndex);
            ++remainder;
        }
    }

    private void addSuffix(String subsuffix, int wordIndex) {
        if (remainder == 1) {
            Edge edge = activePoint.getActiveNode().findEdgeStartingWith(subsuffix.charAt(0));
            if (edge == null) {
                Index startIndex = new Index(currentPosition.index - remainder);
                Edge newEdge = new Edge(wordMap, wordIndex, startIndex, currentPosition, rootVertex, null);
                rootVertex.addEdge(newEdge);
                --remainder;
                return;
            } else {
                activePoint.setActiveNode(rootVertex);
                activePoint.setActiveEdge(edge);
                activePoint.setActiveLength(1);
            }
        } else {
            char activePointChar = activePoint.getActiveEdge().getCharAt(activePoint.getActiveLength());
            char charToInsert = subsuffix.charAt(remainder - 1);
            if (activePointChar == charToInsert) {
                activePoint.incrementActiveLength(subsuffix.charAt(remainder - 1), wordMap, wordIndex);
            } else {
                splitEdgeAndInsertNode(wordIndex, subsuffix);
            }
        }
    }

    private void splitEdgeAndInsertNode(final int wordIndex, String suffix) {
        Vertex newVertex = new Vertex();
        Edge newEdge = new Edge(wordMap, wordIndex, new Index(currentPosition.index - 1), currentPosition, newVertex, null);

        Edge[] splitEdges = activePoint.getActiveEdge().split(activePoint.getActiveLength(), newVertex);
        newVertex.addEdge(newEdge);
        newVertex.addEdge(splitEdges[1]);
        newEdge.addWordIndexes(splitEdges[0].getWordIndexes());

        activePoint.getActiveNode().getEdges().remove(activePoint.getActiveEdge());
        activePoint.getActiveNode().addEdge(splitEdges[0]);
        splitEdges[0].addWordIndex(wordIndex);

        --remainder;

        if (activePoint.getActiveNode() != rootVertex) {
            Vertex suffixLink = activePoint.getActiveNode().getSuffixLink();
            if (suffixLink != null) {
                activePoint.setActiveNode(suffixLink);
            } else {
                activePoint.setActiveNode(rootVertex);
            }
            Edge newActiveEdge = activePoint.getActiveNode().findEdgeStartingWith(activePoint.getActiveEdge().getFirstChar());
            activePoint.setActiveEdge(newActiveEdge);
        } else {
            activePoint.setActiveEdge(rootVertex.findEdgeStartingWith(suffix.charAt(1)));
            activePoint.decrementActiveLength();
        }

        if (candidateForSuffixLink != null) {
            candidateForSuffixLink.setSuffixLink(newVertex);
            candidateForSuffixLink = newVertex;
        } else {
            candidateForSuffixLink = newVertex;
        }

        addSuffix(suffix.substring(1, suffix.length()), wordIndex);
    }

    private String getSubsuffix(String suffix) {
        return suffix.substring(currentPosition.index - remainder, currentPosition.index);
    }

    public String getLongestSubstring() {
        Set<String> subSet = Collections.synchronizedSet(new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                return string2.length() - string1.length();
            }
        }));
        getSubstrings(rootVertex, subSet, "");

        return subSet.iterator().next();
    }

    private void getSubstrings(Vertex node, Set<String> strings, String substring) {
        if (node != null) {
            for (Edge edge : node.getEdges()) {
                if (edge.getWordIndexes().size() == wordMap.size()) {
                    int startIndex = edge.getStartIndex().index;
                    int endIndex = edge.getEndIndex().index;

                    String vertexString = wordMap.get(edge.getWordIndex()).substring(startIndex, endIndex);

                    Vertex nextVertex = edge.getEndVertex();
                    if (nextVertex != null) {
                        getSubstrings(nextVertex, strings, substring + vertexString);
                    }
                } else {
                    strings.add(substring);
                }
            }
        }
    }
}
