/*
Jacob Steckel
CSC142-02
Assignment 1
*/
import java.util.Date;

public class Account
{
   //data required
   int id=0;
   double balance=0;
   double annualInterestRate=0;
   Date dateCreated=new Date();
   
   //constructor
   public Account()
   {
      
   }
   
   //ID
   public int getId()
   {
      return id;
   }
   public void setId(int ID)
   {
      id=ID;
   }
   
   //balance
   public double getBalance()
   {
      return balance;
   }
   public void setBalance(double b)
   {
      balance=b;
   }
   
   //annual interest rate
   public double getAnnualInterestRate()
   {
      return annualInterestRate;
   }
   public void setAnnualInterestRate(double AIR)
   {
      annualInterestRate=AIR;
   }
   
   //date created
   public Date getDateCreated()
   {
      return dateCreated;
   }
   
         
   //monthly interest rate
   public double getMonthlyInterestRate()
   {
      return annualInterestRate/12;
   }
   
   //withdraw
   public void withdraw(double wd)
   {
      balance-=wd;
   }   
   
   //deposit    
   public void deposit(double dp)
   {
      balance+=dp;
   }   
     
}