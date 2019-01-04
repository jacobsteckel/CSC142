/*
Jake Steckel
Lab 4
*/

import java.util.Scanner;

public class CarpetCalculator
{
   //MAIN CLASS
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      double length;
      double width;
      double area;
      double cost;
      //get length
      System.out.print("length: ");
      length = kb.nextDouble();
      //get width
      System.out.print("width: ");
      width = kb.nextDouble();
      //get cost
      System.out.print("cost/square foot: ");
      cost = kb.nextDouble();
      kb.close();
      RoomDimension dimensions = new RoomDimension(width,length);
      RoomCarpet carpet = new RoomCarpet(dimensions,cost);
      carpet.setCarpetCost(cost);
      System.out.println(dimensions);
      System.out.println(carpet);
         
   }
}