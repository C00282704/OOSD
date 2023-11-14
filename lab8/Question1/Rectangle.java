//Student Name: Tadgh Fitzpatrick
//Student ID  : C00282704
public class Rectangle extends TwoDShape
{
    private double length;
    private double breadth;


    public Rectangle(String name, String colour, double length, double breadth)
	{
		super(name, colour);
        this.length = length;
        this.breadth = breadth;

	}

	public String toString()
  	{
  		return (super.toString()+"\nLength = " + length + "\nBreadth " + breadth);
  	}

    public double area() 
    {
        return length*breadth;
    }
}
