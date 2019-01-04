/*
Jake Steckel
Assignment 4
*/
public class ParkingTicket
{
   ParkedCar car;
   PoliceOfficer officer;
   double fine;
   int minutes;
   double BASE_FINE=25.0;
   double HOURLY_FINE=10.0;
   
   public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int mins)
   {
      car=new ParkedCar(aCar);
      officer=new PoliceOfficer(anOfficer);
      minutes=mins;
   }
   public ParkingTicket(ParkingTicket ticket2)
   {
   
   }
   
   public void calculateFine()
   {
      fine=0;
      int carMinutes=car.getMinutes();
      if(carMinutes>minutes)
      fine+=BASE_FINE;
      do
      {
         if((carMinutes-60)>minutes)
         fine+=HOURLY_FINE;
         carMinutes-=60;
      }
      while(carMinutes>=60);
   }
   
   public int getMinutes()
   {
      return minutes;
   }
   public void setMinutes(int m)
   {
      minutes=m;
   }
   public double getFine()
   {
      return fine;
   }     
}   
