/*
Jake Steckel
Lab 5
*/
public class CharacterCounter
{
   public static void main(String[] args)
	{
		// Create an array of chars to test.
		// The character 'a appears 6 times.
		char[] test = {'a', 'b', 'a', 'c', 'd', 'a', 'e',
		               'a', 'f', 'g', 'h', 'a', 'i', 'a'};

		System.out.println("The character 'a' appears " +
		                   charCount(test, 0, 'a') + " times.");
	}
		
	public static int charCount(char[] array, int start, char ch)
	{
      if (start==-1) 
      {
         return 0;
      }
      
      if (array[start]==ch) 
      {
         return 1+charCount(array, start-1, ch);
      }
      
      return 1+charCount(array, start-1, ch);
	}
}