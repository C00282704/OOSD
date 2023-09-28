public class HotelRoom4
{
	private int Num;
	private String Type;
	private boolean Vacancy;
	private double Rate;
	private boolean Occ;
	
//--------------------

	public void setRNum (int num )
	{
		Num = num;
	}
	
	public int getRNum ()
	{
		return Num;
	}
//--------------------
	public void setRType (String type )
	{
		Type = type;
	}
	
	public String getRType()
	{
		return Type;
	}
//--------------------
	public void setOccupied(boolean vacancy )
	{
		
		if(vacancy == true && Vacancy == true)
		{
			System.out.println("Room is already OCCUPIED!");
		}
		else
		{
			Vacancy = vacancy;
		}
	}
	
	public boolean isOccupied()
	{
		return Vacancy;
	}
//--------------------
	public void setRRate (double rate )
	{
		Rate = rate;
	}
	
	public double getRRate ()
	{
		return Rate;
	}
}