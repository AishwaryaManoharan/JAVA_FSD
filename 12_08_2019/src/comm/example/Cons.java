package comm.example;

public class Cons {
	
	private int x;
	private int y;
	private int z;
	
	public Cons()
	{
		//x=0;y=0
		this.x=16;
	}
	

	
	public Cons(int x)
	{
		this(x,20);
	}
	

	public Cons(int x,int y)
	{
		this(x,y,30);
	}
	
	
	public Cons(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}

	public String getXY()
	{
	return "X="+x+"Y="+y+"Z="+z;
	}
}
