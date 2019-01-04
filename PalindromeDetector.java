/*
Jake Steckel
Lab 5
*/
public class PalindromeDetector
{
   public static void main(String[] args)
   {
      // Create an array of strings to test.
      String[] testStrings = { "Able was I ere I saw Elba",
                               "Four score and seven years ago",
                               "Now is the time for all good men",
                               "Desserts I stressed",
                               "Ask not what your country can do for you",
                               "Kayak" };
   
      // Test the strings.
      for (int i = 0; i < testStrings.length; i++)
      {
         System.out.print("\"" + testStrings[i] + "\"");
         if (isPalindrome(testStrings[i].toUpperCase()))
            System.out.println(" is a palindrome.");
         else
            System.out.println(" is not a palindrome.");
      }
   }
        
   public static boolean isPalindrome(String s)
   {
    if(s.length() == 0 || s.length() == 1)
      return true; 
    if(s.charAt(0) == s.charAt(s.length()-1))
      return isPalindrome(s.substring(1, s.length()-1));
    return false;
 	}
}
//complete