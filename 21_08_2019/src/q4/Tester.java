package q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Tester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Contacts> list=new ArrayList<Contacts>();
		System.out.println("Input the number of contacts : ");
		int numOfEmp=sc.nextInt();
		for(int i=0;i<numOfEmp;i++) {
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter Email");
			String email=sc.next();
			System.out.println("Enter Mobile number");
			Long mobile=sc.nextLong();
			System.out.println("Enter Address");
			String addr=sc.next();
			list.add(new Contacts(name,email,mobile,addr));
		}
		System.out.println("Contact list after sorting by mobile number in descending order");
		Collections.sort(list);
		System.out.println(list);
		sc.close();
	}
}
