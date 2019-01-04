//Array practice

public class arrayPractice
{
   public static void main(String[]args)
   {
      final int size=10;
      int [] a = new int[size];
      
      for (int i=0 ; i<a.length ; i++)
      {
         //randomizing array
         a[i]=(int)(Math.random()*10);
         System.out.println(a[i]);
      }
         
      int total=0;
      for(int i=0;i<a.length;i++)
         total+=a[i];
      
      //finding average
      //finding #s below and above avg  
      double avg=((double)total)/a.length;
      
      int countAbove=0;
      int countBelow=0;
      
      for(int i=0;i<a.length;i++)
         if(a[i]>avg)
            countAbove++;
         else if(a[i]<avg)
            countBelow++;
      
      //two dimensional arrays
      int[][]array=new int[3][4];
      
      for(int row=0;row<3;row++)
         for(int col=0;col<4;col++)
            array[row][col]=(int)(Math.random()*100);
      
      //finding min       
      int min=array[0][0];
      
      for(int row=0;row<3;row++)
         for(int col=0;col<4;col++)
         {
            if(array[row][col]<min)
            min=array[row][col];
         }
         
         //ragged array
         int[][] numbers = new int[3][]; 
         numbers[0] = new int[4];
         numbers[1] = new int[3];
         numbers[2] = new int[2];

         for (int row = 0; row < numbers.length; row++) 
         {
            for (int col = 0; col < numbers[row].length; col++) 
            {
               numbers[row][col] = row + col;
               System.out.print(numbers[row][col] + " ");
            } 
            System.out.println();
         } 

   }
}