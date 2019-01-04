/*
Jake Steckel
Lab 4
*/

public class BankAccount
{
   private double balance;  
       
   public BankAccount()
   {
      balance= 0.0;
   }
   public BankAccount(double startBalance)
   {
      balance = startBalance;
   }

   public BankAccount(String str)
   {
      balance = Double.parseDouble(str);
   }
   
   public BankAccount(BankAccount bal)
   {
      balance = bal.balance;
   }

   public void deposit(double amount)
   {
      balance += amount;
   }

   public void deposit(String str)
   {
      balance += Double.parseDouble(str);
   }

   public void withdraw(double amount)
   {
      balance -= amount;
   }

   public void withdraw(String str)
   {
      balance -= Double.parseDouble(str);
   }

   public void setBalance(double b)
   {
      balance = b;
   }

   public void setBalance(String str)
   {
      balance = Double.parseDouble(str);
   }
   
   public double getBalance()
   {
      return balance;
   }
   
   public String toString()
   {
      String str = "Balance: " + balance;
      
      return str;
   }
 
   public boolean equals(BankAccount bal)
   {
      return balance == bal.balance;
   }
}
