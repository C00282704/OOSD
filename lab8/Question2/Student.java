package Q2;
//Student Name: Tadgh Fitzpatrick
//Student ID  : C00282704
public class Student extends Person
{
    private String course;

    public Student(String name, String course)
    {
        super(name);
        this.course = course;
    }

    public String getDescription()
  	{
  		return "A student studying " + course;
  	}
}
