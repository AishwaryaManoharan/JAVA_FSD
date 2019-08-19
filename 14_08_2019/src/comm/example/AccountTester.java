package comm.example;
import java.util.Scanner;

public class AccountTester {
	
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args)
	{
	Account account=new Account();
	
	try
	{
		System.out.println("AccountNumber:");
		//accountNumber=scanner.next();
		System.out.print("Amount");
		//amount=scanner.nextDouble();
		account.createNewAccount("AISH23",5000);
	}
	catch(AccountNotValidException e)
	{
		System.out.println(e.getMessage());
	}
//	catch(InputMismatchException e)
//	{
//		System.out.println("Amount must be numeric");
//	}
	}
}
