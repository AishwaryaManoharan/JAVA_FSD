package comm.example;

public class Tester5
{
public static void main(String[] args)
{
	Stackhere s=new Stackhere(3);
	s.push(5);
	s.push(4);
	s.push(3);
	System.out.println(s.size());
	
	System.out.println("Popping elements from stack");
	
	while(!s.isEmpty())
	{
		System.out.printf("%d",s.pop());
		System.out.printf("%d",s.pop());
		
	}
}
}
