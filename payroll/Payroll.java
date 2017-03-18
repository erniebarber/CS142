/*
The excersize was create a class file with two consuctors with
ability to set/get methods for various payroll fields including an
overtime method.
 
Ernie Barber
eb881047@wcupa.edu
CS142
Spring 2017
*/

public class Payroll
{
  //fields
  private String empName;
  private int empNum;
  private double hourlyRate;
  private double hoursWorked;
  private double overTime;
  
  //constructor-default 
  public Payroll()
  {
    empName = null;
    empNum = 0;
    hourlyRate = 0;
    hoursWorked = 0; 
    overTime = 0;
  }
  
  //constructor-overloaded
  public Payroll(String name, int idNum, double rate, double hours, double OT)
  {
    empName = name; 
    empNum = idNum;
    hourlyRate = rate;
    hoursWorked = hours;
    overTime = OT;
  }

  //Set methods
  public void setEmployeeName(String name)
  {
    empName = name;
  }
  
  public void setEmployeeNum(int idNum)
  {
    empNum = idNum;
  }
  
  public void setHourlyRate(double rate)
  {
    hourlyRate = rate;
  }
  
  public void setHoursWorked(double hours)
  {
    hoursWorked = hours;
  }
  
  //Get methods
  public String getEmployeeName()
  {
    return empName;
  }

  public int getEmployeeNum()
  {
    return empNum;
  }
  
  public double getHourlyRate()
  {
    return hourlyRate;
  }
  
  public double getHoursWorked()
  {
    return hoursWorked;
  }
  
  public double getPay()
  {
    return hoursWorked * hourlyRate;
  }
   
  public double getOverTime()
  {
    if (hoursWorked > 40)
       {
         overTime = (hoursWorked - 40) * (hourlyRate * 1.5);
       }
    return overTime;
  }
}