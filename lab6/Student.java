public class Student extends Person
{
    int numCourses = 0;
    String[] courses = new String[8];
    int[] grades = new int[8];

    public Student(String name,String address)
    {
        super(name,address);
    }

    public String toString()
    {
        return getName() + " <"+ getAddress() +">";
    }

    public void addCourseGrade (String course,int grade)
    {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades()
    {
        System.out.println(getName() + " <"+ getAddress() +">");
        for(int i = 0; i < numCourses; i++)
        {
            System.out.println(courses[i]+ ": " + grades[i]);
        }
    }

    public double getAverageGrade()
    {
        if(courses[0] != null)
        {
            int average = 0;
            for(int i = 0; i < numCourses; i++)
            {
                average = average + grades[i];
            }
            average = average/(numCourses);
            return average;
        }
        else
        {
            return 0;
        }
    }
}