package Q2;

public class HGV extends RoadVehicle {
    private int cargo;
    private double price;
 
	public HGV() 
    {
	 	this(0, 0, 0,6);
	}
 
	public HGV(int c, int w, int p, double price) 
    { 
		super(w, p);
		setCargo(c);
        this.price = price;
	}
 
	public void setCargo(int c)  {
		cargo = c;
	}
 
	public int getCargo() {
		return cargo;
	}

    public double calculateDuty() 
    {
        return price*HGVTAXRATE;
    }
}
