/*
Jake Steckel
Lab 5
*/
public class StringReverser
{
   public static String reverseString(String str)
   {
      
      if(str.length()==1)
      {
         return str;
      }
      else 
      {
         return ""+reverseString(str.substring(1)) + str.charAt(0);
      }
         
   }
   
   public static void main (String[]args)
   {
      String string="jake";
      reverseString(string);
   } 
}
//complete