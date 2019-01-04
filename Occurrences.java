/*
Jacob Steckel
CSC142-02
Lab 2
*/
import java.util.Scanner;

public class Occurrences
{
  public static void main(String args[])
  {
      int[] numbers = new int[100];
      arrayOccurrences(numbers);
  }
  
  public static void arrayOccurrences(int[]nums)
  {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter integers between 1-100 (type 0 to end inputs): ");
    int num = 1;
    for(int i = 1; i < nums.length-1; i++)
    {
      if(i>0)
      {
         num=kb.nextInt();
      }
      if(num>0)
      {
         nums[num-1]++;
         if(nums[num-1]>1)
            System.out.println(num+" occurs "+nums[num-1]+" times ");
         else
            System.out.println(num+" occurs "+nums[num-1]+" time ");
      }
      else
      { 
         System.exit(0);
      }
    }          
  }
}
//complete