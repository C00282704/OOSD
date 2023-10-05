class savingsAccount
{
	private double savingsBalance;
	private static double annualInterestRate;
	private double monthlyInterest;
	private static int accNum = 1;
	private int uID = 0;
	
	public savingsAccount(double balance)
 	{ 
		savingsBalance = balance;
		
		uID = accNum;
		accNum++;
	}
	
	public static void modifyInterestRate(double newRate)
	{
		annualInterestRate = newRate;
	}
	
	public double calculateMonthlyInterest()
	{
		monthlyInterest = (savingsBalance*(annualInterestRate/100))/12;
		savingsBalance = savingsBalance + monthlyInterest;
		
		return savingsBalance;
		//System.out.println("Monthly interest: " + savingsBalance);
	}
	public void accountSummary()
	{
		System.out.println("Account Id: " + uID + ", Account balance: " + (savingsBalance + ((savingsBalance*(annualInterestRate/100))/12)));
	}
}
