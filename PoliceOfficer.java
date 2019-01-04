/*
Jake Steckel
Assignment 4
*/
public class PoliceOfficer
{
   String name;
   int badgeNum;
   
   public PoliceOfficer(String n,int bn)
   {
      name=n;
      badgeNum=bn;
   }
   public PoliceOfficer(PoliceOfficer officer2)
   {
   
   }
   
   public ParkingTicket patrol(ParkedCar car, ParkingMeter meter, PoliceOfficer officer)
   {
      ParkingTicket ticket;
      if((car.getMinutes()-meter.getMins())>0)
      {
         ticket = new ParkingTicket(car,officer,meter.getMins());
         return ticket;
      }   
      else
         return null;
   }
   
   public String getName()
   {
      return name;
   }
   public void setName(String n)
   {
      name=n;
   }
   
   public int getBadgeNum()
   {
      return badgeNum;
   }
   public void setBadgeNum(int bn)
   {
      badgeNum=bn;
   }   
   
   public String toString()
   {
      return "Officer "+getName()+" , Badge Number: "+getBadgeNum();
   }   
}
