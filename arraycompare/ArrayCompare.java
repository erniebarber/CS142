//This program comapres two arrays
//for equality.

//Ernie Barber CS142

public class ArrayCompare
{
   public static void main(String[] args) 
   {
   //int []array1= {1,2,3,4,5};
   //int []array2= {1,2,3,4,5};
   int []array1= {1,2,3,4,8};
   int []array2= {1,2,3,4,5,6,7};

   boolean arrayEqual = true;
   
   if (array1.length != array2.length)
      {
         arrayEqual = false;
      }   
   
   if (compare(array1, array2))
      {
         System.out.println("The two arrays are the same");
      }
   else
      {
         System.out.println("The two arrays are not the same");
      }
   
   }
   
   public static boolean compare(int[]array1,int[]array2)
   {
      boolean arrayEqual= true;
      for (int i=0; i<array1.length; i++)
         {
            if (array1[i]!= array2[i])
               {
               arrayEqual = false;
               }
         }
   return arrayEqual;
   }
 }  