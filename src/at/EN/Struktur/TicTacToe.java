import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';
    private static boolean gameRunning = true;

    public static void main(String[] args) {
        initializeBoard();

        while (gameRunning) {
            printBoard();
            int[] move = getPlayerMove();
            placeMove(move[0], move[1]);

            if (checkWinner()) {
                printBoard();
                System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
                gameRunning = false;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("Das Spiel endet unentschieden!");
                gameRunning = false;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    private static void initializeBoard() {
        for (char[] row : board) {
            for (int j = 0; j < board[0].length; j++) {
                row[j] = '-';
            }
        }
    }

    private static void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static int[] getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        int[] move = new int[2];
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Spieler " + currentPlayer + ", gib die Zeilennummer ein (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Gib die Spaltennummer ein (0-2): ");
            System.out.println();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                move[0] = row;
                move[1] = col;
                validInput = true;
            } else {
                System.out.println("Ungültige Eingabe. Bitte erneut versuchen.");
            }
        }

        return move;
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    private static void placeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    private static boolean checkWinner() {
        return (checkRows() || checkColumns() || checkDiagonals());
    }

    private static boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonals() {
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    private static boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}