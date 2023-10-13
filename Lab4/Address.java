class Address
{
    private String employeeStreet;
    private String employeeCity;
    private String employeeCounty;
    
    //String[] 
    public Address(String street,String city, String county)
    	{
			employeeStreet = street;
			employeeCity = city;
			employeeCounty = county;
		}
    public String toString()
    {
    	return "Street: " + employeeStreet + ", City: " + employeeCity + ", County: " + employeeCounty; 
    }
}