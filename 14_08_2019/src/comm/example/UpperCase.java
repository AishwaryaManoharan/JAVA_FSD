package comm.example;

public class UpperCase {
	private String fname;
	private String lname;
	
	public UpperCase()
	{
		
	}

	public UpperCase(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}

	public boolean isUpper(char c)
	{
		if(c>65 && c<96)
			return true;
		else
			return false;
	}

	public UpperCase check(String fname,String lname) throws MyException
	{
		System.out.println("Entering my checking method");
		
			System.out.println("Checking uppercase");
			System.out.println(isUpper(fname.charAt(0)));
			if(isUpper(fname.charAt(0)) && isUpper(lname.charAt(0)))
			{
			System.out.println("Name added successfully");
			return new UpperCase(fname,lname);
			}
			else 
			{
				System.out.println("else");
				throw new MyException("Can't add");
				
			}
		
		
		
	
	}
	
}
