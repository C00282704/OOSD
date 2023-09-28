public class HotelRoom
{
	private int Num;
	private String Type;
	private int Vacancy;
	private String vaca;
	private double Rate;
	
	
	public void HotelsRoom()
 	{ 
		setRNum (0);
		setRType ("D");
		setRVaca (0);
		setRRate (0);
	}
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
	public void setRVaca (int vacancy )
	{
		Vacancy = vacancy;
	}
	
	public String getRVaca()
	{
	if(Vacancy == 1)
		{
			vaca = "Occupied";
		}
		else
		{
			vaca = "Vacant";
		} 
		
		return vaca;
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