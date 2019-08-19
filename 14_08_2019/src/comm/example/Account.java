package comm.example;

public class Account {
	
	private double amount;
	private String accountNumber;
	
	public Account()
	{
		
	}
	

	public Account(double amount, String accountNumber) {
		super();
		this.amount = amount;
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String toString()
	{
	return "Account[accontNumber="+accountNumber+",amount="+amount+"]";
	}

	public Account createNewAccount(String accountNumber,double amount) throws AccountNotValidException
	{
		this.accountNumber=accountNumber;
		this.amount=amount;
		if(amount<10000)
		{
			throw new AccountNotValidException("A valid account can't be created");
		}
	
		return new Account(amount,accountNumber);
	}
		
}
