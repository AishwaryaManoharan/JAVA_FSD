package comm.example;

public class Stackhere {
	private int a[];
	private int n;
	private int i=0;
	
	public Stackhere()
	{
		
	}
	
	public Stackhere(int n)
	{
		this.n=n;
		a=new int[n];
	}
	
	public void push(int element)
	{
		a[0]=element;
		i++;
	}
	
	public int pop()
	{
		return a[--i];
	}
	
	public boolean isEmpty()
	{
		if(i==0)
			return true;
		else
			return false;
	}
	
	public int size()
	{
		return i;
	}
	/*public int view()
	{
		for(int i=0;i<size;i++)
		return a[i];
	}*/

}
