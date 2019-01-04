import java.util.Scanner;
//Jacob Steckel 
//CSC 142-02
public class tempPointTest
{
   public static void main (String[]args)
   {
      int temp;
      temperaturePoint tp=new temperaturePoint();
      Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a temperature: ");
      temp=kb.nextInt();
      
      System.out.println("What will freeze at this temperature? ");
      if(tp.isEthylFreezing(temp))
      System.out.println("Ethyl Alcohol");
      if(tp.isOxygenFreezing(temp))
      System.out.println("Oxygen");
      if(tp.isWaterFreezing(temp))
      System.out.println("Water");
      if(temp>32)
      System.out.println("Nothing");
      
      System.out.println("What will boil at this temperature? ");
      if(tp.isEthylBoiling(temp))
      System.out.println("Ethyl Alcohol");
      if(tp.isOxygenBoiling(temp))
      System.out.println("Oxygen");
      if(tp.isWaterBoiling(temp))
      System.out.println("Water");
      if(temp<-306)
      System.out.println("Nothing");

   }
}