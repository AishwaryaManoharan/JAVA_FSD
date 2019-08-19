package comm.example.client;

public class Employee {
	private String name;
	private int id;

	public Employee()
	{
		System.out.println("Inside Employee default");
	}
	
	public Employee(String name,int id)
	{
		System.out.println("Inside Employee para");
		this.name=name;
		this.id=id;
	}
	

	protected String getDetails()
	{
		return "name"+name+"id"+id;
	}
}
