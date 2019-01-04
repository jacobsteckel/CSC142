/*
Jacob Steckel
CSC142-02
Lab 2
*/

public class Rainfall
{
   double[] rainfalls = new double [12];
   
   public Rainfall()
   {
   
   }
   public Rainfall(double[]r)
   {
      rainfalls=r;
   }
   
   public double total()
   {
      double total=0;
      for(int i=0;i<rainfalls.length;i++)
         total+=rainfalls[i];
      return total;
   }
   
   public double monthlyAvg()
   {
      double avg=total()/12;
      return avg;
   }
   
   public double findMostRainfall()
   {
      double max=rainfalls[0];
      for(int i=0;i<rainfalls.length;i++)
      {
         if(rainfalls[i]>max)
         max=rainfalls[i];
      }
      return max;
   }
   
   public double findLeastRainfall()
   {
      double min=rainfalls[0];
      for(int i=0;i<rainfalls.length;i++)
      {
         if(rainfalls[i]<min)
         min=rainfalls[i];
      }
      return min;
   }
}
//complete