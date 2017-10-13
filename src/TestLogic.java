import static org.junit.Assert.*;  
import org.junit.Test;  
 //Write the unit test case to test addition, substraction, multiply, FindMaximum and FindMinimum
// Determine the issue with the java code based on the unit test case results and fix it. 
public class TestLogic {  
  
    @Test  
    public void Unittestaddition(){  
    	 assertEquals(5,Calculation.addition(3, 2));

    	 
    }  
    @Test
    public void Unittestsubstraction(){  
   	 assertEquals(1,Calculation.substraction(3,2));
   	 
   } 
    @Test
    public void Unittestmultiply(){  
      	 assertEquals(6,Calculation.multiply(3,2));
      	 
      }  
 
    
    @Test
    public void UnittestFindMinNumber(){  
    	 assertEquals(2,Calculation.FindMinNumber(new int[]{4,7,5,2}));
    	 
    }  
    
    @Test
    public void UnittestFindMaxNumber(){  
    	 assertEquals(7,Calculation.FindMaxNumber(new int[]{4,7,5,2}));
    	 
    }  
}  