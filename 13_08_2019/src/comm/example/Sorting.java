package comm.example;

public class Sorting {
	

	private int a[]= {100,-1,-20,-30,0};
	private int i,j;
	private int temp;
	private int search=0;
	
	public void sorting()
	{
	for(i=0;i<5;i++)
	{
		for(j=i+1;j<5;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(a[i]);
	}
	//
	}
	
	public void searching()
	{
		for(i=0;i<5;i++)
		{
			if(a[i]==5)
				System.out.println("Element found");
			else
				System.out.println("Not found");
		}
	}
}

