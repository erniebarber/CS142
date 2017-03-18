/*
This assignment: given a specific output
as a demo file called HW2tester.java.  You had 
to write the class file to make the tester file work
properly.
 
Ernie Barber
eb881047@wcupa.edu
CS142
Spring 2017
*/

public class Car
{
  //fields
  private String brand;
  private int year;    
  private int price;
  private static int number = 0; //make static to track instances of Car()objects
  
  //overloaded constructor    
  public Car(String carBrand, int carYear, int carPrice)
  {
    number++;
    brand = carBrand;
    year = carYear;
    price = carPrice; 
    getNumber();
  }
  
  //no arg constructer
  public Car()
  {
    number++;
    brand = "Chevy";
    year = 2005;
    price = 3000;
    getNumber();
  }
  
  //set methods 
  public void setPrice(int carPrice)
  {
    price = carPrice;
  }
   
  public void setYear(int carYear)
  {
    year = carYear;
  }
   
  public void setBrand(String carBrand)
  {
    brand = carBrand;
  }
  
  //get methods 
  public int getNumber()
  {
    //returns object instances needed for HW: "static int number"
    return number;
  }
  
  public String getBrand()
  {
    return brand;  
  }
   
  public int getYear()
  {
    return year;  
  }
  
  public int getPrice()
  {
    return price; 
  }
 
}