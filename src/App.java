import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        char[][] board = new char[3][3];
        for(int rows = 0; rows < board.length; rows++)
        {
            for(int col = 0; col < board[rows].length; col++)
            {
                board[rows][col] = ' ';
            }
        }

         char player = 'X';
         boolean gameOver = false;

         Scanner sc = new Scanner(System.in);

         while (!gameOver) {
            
            printBoard(board);
            System.out.println("Player " + player +"  enter: ");
            int rows = sc.nextInt();
            int col = sc.nextInt();
         }
    }

    public static void printBoard(char[][] board)
    {

    }
}
