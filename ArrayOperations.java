/*
Jacob Steckel
CSC 142
Lab 3
*/

public class ArrayOperations
{
   public static void main(String[]args)
   {
      int[]array={1,2,3,4,5};
      System.out.println(""+getTotal(array));
      System.out.println(""+getAverage(array));
      System.out.println(""+getHighest(array));
      System.out.println(""+getLowest(array));
   }
   
   public static int getTotal(int[]a)
   {
      int total=0;
      for(int i=0;i<a.length;i++)
      {
         total+=a[i];
      }
      return total; 
   }
   
   public static double getAverage(int[]a)
   {
      double average=0;
      for(int i=0;i<a.length;i++)
      {
         average+=a[i];
      }
      average=average/a.length;
      return average;
   }
   
   public static int getHighest(int[]a)
   {
      int highest=a[0];
      for(int i=0;i<a.length;i++)
      {
         if(a[i]>highest)
            highest=a[i];
      }
      return highest;
   }
   
   public static int getLowest(int[]a)
   {
      int lowest=a[0];
      for(int i=0;i<a.length;i++)
      {
         if(a[i]<lowest)
            lowest=a[i];
      }
      return lowest;
   }
}