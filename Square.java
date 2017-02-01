
public class Square
{
    private Possibilities poss;

    private int value;

    private int group;

    private int r, c;


    public Square( int q, int a, int b )
    {
        value = q;
        r = a;
        c = b;
        poss = new Possibilities();
        if ( q != 0 )
        {
            poss.clear();
        }
        setGroup();
    }


    public void setValue( int x )
    {
        value = x;
    }


    public void setGroup()
    {
        // SET GROUP USING ROW AND COLUMN
    }


    public int getValue()
    {
        return value;
    }


    public int getRow()
    {
        return r;
    }


    public int getCol()
    {
        return c;
    }


    public int getGroup()
    {
        return group;
    }


    public Possibilities getPoss()
    {
        return poss;
    }


    public static void main( String[] args )
    {

    }
}
