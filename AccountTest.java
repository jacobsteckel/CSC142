/*
Jacob Steckel
CSC142-02
Assignment 1
*/

public class AccountTest
{
   public static void main (String[]args)
   {
      Account a = new Account();
      
      a.setId(1122);
      a.setBalance(20000);
      a.setAnnualInterestRate(4.5);
      
      a.withdraw(2500);
      a.deposit(3000);
      
      //date created
      System.out.println("Date Created: "+a.getDateCreated());
      System.out.println("Balance: $"+a.getBalance());
      System.out.println("Monthly Interest Rate: "+a.getMonthlyInterestRate()+"%");
   }
}