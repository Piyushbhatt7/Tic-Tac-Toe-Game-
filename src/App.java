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
            System.out.print("Player " + player +"  enter: ");
            int rows = sc.nextInt();
            int col = sc.nextInt();

            if(board[rows][col] == ' ')
            {
                // place the element
                board[rows][col] = player;
                gameOver = haveWon(board, player);
            }
            if(gameOver)
            {
                System.out.println("Player " + player + " has won!");
            }
            else {
                if(player == 'X')
                {
                    player = 'O';

                }
                else{
                    player = 'X';
                }
            }
               System.out.println("Invalid move. Try again!");
         }
         printBoard(board);
    }

    public static boolean haveWon(char[][] board, char player)
    {
      // check rows
      for(int rows = 0; rows < board.length; rows++)
      {
         if(board[rows][0] == player && board[rows][1] == player && board[rows][2] == player)
         {
            return true;
         }
      }

      // check for columns
      for(int col = 0; col < board[0].length; col++)
      {
        if(board[0][col] == player && board[1][col] == player && board[2][col] == player)
        {
            return true;
        }
      }

      // diagonal
      if(board[0][0] == player && board[1][1] == player && board[2][2] == player)
      {
        return true;
      }

      if(board[0][2] == player && board[1][1] == player && board[2][0] == player)
      {
        return true;
      }
      return false;
    }

    public static void printBoard(char[][] board)
    {
        for(int rows = 0; rows < board.length; rows++)
        {
            for(int col = 0; col < board[rows].length; col++)
            {
                System.out.print(board[rows][col] + " | ");
            }
                System.out.println();
        }
    }
}
