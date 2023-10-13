import java.util.Scanner;

class MyHR
{
    public static void main(String args []) 
    {
		int choice=0;
		int empTotal = 0;
		int count = 0;
		int space = 0;
		
		Employee[] emp = new Employee[5];
		
		Office[] offices = new Office[3];
		
		for(int i = 0; i < 3; i++)
		{
			Office office = new Office();
			offices[i] = office;
			offices[i].office();
		}
		
		while(choice!=4)
		{
			Scanner input = new Scanner(System.in);

			System.out.println("Please enter a choice: ");
			System.out.println("1. List all offices");
			System.out.println("2. Create a new employee record");
			System.out.println("3. List all employees");
			System.out.println("4. Exit");

			choice = input.nextInt();
			switch (choice) 
			{
            	case 1:  
						//List all Offices
						//for(Office o: offices)
						for(int i = 0; i < 3; i++)
							{
								if(offices[i] != null)
								{
									System.out.println(offices[i]);
								}
							}
						System.out.println(" ");

                     	break;

            	case 2:  
						if(empTotal < 5)
						{
						
						Scanner worker = new Scanner(System.in);
						
						String street;
						String city;
						String county;
						String type;
						
						System.out.println("Enter employee street: ");
						street = worker.nextLine();
						
						System.out.println("Enter employee city: ");
						city = worker.nextLine();
						
						System.out.println("Enter employee county: ");
						county = worker.nextLine();
						
						System.out.println("Enter employee type(Staff/Manager): ");
						type = worker.nextLine();
						
						//----------------------------------------------
						/*String street = "22nd Happy Gilmore Street";
						String city 	= "Detroit";
						String county = "Peru";
						String type = "Staff";*/
						//----------------------------------------------
						
						Employee e = new Employee(street,city,county,type);
						
						emp[empTotal] = e;
						
						if(space<2)
						{
							offices[count].addEmployee(emp[empTotal]);
							space++;
						}
						else if(space == 2)
						{
							count++;
							space = 0;
							offices[count].addEmployee(emp[empTotal]);
							space++;
							
						}
						
						empTotal++;
						//worker.close();
						
						}
						else
							{
								System.out.println("Max number of employee accounts has been entered");	
							}
						
						System.out.println(" ");
						
                     	break;

				case 3:  
						for(Employee e:emp)
							{
								if(e!=null)
									{
										System.out.println(e);
									}
								else
									{	
										System.out.println("There are no employee records.");
									}
							}
						
						System.out.println(" ");
						
                     	break;

				case 4:  
						input.close();
						System.out.println("User has Chosen to Exit!");

                     	break;

        	}
		}
    }

}