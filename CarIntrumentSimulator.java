/*
Jake Steckel
Lab 4
*/
import java.util.Scanner;

public class CarIntrumentSimulator
{
   //MAIN CLASS
   public static void main(String[] args)
   {
      final double MPG=24.0;
      Scanner kb=new Scanner(System.in);
      double miles;
      double fuel;
      //get miles
      System.out.print("mileage: ");
      miles=kb.nextDouble();
      //get fuel
      System.out.print("fuel in car(Gallons): ");
      fuel=kb.nextDouble();
      //declare fuel gauge
      FuelGauge gauge=new FuelGauge(fuel);
      //declar odemeter
      Odometer mileage=new Odometer(miles);
      
      while(gauge.getFuel()>0)
      {
         mileage.incrementMileage();
         if(mileage.getMileage()%24==0)
            gauge.decrementFuel();
         System.out.println("fuel: "+gauge.getFuel()+" mileage: "+mileage.getMileage());
      }
   }
}