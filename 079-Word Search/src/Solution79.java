import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution79 {



    /**
     * bfs搜索
     * 搜索单词 相邻连续
     * board =
     * [
     *   ['A','B','C','E'],
     *   ['S','F','C','S'],
     *   ['A','D','E','E']
     * ]
     *
     * Given word = "ABCCED", return true.
     * Given word = "SEE", return true.
     * Given word = "ABCB", return false.
     *
     * [["A","B","C","E"],
     * ["S","F","E","S"],
     * ["A","D","E","E"]]
     * "ABCESEEEFS"
     */


    static int dir[][]={{-1,0},{0,1},{1,0},{0,-1}};
    //static boolean vis[][];
    static int n,m;
    //定义每个类的位置
    class Node{
        int x;
        int y;
        int position;
    }

    public static void main(String[] args) {
       // char[][] board=new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        char[][] board=new char[][]{{'a'},{'a'}};
        String word="aaa";
        System.out.println(new Solution79().exist(board,word));
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j, visited))
                    return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int index, int rowindex, int colindex, boolean[][] visited) {
        if (index == word.length())
            return true;
        if (rowindex < 0 || colindex < 0 || rowindex >=board.length || colindex >= board[0].length)
            return false;
        if (visited[rowindex][colindex])
            return false;
        if (board[rowindex][colindex] != word.charAt(index))
            return false;
        visited[rowindex][colindex] = true;
        boolean res = dfs(board, word, index + 1, rowindex - 1, colindex,
                visited)
                || dfs(board, word, index + 1, rowindex + 1, colindex, visited)
                || dfs(board, word, index + 1, rowindex, colindex + 1, visited)
                || dfs(board, word, index + 1, rowindex, colindex - 1, visited);
        visited[rowindex][colindex] = false;
        return res;
    }
}
