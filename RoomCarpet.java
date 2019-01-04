/*
Jake Steckel
Lab 4
*/

public class RoomCarpet
{
   private RoomDimension dimensions;
   private double cost;
   //constructor
   public RoomCarpet(RoomDimension d, double c)
   {
      cost=c;
      dimensions=new RoomDimension(d);
   }
   //getter
   public double getCarpetCost()
   {
      return cost;
   }
   //setter
   public void setCarpetCost(double c)
   {
      c=cost;
   }
   //calculate total
   public double getTotal()
   {
      return dimensions.getArea()*cost;
   }
   //toString
   public String toString()
   {
      String string="Carpet Cost: "+getTotal();
      return string;
   }
}