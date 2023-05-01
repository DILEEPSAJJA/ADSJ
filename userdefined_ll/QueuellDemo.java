package userdefined_ll;

import java.util.Scanner;

public class QueuellDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queuell<Double> ql = new Queuell<>();
		System.out.println("1.enqueue    2.dequeue    3.peek    4.display    5.exit");
		while(true) {
			System.out.println("Enter Your Choice : ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1: System.out.println("Enter Element : ");
			    	Double ele = sc.nextDouble();
			    	ql.enqueue(ele);
			    	break;
			    	
			case 2: ele = ql.dequeue();
					System.out.println(ele + " is popped.");
					break;
					
			case 3: System.out.println("Top element : " + ql.peek());
					break;
				
			case 4: ql.display();
					break;
				
			case 5: sc.close();
					System.exit(0);
				
			default : System.out.println("Invalid input.");
			}
		}
	}
}
