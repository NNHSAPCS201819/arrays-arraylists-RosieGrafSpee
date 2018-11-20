
/**
 * Write a description of class Notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Notes
{
    public static void CreatEvenArray()
    {
        int[] evens = new int[123];
        
        for (int i = 0; i < evens.length; i++)
        {
            evens[i] = 2 * i + 2;
        }
        
        for (int i = 0; i < evens.length; i++)
        {
            System.out.println(evens[i]);
        }
        
        System.out.println(evens);
    }
    
    public static void iotaT50()
    {
        int[] list = new int[5];
        for (int i = 0; i < 5; i++)
        {
            list[i] = (i + 1) * 10;
        }
    }
}
