/*
Jake Steckel
Lab 4
*/

public class RoomDimension
{
   private double length;
   private double width;
   //constructors
   public RoomDimension(RoomDimension d) 
   {
      length=d.length;
      width=d.width;
   }
   public RoomDimension(double width, double length)
   {
      this.width = width;
      this.length = length;
   }
   //getters
   public double getLength()
   {
      return length;
   }
   public double getWidth()
   {
      return width;
   }
   //calculate area
   public double getArea()
   {
      return length * width;
   }
   //toString
   public String toString()
   {
      String string="Length: "+length+" Width: "+width+" Area: "+getArea();
      return string;
   }
}

