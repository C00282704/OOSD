public class lab2aq4
{
public static void main(String args []) 
	{ 
		String vacancy;
		
		HotelRoom4 roomA = new HotelRoom4();
		roomA.setRNum(200) ;
		roomA.setRType("Single");
		roomA.setOccupied(true);
		roomA.setRRate(100);

		System.out. println ("A's Room Number = " + roomA.getRNum() + ", Type = " + roomA.getRType() + ", Occupied: " + roomA.isOccupied() + ", Rate = " + roomA.getRRate());
		
//----------------------------------------------------------------------------
	
		HotelRoom4 roomB = new HotelRoom4();
		roomB.setRNum(201) ;
		roomB.setRType("Double");
		roomB.setOccupied(true);
		roomB.setRRate(80);
		
		System.out. println ("B's Room Number = " + roomB.getRNum() + ", Type = " + roomB.getRType() + ", Occupied: " + roomB.isOccupied() + ", Rate = " + roomB.getRRate());
		
		roomB.setOccupied(true);
	}
}