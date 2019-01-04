/*
Jake Steckel
Lab 5
*/
public class IsMember
{
   public static boolean isMember(int[] a, int v, int p)
   {
       if (p>-1)
       {
           if (a[p]==v)
           {
               return true;
           }
           else
           {
               return isMember(a,v,p-1);
           }
       }
       return false;
   }
   
   public static void main (String[]args)
   {
      int[]a= {1,2,3,4,5};
      System.out.print(isMember(a,2,2));
   }
}   
//complete