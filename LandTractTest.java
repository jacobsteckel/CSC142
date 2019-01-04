/*
Jake Steckel
Lab 4
*/
import java.util.Scanner;

public class LandTractTest
{
   //MAIN CLASS
   public static void main(String[] args)
   {
      double length;
      double width;
      Scanner kb=new Scanner(System.in);
      //get length land 1
      System.out.print("length of tract 1: ");
      length = kb.nextDouble();
      //get width land 1
      System.out.print("width of tract 1: ");
      width = kb.nextDouble();
      //declare land 1
      LandTract one = new LandTract(length, width);
      //get length land 2
      System.out.print("length of tract 2: ");
      length = kb.nextDouble();
      //get width land 2
      System.out.print("width of tract 2: ");
      width = kb.nextDouble();
      //declare land 2
      LandTract two = new LandTract(length, width);
      //test to string methods
      System.out.println(one);
      System.out.println(two);
      //test equals method
      if(one.equals(two))
         System.out.println("areas are equal");
      else
         System.out.println("areas not equal");
   }
}