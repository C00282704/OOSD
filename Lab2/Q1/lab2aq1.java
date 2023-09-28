public class lab2aq1
{
public static void main(String args []) 
	{ 
		String vacancy;
		
		HotelRoom roomA = new HotelRoom();
		roomA.setRNum(200) ;
		roomA.setRType("Single");

		System.out. println ("A's Room Number = " + roomA.getRNum() + ", Type = " + roomA.getRType());
		
//----------------------------------------------------------------------------
	
		HotelRoom roomB = new HotelRoom();
		roomB.setRNum(201) ;
		roomB.setRType("Double");
		

		System.out. println ("B's Room Number = " + roomB.getRNum() + ", Type = " + roomB.getRType());
	}
}
