/*
An exercise on method overloading
Jacob Steckel 
CSC 142-02
*/
import java.util.Scanner; 

public class AverageOverloading 
{
	public static void main(String[] args) 
   {
		//call the overloading methods respectively
      double num1,num2,num3,num4;
      Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");		
		num1 = kb.nextDouble();
		System.out.print("Enter the second number: ");
		num2 = kb.nextDouble();
      System.out.print("Enter the third number: ");
		num3 = kb.nextDouble(); 
      System.out.print("Enter the fourth number: ");
		num4 = kb.nextDouble();
      
      System.out.println("Average of the first two #s: "+averageOfTwo(num1,num2));
      System.out.println("Average of the first three #s: "+averageOfThree(num1,num2,num3));
      System.out.println("Average of the four #s: "+averageOfFour(num1,num2,num3,num4));
	}
	
	/** calculate the average of two doubles */
	public static double averageOfTwo(double n1, double n2)
   {
      return (n1+n2)/2;
   } 
	
   /** calculate the average of three doubles */
	public static double averageOfThree(double n1, double n2, double n3)
   {
      return (n1+n2+n3)/3;
   } 

	/** calculate the average of four doubles */
   public static double averageOfFour(double n1, double n2, double n3, double n4)
   {
      return (n1+n2+n3+n4)/4;
   } 

}