public class Rectangle
{
	private int length = 1;
	private int width = 1;
	private boolean lValid;
	private boolean wValid;
	private int area;
	private int perimeter;
	
//--------------------	
//Length
	public void setLength(int len)
	{
		if(len <= 40 && len > 0)
		{
			length = len;
			lValid = true;
		}
		else
		{
			System.out.println("Input Length value was not valid");
			lValid = false;
		}
	}
	public int getLength()
	{
		if(lValid = true)
		{
			return length;
		}
		else
		{
			return 0;
		}
	}
//--------------------
//Width

	public void setWidth(int wid)
	{
		if(wid <= 40 && wid > 0)
		{
			width = wid;
			wValid = true;
		}
		else
		{
			System.out.println("Input Width value was not valid");
			wValid = false;
		}
	}
	public int getWidth()
	{
		if(wValid = true)
		{
			return width;
		}
		else
		{
			return 0;
		}
	}

//--------------------

 public String toString()
 		{  
  			return "Length = " + length + ", Width = " + width;  
 		} 
}
