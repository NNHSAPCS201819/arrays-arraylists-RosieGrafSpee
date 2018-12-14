
/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
    // instance variables - replace the example below with your own
    private int x, y;

    /**
     * Constructor for objects of class Location
     */
    public Location(int x, int y)
    {
        // initialise instance variables
        this.x = x; this.y = y;
    }   

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getRow()
    {
        return this.x;
    }
    
    public int getCol()
    {
        return this.y;
    }
}
