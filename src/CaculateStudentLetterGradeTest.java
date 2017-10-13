import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CaculateStudentLetterGradeTest {

	
	@Test
	public void testLetterGradeMethod1() {
		 assertEquals('A',CaculateStudentLetterGrade.LetterGrade(995));
	}
	
	@Test
	public void testLetterGradeMethod2() {
		 assertEquals('C',CaculateStudentLetterGrade.LetterGrade(755));
	}
	
	@Test
	public void testLetterGradeMethod3() {
		 assertEquals('B',CaculateStudentLetterGrade.LetterGrade(855));
	}
	
	@Test
	public void testLetterGradeMethod4() {
		 assertEquals('F',CaculateStudentLetterGrade.LetterGrade(550));
	}

}
