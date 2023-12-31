//Student Name: Tadgh Fitzpatrick
//Student ID  : C00282704
public class Circle extends TwoDShape
{
	private double radius;
	
	public Circle(String name, String colour,double radius)
	{
		super(name, colour);
		this.radius = radius;
	}

	public double area() 
	{
		return Math.PI*(radius*radius);
	}

	public String toString()
  	{
  		return (super.toString()+"\nRadius = "+ radius);
  	}
}
