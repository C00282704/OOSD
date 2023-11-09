import Q2.Employee;
import Q2.Student;

public class TestPerson 
{
      	public static void main(String args[])
  	{  	
        //ThreeDShape threeDShape;
  		//Shape 		shape;
  		Employee	employee = new Employee("Circle One", 10.0);
  		Student	    student = new Student("Circle One", "Enginering");
  		
  		//print them using references of the objects type
  		System.out.println("\n---Using circle reference" + employee.getDescription());
  		System.out.println("\n---Using rectangle reference" + student.getDescription());
    }
}
