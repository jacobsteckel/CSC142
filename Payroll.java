/*
Jacob Steckel
CSC142-02
Lab 2
*/

public class Payroll
{
   int [] employeeID = {5658845,4520125,7895122,8777541,8451277,1302850,7580489};
   int [] hours = new int[7];
   double [] payRate = new double[7];
   double [] wages = new double[7];
   
   public void setHours(int index, int hours) 
   { 
      this.hours[index] = hours;
   } 
   
   public void setpayRate(int index, double payRate) 
   { 
      this.payRate[index] = payRate; 
   } 
   
   public void setEmployeeID(int index, int employeeID) 
   { 
      this.employeeID[index] = employeeID; 
   }
    
   public void setWages(int index, double wages) 
   { 
      this.wages[index] = wages; 
   } 
   
   public double getHours(int index) 
   { 
      return hours[index]; 
   } 

   public double getpayRate(int index) 
   { 
      return payRate[index]; 
   } 

   public double getEmployeeID(int index) 
   { 
      return employeeID[index]; 
   } 
      
   public double getWages(int index) 
   { 
      return wages[index]; 
   } 
   
   public void TotalGrossPay () 
   { 
      for (int index = 0; index < employeeID.length; index++ ) 
      { 
         wages[index] = hours[index] * payRate[index]; 
      } 
   }   
}