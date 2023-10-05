class lab3aq2
{
    public static void main(String args []) 
    {
		savingsAccount.modifyInterestRate(4);
		
		savingsAccount saver1 = new savingsAccount(2000.00);
		
		savingsAccount saver2 = new savingsAccount(3000.00);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		savingsAccount.modifyInterestRate(5);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
    }

}
