import java.util.Scanner;
import java.io.*;

public class WeeklyHours
{
   public static void main(String[] args)throws IOException
   {
      File file = new File("E:/hours.txt");
      Scanner inputFile = new Scanner(file);
      
      int count=0;
      double hrs[]=new double[count];
      while(inputFile.hasNext())
      {
         count++;
         for(int i=0;i<hrs.length;i++)
         hrs[i]=inputFile.nextInt();
      }
      
      double hours[][]=new double[7][8];
      for(int i=0;i<7;i++)
         for(int p=0;p<8;p++)
            hours[i][p]=hrs[(p*7)+i];

      int[] weeklyHours = new int[hours.length];
      for (int i = 0; i < hours.length; i++)
         for (int j = 0; j < hours[i].length; j++)
         {
            int num = i;
            int[] array = weeklyHours; 
            array[num] = (int)(array[num] + hours[i][j]);
         }
      int[] list = new int[weeklyHours.length];

      sort(weeklyHours, list);

      for (int i = weeklyHours.length - 1; i >= 0; i--)
         System.out.println("Employee " + list[i] + ": " +weeklyHours[i]);
   }

   static void sort(int[] list, int[] index)
   {
      for (int i = 0; i < index.length; i++) 
      {
         index[i] = i;
      }
      for (int i = list.length - 1; i >= 1; i--)
      {
         int max = list[i];
         int maxIndex = i;
      
         for (int j = i - 1; j >= 0; j--) 
         {
            if (max < list[j]) 
            {
               max = list[j];
               maxIndex = j;
            }
         }
         if (maxIndex != i)  
         {
            list[maxIndex] = list[i];
            list[i] = max;
            int temp = index[i];
            index[i] = index[maxIndex];
            index[maxIndex] = temp;
         }
      }
   }
}