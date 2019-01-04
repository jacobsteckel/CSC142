/*
Jake Steckel
Lab 5
*/
public class RecursiveMultiplication
{
   public static int multiply(int x, int y) 
   { 
      int sum; 
      if (y == 1) 
      { 
          sum=x; 
      } 
      else 
      { 
          sum=x+multiply(x, y-1);
      } 
      return sum; 
    } 
   
   public static void main (String[]args)
   {
      System.out.println(multiply(6,6));
   }
}
//complete