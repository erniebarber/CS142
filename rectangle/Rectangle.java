/*
First demo and class file excercise! 

Ernie Barber 
CS142
Spring 2017
*/

public class Rectangle
{
  //fields
   private double length;
   private double width;
   
// java uses a default constructor  
//    public Rectangle(double len, double w)
//    {
//    length = len;
//    width = w;
//    } 
   
   //methods
   public void setLength(double len)
   {
   length = len;
   }

   public void setWidth(double w)
   {
   width = w;
   }

   public double getLength()
   {
   return length;
   }

   public double getWidth()
   {
   return width;
   }

   public double getArea()
   {
   return length * width;
   }

}
