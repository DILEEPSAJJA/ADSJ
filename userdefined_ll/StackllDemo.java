package userdefined_ll;

import java.util.Scanner;

public class StackllDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stackll<Double> stk = new Stackll<>();
		
		System.out.println("1.push    2.pop    3.peek    4.display    5.exit");
		while(true) {
			System.out.println("Enter Your Choice : ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1: System.out.println("Enter Element : ");
			    	Double ele = sc.nextDouble();
			    	stk.push(ele);
			    	break;
			    	
			case 2: ele = stk.pop();
					System.out.println(ele + " is popped.");
					break;
					
			case 3: System.out.println("Top element : " + stk.peek());
					break;
				
			case 4: stk.display();
					break;
				
			case 5: sc.close();
					System.exit(0);
				
			default : System.out.println("Invalid input.");
			}
		}
	}
}
