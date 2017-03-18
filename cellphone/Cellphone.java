
/*
class file for Wireless Solutions excersize.
This file is tested by CellphoneDemo.java

Ernie Barber
CS142
Spring 2017
*/
public class Cellphone
{ 
  //fields
  private String manufacturer;
  private String color;
  private String model;
  private double macID;
  private double phoneNum;
  
  //Arg constructor
  public Cellphone(String m, String c, String mod, double ID, double ph)
  {
  manufacturer = m;
  color = c;
  model = mod;
  macID = ID;
  phoneNum = ph;
  }
  
  //default constructor
  public Cellphone( )
  {
  manufacturer = "Apple";
  color = "white";
  model = "Iphone 6";
  macID = 123456;
  phoneNum = 4844448888L;
  }
  
  //set methods for fields
  public void setManufacturer(String manuf)
  {
  manufacturer = manuf;
  }
   
  public void setColor(String col)
  {
  color = col;
  }
  
  public void setmodel(String mod)
  {
  model = mod;
  }
  
  public void setMacId(double IDnum)
  {
  macID = IDnum;
  }
  
  public void setPhoneNum(double phon)
  {
  phoneNum = phon;
  }
  
  //get methods for fields
  public String getManufacturer()
  {
  return manufacturer;
  }
  
  public String getColor()
  {
  return color;
  }
  
  public String getModel()
  {
  return model;
  }
  
  public double getMacId()
  {
  return macID;
  }
  
  public double getPhoneNum()
  {
  return phoneNum;
  }

}
