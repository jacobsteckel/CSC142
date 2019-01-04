/*
Jake Steckel
Assignment 4
*/
public class ParkedCarTest
{
   public static void main(String[]args)
   {
      ParkedCar car=new ParkedCar("Lincoln","Zephyr","Maroon","JLS3669",60);
      ParkingMeter meter=new ParkingMeter(60);
      PoliceOfficer officer=new PoliceOfficer("Jones",369);
      ParkingTicket ticket=new ParkingTicket(car,officer,meter.getMins());
                                             
      System.out.println("Reported car");
      System.out.println("Make & Model: "+car.getMake()+", "+car.getModel());
      ticket.calculateFine();     
      System.out.println("Fine: $"+ticket.getFine());                                 
      System.out.println("Reporting Officer: Officer "+officer.getName()+", Badge: "+officer.getBadgeNum());                                     
   }
}   