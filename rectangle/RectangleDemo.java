public class RectangleDemo
{
   public static void  main(String[] args)
   {
    
    Rectangle r1 = new Rectangle ();
    Rectangle r2 = new Rectangle ();
    
    r1.setLength(5.0);
    r1.setWidth(6.0);
    
    r2.setLength(3.0);
    r2.setWidth(4.0);
    
    //display results
    System.out.println("The length for R1 is "+r1.getLength());
    System.out.println("The width for R1 is "+r1.getWidth());
    System.out.println("The area for R1 is "+r1.getArea());
    
    
    System.out.println("The length for R2 is "+r2.getLength());
    System.out.println("The width for R2 is "+r2.getWidth());
    System.out.println("The area for R2 is "+r2.getArea());
    }
}