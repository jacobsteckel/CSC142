/*
Jake Steckel
Lab 4
*/

public class BankAccountTest
{
   //MAIN CLASS
   public static void main(String[] args)
   {
      BankAccount account1 = new BankAccount(5.99);
      BankAccount account2 = new BankAccount(account1);
      System.out.println(account1);
      System.out.println(account1.equals(account2));
      if(account1.equals(account2))
         System.out.println("Accounts have the same amount");
      else
         System.out.println("Accounts have different amounts");
      
   }
}