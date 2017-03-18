/*This program tests the PayRoll class file 
file I wrote including two constructors, set/get methods
for various payroll fields and the overtime method.
 
Ernie Barber
eb881047@wcupa.edu
CS142 
Spring 2017
*/

//Ernie Barber

public class PayRollDemo
{
   public static void main(String[] args)
   {
   //create two new objects    
   Payroll pay1 = new Payroll();
   //create an object using the overloaded constructor
   Payroll pay2 = new Payroll("Ernie Barber", 736378, 40.65, 30, 0);
  
   //set fields in the default constructor
   pay1.setEmployeeName("Tom Jones");
   pay1.setEmployeeNum(162728);
   pay1.setHourlyRate(34.78);
   pay1.setHoursWorked(34);
  
   //Modify data to test the overtime method
   pay2.setHoursWorked(50);
  
   //test pay1 object 
   System.out.println("The name of employee record pay1 is " + pay1.getEmployeeName());
   System.out.println("The employee # record pay1 is " + pay1.getEmployeeNum());
   System.out.println("The hourly rate of pay1 is " + pay1.getHourlyRate());
   System.out.println("The hours worked of employee pay1 is " + pay1.getHoursWorked());
   System.out.println("The pay of record pay1 is " + pay1.getPay());
   System.out.println("");

   //test pay2 object
   System.out.println("The name of employee record pay2 is " + pay2.getEmployeeName());
   System.out.println("The employee # record pay2 is " + pay2.getEmployeeNum());
   System.out.println("The hourly rate of pay2 is " + pay2.getHourlyRate());
   System.out.println("The hours worked of employee pay2 is " + pay2.getHoursWorked());
   System.out.println("The pay of record pay2 is " + pay2.getPay());
   System.out.println("The OT pay of record pay2 is " + pay2.getOverTime());
   }
}
