package userDefinedDataStructures;

import java.util.Scanner;

public class UQueueDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the capacity of a Queue");
		int cap = sc.nextInt();
		UQueue<Integer> que = new UQueue<>(cap);
		System.out.println("1.Enqueue\t2.Dequeue\t3.is Empty"
				+ "\t4.Peek\t5.Display\t6.Exit");
		while(true) {
			System.out.println("Choose one of the above options");
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : 
					System.out.println("Enter the element to be enqueue");
					int ele = sc.nextInt();
					if(que.enqueue(ele))
						System.out.println(ele +" enqueued successfully");
					else
						System.out.println("Failed to enqueue "+ele);
					break;
				case 2 :
					Integer e = que.dequeue();
;					if(e != null)
						System.out.println(e +" dequeued successfully");
					else
						System.out.println("Failed to dequeue");
					break;
				case 3 : 
					if(que.isEmpty())
						System.out.println("Queue is empty");
					else
						System.out.println("Queue is not empty");
					break;
				case 4 : 
					System.out.println("Peek element is "+que.peek());
					break;
				case 5 :
					System.out.println("Queue elements are : ");
					que.display();
					break;
				case 6 :
					sc.close();
					System.exit(0);
				default :
					System.out.println("Choose a correct option");
			}
		}
		
	}

}
