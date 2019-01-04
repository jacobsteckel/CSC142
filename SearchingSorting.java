   
public class SearchingSorting
{ 
   //sequential search
   public static int sequentialSearch(int[] array, int value) 
   {
      int index=0; 
      int element=-1; 
      boolean found=false; 

      while (!found && index < array.length) 
      {
         if (array[index] == value)
         {
            found = true;
            element = index;
         }
         index++;
      }
      return element;
   }
   
   //binary search:assuming array is sorted
   public static int binarySearch(int[] array, int value) 
   {
      int first=0; 
      int last=array.length-1; 
      int middle;
      int position=-1;
      boolean found=false;
      
      while (!found && first <= last)
      {
         middle = (first + last) / 2;
         if (array[middle] == value) 
         {
            found = true;
            position = middle;
         }
         else if (array[middle] > value)
            last = middle - 1;
         else
            first = middle + 1;
      }
      return position;
   }

   //selection sort
   public static void selectionSort(int[] array)
   {
      int startScan, index, minIndex, minValue;
         
      for (startScan = 0; startScan < (array.length-1); startScan++) 
      {
         minIndex = startScan;
         minValue = array[startScan];
         for(index = startScan + 1; index < array.length; index++)
         {
            if (array[index] < minValue)
            {
               minValue = array[index];
               minIndex = index;
            }
         }
         array[minIndex] = array[startScan];
         array[startScan] = minValue;
      }
   }
   
   //insertion sort
   
   //bubble sort
   
}