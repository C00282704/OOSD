package Q2;

public abstract class Person
{
	private String name;
	
	public Person(String name)
  	{ 
  		this.name = name; 
  	}

	public String getName()
	{
		return name;
	}
  	
  	public String toString()
  	{
  		return ("---\nPerson Name = " + this.name);
  	}

	public abstract String getDescription();
}
