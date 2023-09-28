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
	public int getlength()
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
//Area

	public int getArea()
	{
		area = width*length;
		return area;
	}
//--------------------
//Perimeter
	
	public int getPerimeter()
	{
	  	perimeter = (width*2)+(length*2);
		return perimeter;
	}

//--------------------
//toString

 public String toString()
 		{  
  			return "Length = " +length+", Width = " + width;  
 		} 

//--------------------
//Box

 public void printRectangle()
 		{  
			String box[][] = new String[length][width];
			int w;
			int l;
			
			for(l=0; l < length; l++)
				{
					for(w=0; w < width; w++)
					{
						if (l == 0)
						{
							box[0][w] = "*";
						}
						
						if (l == length-1)
						{
							box[length-1][w] = "*";
						}

					}

					if(l > 0 && l < length-1)
						{
							box[l][0] = "*";
							box[l][width-1] = "*";

							for(int i = 1; i < width-1; i++)
							{
								box[l][i] = " ";
							}
						}

					for(w=0; w < width; w++)
					{
						System.out.print(box[l][w]);
					}
					System.out.println(" ");
				}
 		} 
}
