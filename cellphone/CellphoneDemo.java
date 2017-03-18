/*
This demo program tests the coded Cellphone.java 
class file.

Ernie Barber
CS142
Spring 2017
*/

public class CellphoneDemo
{
  public static void main(String[] args)
  {
  //vars
  String manufacturer;
  String color;
  String model;
  double macID;
  long phoneNum;
  
  //create a Cellphone object
  Cellphone phone1 = new Cellphone();
  
  //demo each get method 
  System.out.printf("Manufacturer: %s%n", phone1.getManufacturer());
  System.out.printf("Color: %s%n", phone1.getColor());
  System.out.printf("Model: %s%n", phone1.getModel());
  System.out.printf("MacID: %10.0f%n", phone1.getMacId());
  System.out.printf("PhoneNum: %10.0f%n", phone1.getPhoneNum());
  
  //set and test a new color on phone1
  phone1.setColor("green");
  System.out.printf("Color: %s%n", phone1.getColor());
  
  //set and test a phone number on phone1
  phone1.setPhoneNum(5555551212L);
  System.out.printf("PhoneNum: %10.0f%n", phone1.getPhoneNum());
  }
}   
