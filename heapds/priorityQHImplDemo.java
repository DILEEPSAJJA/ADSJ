package heapds;
import java.util.*;

public class priorityQHImplDemo {
	
	public static void main(String[] args) {
		
		priorityQHImpl<Integer> ph = new priorityQHImpl<>(10);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1)insert \t2)peek \t3)remove\t 4)display\t 5)exit\n");
		
		while(true) {
			
			System.out.println("Enter Your Choice: ");
			int ch = sc.nextInt();
		
			switch (ch) {
				case 1: System.out.println("Enter value : ");
					Integer elem = sc.nextInt();
					ph.insert(elem);
						System.out.println(elem + " is added.");
					break;
				
				case 2: 
					Integer ele = ph.peek();
					if(ele != null)
						System.out.println("the value at index is : " + ele);
					break;
			
				case 3: 
					ele = ph.remove();
					if(ele != null)
						System.out.println("the value at index removed is : " + ele);
					break;
			
				case 4: ph.print();
					break;
			
				case 5: sc.close();
					System.exit(0);
			
				default: System.out.println("Enter valid input.");
				
			}
		}
	}
}
