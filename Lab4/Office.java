class Office
{
    private static int officeRoomNumber = 100;
    private int officeNumber;
    private int empCounter = 0;
    
    Employee[] employees = new Employee[2];
    
    
    
    public void office()
    {
        officeNumber = officeRoomNumber;
        officeRoomNumber++;
    }


    public void addEmployee(Employee employee)
    {
        employees[empCounter] = employee;
        empCounter ++;
    }
    
    //To String
    public String toString()
    {
    	if(employees[0] != null && employees[1] != null )
    	{
    		return "Office room number: " + officeNumber + ", " + employees[0].toString() + "\n" + "Office room number: " + officeNumber + ", " + employees[1].toString();
    	}
    	else if(employees[0] != null &&  employees[1] == null)
    	{
    		return "Office room number: " + officeNumber + ", " + employees[0].toString();
    	}
    	else
    	{
    		return "Office " + officeNumber + " is empty";
    	}
    }
    
    //Return the amount of Employees assigned to the office.
    public int returnEmpAmount()
    {
    	if(employees[0] != null && employees[1] != null )
    	{
    		return 2;
    	}
    	else if(employees[0] != null &&  employees[1] == null)
    	{
    		return 1;
    	}
    	else
    	{
    		return 0;
    	}
    }
    
    //Return the records of each of employee assigned to the office
    public String returnEmpRecord()
    {
    	if(employees[0] != null && employees[1] != null )
    	{
    		return employees[0].toString() + " " + employees[1].toString();
    	}
    	else if(employees[0] != null &&  employees[1] == null)
    	{
    		return employees[0].toString();
    	}
    	else
    	{
    		return "Office " + officeNumber + " is empty";
    	}
    }
  
}