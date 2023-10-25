public class Animal
{
	protected String type;
	protected int age;
	protected char gender;
	
	
	public Animal(String type, int age, char gender)
	{
		this.type =type;
		this.age = age;
		this.gender = gender;
	}
	
	public void eat()
	{
		System.out.println("Animal is eating");
	}
	
	public void sleep()
	{
		System.out.println("Animal is sleeping");
	}
	public void makeSound()
	{
		System.out.println("A generic animal sound");
	}
	
		public String toString()
	{
		return "Type: " + type + ". Age: " + age + ". Gender: " + gender;
	}
}