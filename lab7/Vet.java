public class Vet
{
    private String name;

    public Vet(String name)
    {
        this.name = name;
    }

    public void vaccinate(Animal type)
	{
		System.out.println(name + " is vaccinating.");

        if(type instanceof Dog)
        {
            Dog d = (Dog) type;
            System.out.println( "Dog has been vaccinated: " + d);
            System.out.println(" ");
        }
        else if(type instanceof Cat)
        {
            Cat c = (Cat) type;
            System.out.println( "Cat has been vaccinated: " + c);
            System.out.println( " ");
        }
	}
}
