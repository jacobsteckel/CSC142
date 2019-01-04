/*
Jake steckel
Assignment 5
*/

public class RecursionAssignment
{
   public static double method(int i) 
   {
      if (i < 1) 
         return 0;
      return (i / (i + 1.0) + method(i - 1));
   }

   public static void main(String[] args) 
   {
      System.out.println("i"+"\t"+"m(i)");
      System.out.println("-----------");

      for( int i=0; i < 21; i++)
      {
        double value = method(i);
        System.out.println( i +" \t"+ value+ "\n");
      }
   }
}