/*
Jacob Steckel
CSC 142
Lab 3
*/


public class MultiplyMatrix
{
   public static void main (String[]args)
   {
      int one[][]={{1,2,3},{4,5,6},{7,8,9}};
      int two[][]={{9,8,7},{6,5,4},{3,2,1}};
      
      multiplyMatrix(one,two);
   }
   
   public static int[][] multiplyMatrix(int[][] a, int[][] b)
   {
      {
        int rowsInA = a.length;
        int colsInA = a[0].length;
        int colsInB = b[0].length;
        int[][] c = new int[rowsInA][colsInB];
        
        for (int i = 0; i < rowsInA; i++) 
        {
            for (int j = 0; j < colsInB; j++) 
            {
                for (int p = 0; p < colsInA; p++) 
                {
                    c[i][j] = c[i][j] + a[i][p] * b[p][j];
                }
            }
        }
        return c;
      }            
   }
}