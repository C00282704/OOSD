public class Circle extends Point
{
		private int radius;

		
		public Circle() 
		{
			this (0, 0, 0); 
		}

		
		public Circle(int r, int x, int y) 
		{
			super(x, y);
			radius = r;
		}
		
		public String toString()
		{
			return "" + radius + " " + x + " " + y;
		}
}