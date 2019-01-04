/*
Jake Steckel
Lab 4
*/
public class FuelGauge
{
   final double MAX_FUEL = 15.0;
   private double fuel;
   
   //constructor
   public FuelGauge(double f)
   {
      if(f<=MAX_FUEL)
         fuel=f;
      else
         fuel=MAX_FUEL;
   }
   //get fuel
   public double getFuel()
   {
      return fuel;
   }
   //set fuel
   public void setFuel(double f)
   {
      fuel=f;
   }
   //increment
   public void incrementFuel()
   {
      if(fuel<MAX_FUEL)
         fuel++;
   }
   //decrement
   public void decrementFuel()
   {
      if(fuel>0)
         fuel--;
   }
}
   