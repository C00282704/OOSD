package Q2;

public class TestVehicle 
{
    public static void main(String args[])
    {
        Car C1 = new Car("T",1,100,100);
        HGV H1 = new HGV(0, 0, 0, 100);

        System.out.println("" + H1.calculateDuty());
        System.out.println("" + C1.calculateDuty());
    }
}
