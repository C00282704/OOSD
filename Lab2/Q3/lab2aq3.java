public class lab2aq3
{
public static void main(String args []) 
	{ 
		
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
//----------------------------------------------------------------------------
	
		HotelRoom roomC = new HotelRoom(202,"Single",1,90.0);
		
		System.out. println ("C's Room Number = " + roomC.getRNum() + ", Type = " + roomC.getRType() + ", " + roomC.getRVaca() + ", Rate = " + roomC.getRRate());
	}
}
