public class Teacher extends Person
{
    int numCourses;
    String[] courses = new String[10];

    public Teacher(String name,String address)
    {
        super(name,address);
    }

    public String toString()
    {
        return getName() + " <"+ getAddress() +">";
    }

    public boolean addCourse(String course)
    {
        if(courses[numCourses] == null)
            {
                courses[numCourses] = course;
                numCourses++;
                return true;
            }
            else
            {
                return false;
            }
    }
    public boolean removeCourse(String course)
    {
        int index = 0;
        for(int i= 0; i <= numCourses; i++)
        {
            if(courses[i] == course)
            {
                index = i;
                break;
            }
        }
        if(courses[index] == course)
        {
            courses[index] = null;
            numCourses--;

            return true;
        }
        else
        {
            return false;
        }
        
    }
            /*for(int i= 0; i < numCourses; i++)
        {
            if(courses[i].equals(course))
            {
                courses[i] = null;
                numCourses--;
                i = numCourses;
                return true;
            }
            else
            {
                i = numCourses;
                return false;
            }
        }*/
}
