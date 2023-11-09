package Q2;

public class TestPerson 
{
    public static void main(String args[])
    {
        Employee employee = new Employee("Steve", 10000);
        Student student = new Student("Alex", "Engineering");

        System.out.println(employee.getName());
        System.out.println(employee.getDescription());
        System.out.println(student.getName());
        System.out.println(student.getDescription());
    }
}
