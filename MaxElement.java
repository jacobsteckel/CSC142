/*
Jake Steckel
Lab 5
*/
public class MaxElement
{
   public static void main(String[] args)
	{
		// Create an array to test the method.
		int[] numbers = { 2, 12, 1999, 99, 100, 4, 7, 300 };
		
		// Display the largest value in the array.
		System.out.println("The largest value in the array is " +
		                   maxElement(numbers, 0)); 
	}
 
 	public static int maxElement(int[] array, int start)
	{
		int maxRemaining;
      
      if (start<array.length-1) 
      {
         maxRemaining=Math.max(array[start],maxElement(array,start+1));
      } 
      else 
      {
         maxRemaining=array[array.length-1];
      }
      return maxRemaining;
	}
}
//complete