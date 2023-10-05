class BankCustomer
{
	private String name;
	private String address;
	private int sAccAmount;
	private int sAcc = 0;
	private double sum;
	
	private savingsAccount[] array = new savingsAccount[3];
	
	public BankCustomer(String nam, String add)
 	{ 
		name = nam;
		address = add;
	}
	
	public void addAccount(double balance)
 	{ 
		if(sAcc < 3)
		{
			savingsAccount account = new savingsAccount(balance);
			array[sAcc] = account; //sA1 = Savings Account 1
			sAcc++;
			
		}
		else
		{
			System.out.println("Customer already has 3 accounts!");
		}
	}
	public void balance()
 	{ 
 		sum = 0;
		for(int i=0;i<sAcc;i++)
			{
				if(array[i] != null)
				{
					sum = sum + array[i].calculateMonthlyInterest();
				}
			}
		System.out.println("Total balance + interest: " + sum);
	}
	public void summary()
 	{ 
		for(int i=0;i<sAcc;i++)
			{
				if(array[i] != null)
					{
						array[i].accountSummary();
					}
			}
	}
	
}