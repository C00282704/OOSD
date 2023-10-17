class Point
{
	protected int x;
	protected int y;
	
	public Point(int x, int y)
	{
		this.y = y;
		this.x = x;
	}
	
	public void	setPoint(int x, int y)
	{
		this.y = y;
		this.x = x;
	}
	
	public String getPoint(int x, int y)
	{
		return "X = " + this.x + ". Y = " + this.y;
	}
	
	public String toString()
	{
		return "" + x + " " + y;
	}
}