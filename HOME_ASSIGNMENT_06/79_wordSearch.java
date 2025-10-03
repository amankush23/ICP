class Solution {
    int m;
    int n;
    char[][] board;
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

    public boolean exist(char[][] board, String word) {
        this.m = board.length;
        this.n = board[0].length;
        this.board = board; 

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && find(i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean find(int i, int j, int idx, String word) {
        if (idx == word.length()) return true;

        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != word.charAt(idx)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#'; 

        for (int[] dir : dirs) {
            int i_new = i + dir[0];
            int j_new = j + dir[1];
            if (find(i_new, j_new, idx + 1, word)) {
                board[i][j] = temp;
                return true;
            }
        }

        board[i][j] = temp;
        return false;
    }
}
