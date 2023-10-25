public class Dog extends Animal
{
	
	public Dog(String type, int age, char gender)
	{
		super(type,age,gender);
	}
	
	public void eat()
	{
		System.out.println("Dog is eating");
	}
	
	public void sleep()
	{
		System.out.println("Dog is sleeping");
	}
	public void makeSound()
	{
		System.out.println("woof woof");
	}
	
	public String toString()
	{
		return "Type: " + type + ". Age: " + age + ". Gender: " + gender;
	}
}