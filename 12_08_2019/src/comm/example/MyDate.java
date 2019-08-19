package comm.example;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	
	public void createDate(int d,int m,int y)
	{
		if(d>30)
		{
			System.out.println("Day can't begreater than 30");
			System.exit(0);
		}
			
		if(m>12)
		{
			System.out.println("Month can't begreater than 12");
			System.exit(0);
		}
			
		if( y<2019)
		{
			System.out.println("Year can't be this");
			System.exit(0);
		}
		
		day=d;
		month=m;
		year=y;
			
	}
	

	public String getDetails()
	{
		return day+"-"+month+"-"+year;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public boolean setDay(int d)
	{
		if(d>31)
			return false;
		else
			return true;
	}

	public boolean setMonth(int m)
	{
		if(m>12)
			return false;
		else
			return true;
	}
	
	public boolean setYear(int y)
	{
		if(y>1990 && y<2019)
			return true;
		else
			return false;
	}
}

