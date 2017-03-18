/*This program finds highest and lowest
values in an int []array by checking the
index with a for loop.

Ernie Barber  
CS142
Spring 2017
*/

public class ArrayHighLowVals
{
   public static void main(String[] args)
   {
   //vars
   int[]array1 = {1,88,4,3,-701,9,200};
   int highVal = array1[0];
   int lowVal = array1[0];
   
   //methods
   highValue(array1, highVal);
   lowValue(array1, lowVal);
   }
   
   public static int highValue(int []array1, int highVal)
   {
   //loop thru each index for highest value
   for (int i=0; i < array1.length; i++)
      {
         if (array1[i] > highVal)
            {
            highVal = array1[i];
            }
      }
   System.out.println("The highest value is " + highVal);
   return highVal;   
   }
   
   //Loop thru each index to find the lowest value
   public static int lowValue(int []array1, int lowVal)
   {
   for (int i = 0; i < array1.length; i++)
      {
         if (array1[i] < lowVal)
            {
            lowVal = array1[i];
            }
      }
   System.out.println("The lowest value is " + lowVal);
   return lowVal; 
   }
   
}
