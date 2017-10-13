
public class CaculateStudentLetterGrade {
	   public static char LetterGrade(int TotalPoints) {
		   
		   //Review the below code and based on the unit test case results fix the issue..
		  
		   //This program calculates students grade based on a TotalPoints
		   //If student total point is above 900 then A
		   //If student total point is  between 800 and 899, then B
		   //If student total point is  between 700 and 799, then C
		   //If student total point is  between 600 and 699, then D
		   //If student total point is  less than 600, then F
		      if (TotalPoints >= 900 ) {
		         return 'A';
		      } else if (TotalPoints < 900 || TotalPoints>=800) {
		         return 'B';
		      } else if (TotalPoints < 800 || TotalPoints>=700)  {   
		         return 'C';
		         
		      } else if (TotalPoints < 700 || TotalPoints>=600)  {  
			         return 'D';
		      } else {
		         return 'F';
		      }
		   }
}
