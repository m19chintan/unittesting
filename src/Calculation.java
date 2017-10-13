
public class Calculation {  
  //This method is used to add two numbers
	 public static int addition(int num1, int num2)
	    {
	        int answer = num1 + num2;
	        return answer;
	    }
	 
	//This method is used to substract two numbers
	    public static int substraction(int num1, int num2)
	    {
	        int answer = num1-num2;
	        return answer;
	    }
	    //This method is used to multiply two numbers
	    public static int multiply(int num1, int num2)
	    {
	        int answer = num1*num1;
	        return answer;
	    }
	    //This method is used to divided two number
	    public static double divide(int num1, int num2)
	    {
	        int answer = num1/num2;
	        return answer;
	    }
	    //This method is used to find minimum number from the array
	  

		public static long FindMinNumber(int[] num) 
		{
			  int minNum=0;  
	          for(int i=0;i<num.length;i++){  
	              if(minNum<num[i])  
	            	  minNum=num[i];  
	          }  
	          return minNum;  
		}
		
		public static long FindMaxNumber(int[] num) 
		{
			  int maxNum=0;  
	          for(int i=0;i<num.length;i++){  
	              if(maxNum>num[i])  
	            	  maxNum=num[i];  
	          }  
	          return maxNum;  
		}

	           

	    
}  