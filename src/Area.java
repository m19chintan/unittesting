
public class Area {
//Lab:- Write unit test cases for all three methods. 
	public static double AreaOfRectangle(double a, double b)
	{
		return a*b;
	}
	
	public static double AreaOfCircle(double radius)
	{
		return 3.14*radius*radius;
	}
	
	public static double AreaOfTraingle(int sideA, int sideB, int sideC)
	{
		   double sideD = (sideA + sideB + sideC);
	        double s= sideD/2;
	        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}
}
