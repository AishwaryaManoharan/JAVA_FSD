package comm.example.client;

public class Person1 extends Account {
	private int salary1;

	public Person1()
	{
		super();
		System.out.println("Inside default");
	}
	
	public Person1(int salary1)
	{
		super();
		System.out.println("Inside para");
		this.salary1=salary1;
	}
	

	protected String getDetails()
	{
		return "salary1"+salary1;
	}
}

