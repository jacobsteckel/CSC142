/*
Jake Steckel
Lab 4
*/
public class Odometer
{
   private double miles;
   private FuelGauge gauge;
   public final double MAX_MILEAGE=999999.0;
   public final double MPG=24.0;
   
   //constructor
   public Odometer(double miles)
   {
      this.miles=miles; 
   }
   //get miles
   public double getMileage()
   {
      return miles;
   }
   //set miles
   public void setMileage(double miles)
   {
      this.miles=miles;
   }
   //increment
   public void incrementMileage()
   {
      if(miles<MAX_MILEAGE)
         miles++;
      else
         miles=0;
   }
}