package userDefinedDataStructures;

import java.util.Scanner;

public class UStackLLDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UStackLL<Double> stk = new UStackLL<>();
		System.out.println("1.Push \t2.Pop\t3.Size\t"
				+ "4.isEmpty\t5.Peek\t6.Display\t7.Exit");
		while(true) {
			System.out.println("Choose one from above options");
			int choice = sc.nextInt();
			switch(choice) {
				case 1 :System.out.println("Enter  element to push");
						double ele = sc.nextDouble();
						stk.push(ele);
						System.out.println("Element pushed");
						break;
				case 2 :ele = stk.pop();
						System.out.println("Poped element : "+ele);
						break;
				case 3 :System.out.println("Size of Stack linked list is : "+stk.size());
						break;
				case 4 :if(stk.isEmpty())
							System.out.println("Stack Linked list is empty");
						else
							System.out.println("Stack Linked lsit is not empty");
						break;
				case 5 :ele = stk.peek();
						System.out.println("Peek element : "+ele);
						break;
				case 6 :stk.clear();
						System.exit(0);
				default : System.out.println("Enter correct choice");	
			}
		}

	}

}
