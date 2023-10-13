import java.util.Scanner;

class Employee
{
    private static int employeeAmount = 1000;
    private int employeeNumber;
    private String employeeType;
	private String carModel;
	private Address address;

    
	public Employee(String street,String city, String county,String type)
    {
    	employeeNumber = employeeAmount;
    	employeeAmount++;
    	
    	Address emp = new Address(street,city,county);
    	
    	employeeType = type;

		address = emp;
    	
    	if(employeeType.equals("Manager") || employeeType.equals("manager"))
    		{
    			//carModel = "Ferrari";
    			//System.out.println("Managger!!!!!!!!!!!!!!!!!!");
    			Scanner in = new Scanner(System.in);
						
				System.out.println("Enter car model: ");
				carModel = in.nextLine();
				
				//in.close();
    		}

    }

    public String toString()
    {
    	if(employeeType.equals("Manager") || employeeType.equals("manager"))
		{
			return "Employee Number: " + employeeNumber + ", Car Model: " + carModel + " || Address " + address.toString();
		}
		else
		{
			return "Employee Number: " + employeeNumber + " || Address " + address.toString();
		}
    }
    
    public int returnRecords()
    {
    	return (employeeAmount - 1000);
    }
  
}