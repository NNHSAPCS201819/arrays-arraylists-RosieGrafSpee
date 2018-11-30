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
      int temp = this.values[values.length - 1];
      for (int i = values.length - 1; i > 0; i--)
      {
          this.values[i] = this.values[i-1];
      }
      this.values[0] = temp;
   }

   public static void main( String[] args )
   {
      int[] testValues = { 3, 5, 6, 1289379284, 38472938, 89723819, 1782641726};
      
      for (int i = 0; i < testValues.length; i++)
      {
          if (testValues[i] % 2 == 0)
          {
              testValues[i] = 0;
          }
      }
      ArrayMethods tester = new ArrayMethods( testValues );
      tester.printArray();
      
      int temp1 = 0, temp2 = 0;
      for (int i = 1; i < testValues.length - 1; i++)
      {
          temp1 = temp2;
          temp2 = testValues[i - 1] > testValues[i + 1] ? testValues[i - 1] : testValues[i + 1];
      }

      tester.printArray();
      tester.swapFirstAndLast();
      tester.printArray();
   }
}