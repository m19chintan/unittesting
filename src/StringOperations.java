
public class StringOperations {
	
	//Review the code and determine the issues based on the unit test cases
//Concat two strings
	public static String  ConcatTwoStrings(String str1, String str2)
	{
		return(str1+str2);
		
	}
	
	//Calculate string len
	public static int  StringLen(String str1)
	{
		return(str1.length()-1);
		
	}
	
	//Find out a substring
	public static String  FindOutSubstrig(String str1,int pos1, int pos2)
	{
		return(str1.substring(pos1, pos2));
	
		
	}
	
	//Convert the string to lowercase
		public static String  ConvertToLowerCase(String str1)
		{
			return str1.toUpperCase();
		
			
		}
	
}
