/*
Jake Steckel
Assignment 2
csc142-02
*/

import java.util.Scanner;

public class MergeLists
{
   public static void main(String[] args)
   {
      int i, j, a1Length, a2Length;
      Scanner one = new Scanner(System.in);
      System.out.println("What is the length of array 1? ");
      a1Length = one.nextInt();
      int[] list1 = new int[a1Length];
      System.out.println("Enter the values in array 1? ");
      for (i = 0; i < list1.length; i++)
      {
         list1[i] = one.nextInt();
      }
      Scanner two = new Scanner(System.in);
      System.out.println("What is the length of array 2? ");
      a2Length = two.nextInt();
      int[] list2 = new int[a2Length];
      System.out.println("Enter the values in array 2? ");
       for (j = 0; j < list2.length; j++)
      {
         list2[j] = two.nextInt();
      }
      System.out.println("The values in array 1 are: ");
      for (i = 0; i < list1.length; i++)
      {
         System.out.println("" + list1[i]);
      }
      System.out.println("The values in array 2 are: ");
      for (j = 0; j < list2.length; j++)
      {
         System.out.println("" + list2[j]);
      }
      System.out.println("Merged array: ");
      display(merge(list1, list2)); 
   }     
   
   public static int[] merge(int[] list1, int[] list2)
   {
      int[] mergedArrays = new int[list1.length + list2.length];
      int i = 0, x = 0, y = 0;
      while (i < list1.length && x < list2.length)
      {
         if (list1[i] < list2[x])
            mergedArrays[y++] = list1[i++];
            
         else 
            mergedArrays[y++] = list2[x++];
      }
      while (i < list1.length)
      {
         mergedArrays[y++] = list1[i++];
      }
      
      while (x < list2.length)
      {
         mergedArrays[y++] = list2[x++];
      }
      
      return mergedArrays;
   }      
   public static void display(int[] mergedArrays)
   {
      for (int i = 0; i < mergedArrays.length; i++)
      {
         System.out.println("" + mergedArrays[i]);
      }
   }
}  
   
   