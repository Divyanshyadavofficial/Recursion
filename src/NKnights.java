 public class NKnights {

        public static void main(String[] args) {
            int n = 3; // board size
            boolean[][] board = new boolean[n][n];
            System.out.println("Total solutions: " + knight(board, 0, 0, n));
        }

        static int knight(boolean[][] board, int row, int col, int knights) {
            if (knights == 0) {
                display(board);
                System.out.println();
                return 1;
            }

            if (row == board.length) {
                return 0;
            }

            if (col == board.length) {
                return knight(board, row + 1, 0, knights);
            }

            int count = 0;

            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += knight(board, row, col + 1, knights - 1);
                board[row][col] = false;
            }

            count += knight(board, row, col + 1, knights); // skip this cell

            return count;
        }

        private static boolean isSafe(boolean[][] board, int row, int col) {
            // only check positions that can attack (upper half)
            int[][] moves = {
                    {-2, -1}, {-2, +1},
                    {-1, -2}, {-1, +2}
            };

            for (int[] move : moves) {
                int newRow = row + move[0];
                int newCol = col + move[1];

                if (newRow >= 0 && newCol >= 0 && newRow < board.length && newCol < board.length) {
                    if (board[newRow][newCol]) {
                        return false;
                    }
                }
            }

            return true;
        }

        private static void display(boolean[][] board) {
            for (boolean[] row : board) {
                for (boolean cell : row) {
                    System.out.print(cell ? "K " : "X ");
                }
                System.out.println();
            }
        }
    }


