class lab3aq2
{
    public static void main(String args []) 
    {
		savingsAccount.modifyInterestRate(4);
		
		BankCustomer saver1 = new BankCustomer("John Doe","22nd Oak Street");
		
		saver1.addAccount(2000);
		saver1.addAccount(3000);
		saver1.addAccount(5000);
		saver1.summary();
		saver1.balance();
		
		System.out.println(" ");
		
		BankCustomer saver2 = new BankCustomer("Emily Smithenson","23rd Church Road");
		
		saver2.addAccount(2500);
		saver2.addAccount(300);
		saver2.addAccount(4570);
		saver2.summary();
		saver2.balance();
    }

}
