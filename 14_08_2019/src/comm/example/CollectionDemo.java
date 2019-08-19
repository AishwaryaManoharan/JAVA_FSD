package comm.example;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class CollectionDemo {
	static Scanner sc = new Scanner(System.in);

	private String str[];
	private Set<String> set;

	public CollectionDemo() {
		System.out.println("Number of elements in the array");
		str = new String[sc.nextInt()];

		for (int i = 0; i < str.length; i++) {
			System.out.print("Name:");
			str[i] = sc.next().toString().toLowerCase();
		}
		set = new HashSet<String>();
		for (String s : str) {
			if (!set.add(s)) {
				System.out.println("Duplicate element found not added in set");

			}
		}
	}

	public void displayCollection() {

		for (String ss : set) {
			System.out.println(ss.toString());
		}
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}

}
