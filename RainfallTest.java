/*
Jacob Steckel
CSC142-02
Lab 2
*/

public class RainfallTest
{
   public static void main (String[]args)
   {
      double[]rains={12,24,26,28,16,10,11,32,8,6,23,18};
      Rainfall rainfall = new Rainfall(rains);
      
      System.out.println("Total rainfall: "+rainfall.total());
      System.out.println("Monthly average rainfall "+rainfall.monthlyAvg());
      System.out.println("Most rainfall: "+rainfall.findMostRainfall());
      System.out.println("Least rainfall: "+rainfall.findLeastRainfall());
   }
}
//complete