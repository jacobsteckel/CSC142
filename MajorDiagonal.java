/*
Jacob Steckel
CSC 142
Lab 3
*/

public class MajorDiagonal
{
   public static void main(String[]args)
   {
      int [][] a ={{1, 2, 4, 5}, {6, 7, 8, 9}, {10, 11, 12, 13}, {14, 15, 16, 17}};
      
      System.out.print(""+getSumMajorDiagonal(a));
   }
   public static int getSumMajorDiagonal(int [][] array)
   {
      int sum=0;
      for (int i = 0; i < array.length; i++)
      {
         sum += array[i][i];
      }
      return sum;
   }
}