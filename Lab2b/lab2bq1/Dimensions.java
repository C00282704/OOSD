public class Dimensions
{
	private int Length = 1;
	private int Width = 1;
	private boolean lValid;
	private boolean wValid;
	
	public void setlength(int length)
	{
		if(length <= 40 && length > 0)
		{
			Length = length;
			lValid = true;
		}
		else
		{
			System.out.println("Input Length value was not valid");
			lValid = false;
		}
	}
	public int getlength()
	{
		if(lValid = true)
		{
			return Length;
		}
		else
		{
			return 0;
		}
	}
//--------------------
	
	public void setwidth(int width)
	{
		if(width <= 40 && width > 0)
		{
			Width = width;
			wValid = true;
		}
		else
		{
			System.out.println("Input Width value was not valid");
			wValid = false;
		}
	}
	public int getwidth()
	{
		if(wValid = true)
		{
			return Width;
		}
		else
		{
			return 0;
		}
	}
//--------------------
 public String toString()
 		{  
  			return "Length = " +Length+", Width = " + Width;  
 		} 
}