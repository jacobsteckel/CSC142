/*
Jacob Steckel
CSC142-02
Lab 2
*/

import java.util.Scanner;

public class DistinctNumbers
{
   public static void main (String[]args)
   {
      Scanner kb = new Scanner(System.in);
   
      int [] numbers = new int[10];
      
      System.out.print("Enter ten numbers: ");
      for(int i=0; i<numbers.length;i++)
      {
         numbers[i]=kb.nextInt();
      }
      System.out.print("The distinct numbers are:");
      System.out.print(" "+saveDistinctNumbers(numbers));
   }
   
   public static int[] saveDistinctNumbers(int[] numbers)
   {     
      selectionSort(numbers);
      for (int i=0;i<numbers.length+1;i++)
      {
         if(!(numbers[i]==numbers[i+1]))
            System.out.print(numbers[i] + " ");
      }
      return numbers; 
   }
   
   public static void selectionSort(int[] array)
   {
      int start, index, minIndex, minValue;
         
      for (start = 0; start < (array.length-1); start++) 
      {
         minIndex = start;
         minValue = array[start];
         for(index = start + 1; index < array.length; index++)
         {
            if (array[index] < minValue)
            {
               minValue = array[index];
               minIndex = index;
            }
         }
         array[minIndex] = array[start];
         array[start] = minValue;
      }
   }

}