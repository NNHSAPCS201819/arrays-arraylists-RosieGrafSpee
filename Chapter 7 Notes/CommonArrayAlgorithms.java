import java.util.Arrays;

public class CommonArrayAlgorithms
{
    /*
     * Create array of the specified size filled with
     *      random values based on the maximum value.
     */
    public static int[] createRandomArray( int length, int maxValue )
    {
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
        }
        
        return randomArray;
    }
    
    /*
     * Prints the specified array to System.out
     */
    public static void printArray( int[] array )
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i] + "\n");
        }
        System.out.println( Arrays.toString( array ));
    }
    
    /*
     * Array Algorithm #1: Sum and Average
     *  creates an array filled with random numbers
     *  calculates the sum and average of the numbers
     *  prints the array and the sum and average
     *  @returns the average
     */
    public static void sumAndAverage()
    {
        double sum = 0;
        double average = 0;
        int count = 0;

        int[] array = createRandomArray( 10, 50 );

        for( int i = 0; i < array.length; i++ )
        {
            sum += array[ i ];
            count++;
        }

        average = sum / count;
        
        printArray( array );
        System.out.println( "sum: " + sum + " average: " + average );
    }

    /*
     * Array Algorithm #2: Print Element Separators
     *  creates an array filled with random numbers
     *  prints each element of the array with a '|' between each element
     *      but not at the beginning or end of the array
     */
    public static void printElementSeparators()
    {
        int[] ranArr = createRandomArray(10, 10);
        for (int i = 0; i < ranArr.length; i++)
        {
            System.out.println(ranArr[i] + "|");
        }
    }

    /*
     * Array Algorithm #3: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index
     */
    public static void linearSearch( int valueToFind )
    {
        String[] ranArr = new String[100];
        for (int i = 0; i < ranArr.length; i++)
        {
            
        }
    }

    /*
     * Array Algorithm #4: Swap Elements
     *  creates an array filled with random numbers
     *  prints the array
     *  swaps the elements at the two specified indexes
     *  prints the array
     */
    public static void swapElements( int index1, int index2 )
    {
    }

    /*
     * Array Algorithm #5.1: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax() 
    {
    }

    /*
     * Array Algorithm #5.2: findMin
     *  creates an array filled with random numbers
     *  prints the array and the least number
     */
    public static void findMin()
    {
    }

    /*
     * Array Algorithm #6: Copying Arrays
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array in reverse order
     *  prints the original array and the new array
     *  returns the new array
     */
    public static int[] copyArray()
    {
        return null;
    }
    
    public static void thing()
    {
        int[] x = { 8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println(x.length);
        System.out.println(x[0]);
        System.out.println(x[x.length-1]);  
        for (int i = 0; i < x.length; i++)
        {
            System.out.print(x[i] + " ");
        }
        
        System.out.println("");
        for (int i = 0; i < x.length; i++)
        {
            System.out.print(i + ": " + x[i] + " ");
        }
        
        System.out.println("");
        for (int i = x.length - 1; i > -1; i--)
        {
            System.out.print(i + ": " + x[i] + " ");
        }
        
        for (int i : x)
        {
            System.out.println(i);
        }
    }

}