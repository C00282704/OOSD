public class lab2aq2
{
public static void main(String args []) 
	{ 
		String vacancy;
		
		HotelRoom roomA = new HotelRoom();
		roomA.setRNum(200) ;
		roomA.setRType("Single");
		roomA.setRVaca(1) ;
		roomA.setRRate(100);

		System.out. println ("A's Room Number = " + roomA.getRNum() + ", Type = " + roomA.getRType() + ", " + roomA.getRVaca() + ", Rate = " + roomA.getRRate());
		
//----------------------------------------------------------------------------
	
		HotelRoom roomB = new HotelRoom();
		roomB.setRNum(201) ;
		roomB.setRType("Double");
		roomB.setRVaca(0) ;
		roomB.setRRate(80);
		

		System.out. println ("B's Room Number = " + roomB.getRNum() + ", Type = " + roomB.getRType() + ", " + roomB.getRVaca() + ", Rate = " + roomB.getRRate());
	}
}
