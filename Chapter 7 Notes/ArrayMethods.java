import java.util.Arrays;

public class ArrayMethods
{
   private int[] values;
   public ArrayMethods(int[] initialValues)
   {
      this.values = initialValues;
   }
   public void printArray()
   {
      System.out.println(Arrays.toString(this.values));
   }
   public void swapFirstAndLast()
   {
      values[0] ^= values[values.length - 1];
      values[values.length - 1] ^= values[0];
      values[0] ^= values[values.length - 1];
   }
   public void shiftRight()
   {
      for (int i = 0; i < values.length; i++)
          
      }
   }

   public static void main( String[] args )
   {
      int[] testValues = { 3, 5, 6, 1 /* add your own values */ };
      ArrayMethods tester = new ArrayMethods( testValues );
      tester.printArray();
      tester.swapFirstAndLast();
      tester.printArray();
   }
}