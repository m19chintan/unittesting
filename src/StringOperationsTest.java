import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringOperationsTest {

	@Test
	public void testConcatTwoStrings() {
		 assertEquals("HelloWorld",StringOperations.ConcatTwoStrings("Hello", "World"));
	}
	@Test
	public void testStringLen() {
		 assertEquals(10,StringOperations.StringLen("HelloWorld"));
	}
	@Test
	public void testFindOutSubstrig() {
		 assertEquals("He",StringOperations.FindOutSubstrig("Hello",0,2));
	}
	
	@Test
	public void testConvertToLowerCase() {
		 assertEquals("hello",StringOperations.ConvertToLowerCase("HELLO"));
	}

}
