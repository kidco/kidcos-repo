import java.util.ArrayList;


/**
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  Winston
 *  @version Feb 1, 2017
 *  @author  Period: TODO
 *  @author  Assignment: Sudoku Solver
 *
 *  @author  Sources: TODO
 */
public class Possibilities
{
    private ArrayList<Integer> poss;


    public Possibilities()
    {
        poss = new ArrayList<Integer>( 9 );
        for ( int i = 1; i <= 9; i++ )
        {
            poss.add( i );
        }
    }


    /**
     * Returns the value if there is only one remaining value.
     * 
     * @return the one remaining value
     */
    public int getValue()
    {
        if ( poss.size() == 1 )
        {
            return poss.get( 0 );
        }
        return 0;
    }


    public boolean isEmpty()
    {
        if ( poss.size() == 0 )
        {
            return true;
        }
        return false;
    }


    /**
     * removes x from possibilities if x exists in there
     * 
     * @param x
     *            number to be removed
     */
    public void remove( int x )
    {
        if ( poss.contains( x ) )
        {
            poss.remove( new Integer( x ) );
        }
    }


    public void clear()
    {
        poss.clear();
    }


    public void printPossibilities()
    {
        for ( int i = 0; i < poss.size(); i++ )
        {
            System.out.print( poss.get( i ) + " " );
        }
    }


    public static void main( String[] args )
    {
        Possibilities joe = new Possibilities();
        joe.remove( 3 );
        joe.printPossibilities();
    }
}
