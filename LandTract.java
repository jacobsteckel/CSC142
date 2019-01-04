/*
Jake Steckel
Lab 4
*/
public class LandTract
{
   private double length;
   private double width;
   
   //constructors
   public LandTract()
   {
      length = 0.0;
      width = 0.0;
   }
   public LandTract(double length, double width)
   {
      this.length=length;
      this.width=width;
   }
   //getters
   public double getWidth()
   {
      return width;
   }
   public double getLength()
   {
      return length;
   }
   //setters
   public void setLength(double length)
   { 
      this.length = length;
   }
   public void setWidth(double width)
   {
      this.width = width;
   }
   //calculate area
   public double getArea()
   {
      return length * width;
   }
   //equals method
   public boolean equals(LandTract land)
   {
      return(length*width==land.getArea());  
   }
   //to string
   public String toString()
   {
      String string = "Land Area: " + getArea();
      return string;
   }
}