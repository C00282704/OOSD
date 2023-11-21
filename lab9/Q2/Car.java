package Q2;

public class Car extends RoadVehicle
{
	private String carType;
    private double price;
 
	public Car() 
    {
	 	this("", 0, 0,6);
	}
 
	public Car(String c, int w, int p, double price) 
    { 
		super(w, p);
		setType(c);
        this.price = price;
	}
 
	public void setType(String t)  {
		carType = t;
	}
 
	public String getType() {
		return carType;
	}

    public double calculateDuty() 
    {
        return price*CARTAXRATE;
    }
}
