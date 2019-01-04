import java.util.Scanner;
/*
An exercise of using methods
Jacob Steckel 
CSC 142-02
*/

public class MethodExercise 
{
	/**main method */
	public static void main (String[] args) 
   {
		double num1, num2, num3, avg, max;
		boolean isTriangle;
		
		//Get input for the three numbers
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");		
		num1 = kb.nextDouble();
		
		System.out.print("Enter the second number: ");
		num2 = kb.nextDouble();
		
		System.out.print("Enter the third number: ");
		num3 = kb.nextDouble();
			
		//Call calcAverage method 
		avg=calcAverage(num1,num2,num3);
		
		//Output the result
		System.out.println("The average of the three numbers is " + avg);
		
		//Call findMax method
		max=findMax(num1,num2,num3);
      
		//Output max
		System.out.println("The maximum number of the three numbers is " + max);
		
		//Call sort method
		sortMethod(num1,num2,num3);

		//Call isValidTriangle method
		if (isValidTriangle(num1,num2,num3))
		  System.out.println("It is a valid triangle");
		else
		  System.out.println("It is not a valid triangle");
	
	} //end main

	/**Method calcAverage: calculates and returns the average of the three numbers*/
	public static double calcAverage(double n1, double n2, double n3)
   {
      return (n1+n2+n3)/3;
   }
   
	/**Method findMax: finds and returns the maximum number among the three numbers*/
	public static double findMax(double n1, double n2, double n3)
   {
      if((n1>=n2)&&(n1>=n3))
         return n1;
      else if ((n2>=n1)&&(n2>=n3))
         return n2;
      else
         return n3;
   }
	
	/**Method sort: sorts and displays the three numbers in increasing order*/
	public static void sortMethod(double n1,double n2, double n3)
   {
      if(n1>n2&&n2>n3)
         System.out.println(n3+" "+n2+" "+n1);
      else if (n2>n1&&n1>n3)
         System.out.println(n3+" "+n1+" "+n2);
      else if(n1>n3&&n3>n2)
         System.out.println(n2+" "+n3+" "+n1);
      else if(n2>n3&&n3>n1)
         System.out.println(n1+" "+n3+" "+n2);
      else if(n3>n1&&n1>n2)
         System.out.println(n2+" "+n1+" "+n3);
      else if(n3>n2&&n2>n1)
         System.out.println(n1+" "+n2+" "+n3);
   }
		
	/**Method isValidTriangle: determines if the three numbers (representing three edges)
	   can form a valid triangle*/
   public static boolean isValidTriangle(double n1,double n2,double n3)
   {
      if((n1*n1+n2*n2==n3*n3)||
         (n2*n2+n3*n3==n1*n1)||
         (n3*n3+n1*n1==n2*n2)||
         (n1==n2&&n2==n3))
         return true;
      else
         return false;
   }
   
} //end class



/*
fix isValidTriangle
complete Sort method
*/