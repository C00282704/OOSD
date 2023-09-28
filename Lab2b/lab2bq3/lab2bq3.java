public class lab2bq3
{
public static void main(String args []) 
	{ 
		Rectangle recA = new Rectangle();
		recA.setLength(4);
		recA.setWidth(10);
		
		System.out.println(recA + ", Area = " + recA.getArea() + ", Perimeter = " + recA.getPerimeter());
		recA.printRectangle();
	}
}
