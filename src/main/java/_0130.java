import java.util.Arrays;

/**
 * 130. 被围绕的区域
 */
public class _0130 {

    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            mark(board, i, 0);
            mark(board, i, board[0].length - 1);
        }

        for (int i = 0; i < board[0].length; i++) {
            mark(board, 0, i);
            mark(board, board.length - 1, i);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'Y') {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void mark(char[][] board, int x, int y) {
        if (x < 0 || x > board.length-1 || y < 0 || y > board[0].length - 1 || board[x][y] == 'X' || board[x][y] == 'Y') {
            return;
        }

        if (board[x][y] == 'O') {
            board[x][y] = 'Y';
        }

        mark(board, x + 1, y);
        mark(board, x - 1, y);
        mark(board, x, y + 1);
        mark(board, x, y - 1);
    }

    public static void main(String[] args) {
        char[][] param = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        new _0130().solve(param);

        for (char[] chars : param) {
            System.out.println(Arrays.toString(chars));
        }
    }
}
