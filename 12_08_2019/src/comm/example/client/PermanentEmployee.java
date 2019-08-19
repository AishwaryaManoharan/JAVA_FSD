package comm.example.client;

public class PermanentEmployee extends Employee {
	private int salary;
	
	public PermanentEmployee()

	{
		super();
		System.out.println("Inside PEmployee default");
	}
	
	public PermanentEmployee(int salary)
	
	{
		super();
		System.out.println("Inside PEmployee para");
		this.salary=salary;
	}
	
	
	protected String getDetails()
	{
		return "salary"+salary;
	}

}
