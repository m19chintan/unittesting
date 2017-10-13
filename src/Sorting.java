
public class Sorting {
	
	//Review the source code for sorting numbers
	 public static void sortIntegers(int[] numbers) {
		  int totalNumber = numbers.length;
		  boolean valueswap = true;
		  while (valueswap) {
		   valueswap = false;
		   for (int i = 1; i < totalNumber; i++) {
		    if (numbers[i - 1] < numbers[i]) {
		     int tempNumber = numbers[i - 1];
		     numbers[i - 1] = numbers[i];
		     numbers[i] = tempNumber;
		     valueswap = true;
		    }
		   }
		   totalNumber = totalNumber - 1;
		  }
		 }
		
}
