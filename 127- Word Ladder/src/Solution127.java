import java.util.*;

public class Solution127 {


    /**
     * 给定一个开始单词和结束单词 以及一个字典表
     * <p>
     * 一次只能更改一个字母。
     * 每个转换后的单词必须存在于单词列表中。需要注意的是beginWord是不是变换词。
     * <p>
     * Input:
     * beginWord = "hit",
     * endWord = "cog",
     * wordList = ["hot","dot","dog","lot","log","cog"]
     * <p>
     * Output: 5
     * <p>
     * Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
     * return its length 5.
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");

        System.out.println(new Solution127().ladderLength("hit", "cog", list));
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (endWord.isEmpty() || wordList.isEmpty()) {
            return 0;
        }
        Set<String> wordSet = new HashSet<>();

        for (String word : wordList) {
            wordSet.add(word);
        }

        Map<String, Integer> pathCnt = new HashMap<>();

        pathCnt.put(beginWord, 1);

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        while (!queue.isEmpty()) {
            String word = queue.poll();

            for (int i = 0; i < word.length(); i++) {
                String newWord = word;
                for (char ch = 'a'; ch <= 'z'; ++ch) {
                    newWord = newWord.substring(0, i) + ch + newWord.substring(i + 1, word.length());
                    if (wordSet.contains(newWord) && newWord.equals(endWord)) {
                        return pathCnt.get(word) + 1;
                    }

                    if (wordSet.contains(newWord)&&!pathCnt.containsKey(newWord)) {
                        queue.offer(newWord);
                        pathCnt.put(newWord, pathCnt.get(word) + 1);
                    }
                }
            }

        }
        return 0;
    }
}
