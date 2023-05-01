package UserDefined_ArrayList;

import java.util.*;

public class UArrayQueueDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Capacity : ");
		int cap = sc.nextInt();
		
		UArrayQueue<Integer> aq = new UArrayQueue<>(cap);
		
		while(true) {
			
			System.out.println("1.enqueue    2.dequeue    3.display    4.exit");
			System.out.println("Enter Your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
				
			case 1: System.out.println("Enter Element : ");
					Integer ele = sc.nextInt();
					if(aq.enqueue(ele))
						System.out.println(ele + " is enqueued.");
					else
						System.out.println(ele + " is not enqueued.");
					break;
					
			case 2:  
					ele = aq.dequeue();
					if(null != ele)
						System.out.println(ele + " is enqueued.");
					else
						System.out.println(ele + " is not enqueued.");
					break;
					
			case 3: aq.display();
					break;
					
			case 4: sc.close();
					System.exit(0);
					
			default: System.out.println("Invalid input.");
					
			}
			
		}
		
	}

}
