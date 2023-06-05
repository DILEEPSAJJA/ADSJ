package userDefinedDataStructures;
import java.util.Arrays;
import java.util.Scanner;
public class UStackDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the capacity of a Stack");
		int cap = sc.nextInt();
		UStack<Integer> stack = new UStack<>(cap);
		System.out.println("1.Push\t2.Pop\t3.is Empty"
				+ "\t4.is Full\t5.Peek\t6.Top\t7.Display\t8.Clear\t9.Exit");
		while(true) {
			System.out.println("Choose one of the above options");
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : 
					System.out.println("Enter the element to be push");
					int ele = sc.nextInt();
					if(stack.push(ele))
						System.out.println(ele +" pushed successfully");
					else
						System.out.println("Failed to push "+ele);
					break;
				case 2 :
					Integer e = stack.pop();
;					if(e != null)
						System.out.println(e +" poped successfully");
					else
						System.out.println("Failed to pop");
					break;
				case 3 : 
					if(stack.isEmpty())
						System.out.println("Stack is empty");
					else
						System.out.println("Stack is not empty");
					break;
				case 4 : 
					if(stack.isFull())
						System.out.println("Stack is full");
					else
						System.out.println("Stack is not full");
					break;
				case 5 :
					System.out.println("Peek element is "+stack.peek());
					break;
				case 6 :
					System.out.println("Top value is " + stack.top());
					break;
				case 7 :
					System.out.println("Stack elements are : ");
					stack.display();
					break;
				case 8 :
					stack.clear();
					System.out.println("Stack elements are cleared");
					break;
				case 9 :
					sc.close();
					System.exit(0);
				default :
					System.out.println("Choose a correct option");
			}
		}
	}

}
