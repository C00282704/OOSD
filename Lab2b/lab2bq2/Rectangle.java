public class Rectangle
{
public static void main(String args []) 
	{ 
		Dimensions recA = new Dimensions();
		recA.setLength(7);
		recA.setWidth(34);
		
		System.out.println(recA + ", Area = " + recA.getArea() + ", Perimeter = " + recA.getPerimeter());
	}
}
