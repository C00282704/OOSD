public class Rectangle
{
public static void main(String args []) 
	{ 
		Dimensions recA = new Dimensions();
		recA.setLength(4);
		recA.setWidth(10);
		
		System.out.println(recA + ", Area = " + recA.getArea() + ", Perimeter = " + recA.getPerimeter());
		recA.printRectangle();
	}
}
