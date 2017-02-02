import java.util.Scanner;


/**
 *  Model and solver of Sudoku board.
 *
 *  @author  Winston Tsai, Richard Yang
 *  @version Feb 1, 2017
 *  @author  Assignment: Sudoku Solver
 *
 */
public class Board
{
    private Square[][] board;

    public static final String exampleBoard = "000260701680070090190004500820100040004602900050003028009300074040050036703018000";
    // make this read from file please i got cancer


    public Board()
    {
        board = new Square[9][9];
        Scanner scan = new Scanner( System.in );

        System.out.println( "Enter Numbers:" );
        String b = scan.nextLine();
        char[] bob = b.toCharArray();
        int index = 0;
        for ( int r = 0; r < 9; r++ )
        {
            for ( int c = 0; c < 9; c++ )
            {
                board[r][c] = new Square( Integer.valueOf( String.valueOf( bob[index] ) ), r, c );
                index++;
            }
        }
    }


    public void solveBoard()
    {
        while ( !isComplete() )
        {
            for ( int i = 0; i < 9; i++ )
            {
                for ( int j = 0; j < 9; j++ )
                {
                    solveSquare( board[i][j], i, j );
                }
            }
        }
    }


    public void solveSquare( Square bob, int r, int c )
    {
        updatePoss( bob, r, c );
        bob.setValue( bob.getPoss().getValue() );
    }


    public void updatePoss( Square bob, int r, int c )
    {
        checkRow(bob, r);
        checkCol(bob, c);
    }


    public void checkRow( Square bob, int r )
    {

    }


    public void checkCol( Square bob, int c )
    {

    }


    public void checkGroup( Square bob, int g )
    {

    }


    public boolean isComplete()
    {
        for ( int i = 0; i < 9; i++ )
        {
            for ( int j = 0; j < 9; j++ )
            {
                if ( board[i][j].getValue() == 0 )
                {
                    return false;
                }
            }
        }
        return true;
    }


    public void printBoard()
    {
        for ( int i = 0; i < 9; i++ )
        {
            for ( int j = 0; j < 9; j++ )
            {
                System.out.print( board[i][j].getValue() + "|" );
            }
            System.out.println( "" );
        }
        System.out.println( "" );
    }


    public static void main( String[] args )
    {
        Board zzz = new Board();
        zzz.printBoard();
    }
}