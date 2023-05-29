package inbuiltds;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(12);
		list.add(2,99);
		list.add(null);
		list.add(null);
		list.add(1);
		list.add(0,22);
		
		System.out.println("Enter Elements : ");
		list.forEach(ele -> System.out.print(ele + " "));
		
		int sum = 0;
		for(int i=0 ; i<list.size();i++) {
			Integer ele = list.get(i);
			System.out.println(i + " " + ele);
			if(ele != null)
				sum += ele;
		}
		System.out.println();
		System.out.println("Sum : " + sum);
	}
}
