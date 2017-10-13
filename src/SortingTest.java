import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class SortingTest 
{
//Review the testcase and determine the issue with the sorting.java code

	@Test
	public void testSortIntegersMethod1() {
		int[] arr1= {67,87,34,32,12,11};
		int[] sortedarr1 = {11,32,12,34,67,87};
		Sorting.sortIntegers(arr1);
		 assertEquals(false, Arrays.equals(arr1, sortedarr1));
		}
	@Test
	public void testSortIntegersMethod2() {
		int[] arr1= {5,1,3,7,10,8};
		int[] sortedarr1 = {1,3,5,7,8,10};
		Sorting.sortIntegers(arr1);
		 assertEquals(true, Arrays.equals(arr1, sortedarr1));
		}
	
	@Test
	public void testSortIntegersMethod3() {
		int[] arr1= {5,1,3,7,10,8};
		int[] sortedarr1 = {10,8,7,5,3,1};
		Sorting.sortIntegers(arr1);
		 assertEquals(false, Arrays.equals(arr1, sortedarr1));
		}
}


