/*Homework1 was to connect to and sort
a provided file called number.txt.  The totals asked
for were: total of all numbers, number of numbers, number of evens
number of odds, average of all numbers, average of evens and 
average of odds. 

Ernie Barber 
CS142
Spring 2017
*/

import java.util.Scanner;
import java.io.*;

public class Homework1
{
   public static void main(String[] args) throws IOException
   {
   //vars
   double recordTot = 0;
   double numberTot = 0;
   double evenNums = 0;
   double evenTot = 0;
   double oddNums = 0;
   double oddTot = 0;
   double evenAvg =0;
   double oddAvg =0;
   double totalAvg = 0;
   
   //create a file object and connect to input file
   File f = new File("number.txt"); 
   Scanner numFile = new Scanner(f);
   while(numFile.hasNext())
   {
     String readNum = numFile.nextLine();
     int number = checkInput(readNum, numberTot);
     if (number % 2 == 0)//sort even odd numbers - add to totals
       {
         evenNums++;
         evenTot+=number;
       }
     else 
       {
         oddNums++;
         oddTot+=number;
       }
     recordTot++;  
     numberTot+=number; 
   } 
   totalAvg = calcTotalAvg(recordTot, numberTot); 
   evenAvg = calcEvenAvg(evenTot, evenNums);
   oddAvg = calcOddAvg(oddTot, oddNums);
   displayResults(recordTot, evenNums, oddNums, totalAvg, oddAvg, evenAvg);
   numFile.close();
   }
   
   //Convert String input to Int
   public static int checkInput(String readNum, double recordTot)
   {
   if (readNum.isEmpty())
     {
       System.out.println("error: program failed while processing "
                           + " the input file at line number " + recordTot);
     }
   int number = Integer.parseInt(readNum); 
   return number;
   }
   
   //calc avg of all numbers
   public static double calcTotalAvg(double recordTot, double numberTot)
   {
     double totalAvg = (numberTot / recordTot);
     return totalAvg;
   }
   
   //calc avg even numbers
   public static double calcEvenAvg(double evenTot, double evenNums)
   {
     double evenAvg = (evenTot / evenNums);
     return evenAvg;
   }

   //calc avg odd numbers
   public static double calcOddAvg(double oddTot, double oddNums)
   {
     double oddAvg = (oddTot / oddNums);
     return oddAvg;
   }
   
   //specific output format required: 
   public static void displayResults(double recordTot, double evenNums, double oddNums,
                                     double totalAvg, double oddAvg, double evenAvg)
   {
     System.out.println("Student Name: " + "Ernie Barber");
     System.out.println("Email: " + "eb881047@wcupa.edu");
     System.out.printf("There are %.0f numbers in the file.%n", recordTot);
     System.out.printf("There are %.0f even numbers in the file.%n", evenNums);
     System.out.printf("There are %.0f odd numbers in the file.%n", oddNums);
     System.out.printf("The total average value is: %.2f.%n", totalAvg);
     System.out.printf("The odd number average is: %.2f.%n", oddAvg);
     System.out.printf("The even number average is: %.2f.%n", evenAvg);
   }
}
