import java.util.Scanner;
public class Circle
{   
   static double radius;
   static double Pi=3.14159;
   public Circle()
   {
   
   }
   
   public Circle(double r)
   {
      radius=r;
   }
   
   public static void setRadius(double inR)
   {
      radius=inR;
   }
   
   public static double getRadius()
   {
      return radius;
   }
   
   public static double getArea()
   {
      return Pi*(radius*radius);
   }
   
   public static double getCircumference()
   {
      return 2*Pi*radius; 
   }
}