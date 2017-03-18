/*
A simple script to total an int []array
using a for loop to sum indexes.

Ernie Barber
CS142
Spring 2017
*/

public class ArraySum
{
   public static void main(String[] args)
   { 
   int []array1 = {1,2,3,4,5};
   int sum = 0;
   
   //loop and add each index to sum
   for(int i = 0; i < array1.length; i++)
      {
         sum += array1[i];
      }
      
   System.out.println("The total is " + sum);
   double average = sum / array1.length;
   System.out.println("The average is " + average);
   }
}
