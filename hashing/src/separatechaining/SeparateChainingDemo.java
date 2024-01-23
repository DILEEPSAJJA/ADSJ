package separatechaining;
import java.util.Scanner;

public class SeparateChainingDemo {
	public static void main(String[] args) {
		SeparateChaining<Integer, String> hm = new SeparateChaining<>(10);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1)put\t2)get\t3)remove\t4)display\t5)exit\n");
		while(true) {
		System.out.println("Enter Your Choice: ");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: System.out.println("Enter key, value : ");
				Integer index = sc.nextInt();
				String name = sc.next();
				//if(hm.put(index, name))
					System.out.println(name + " is added.");
				break;
				
		case 2: System.out.println("Enter key : ");	
				index = sc.nextInt();
				String ele = hm.get(index);
				if(ele != null)
					System.out.println("the value at index is : " + ele);
				break;
			
		case 3: System.out.println("Enter key : ");
				index = sc.nextInt();
				ele = hm.remove(index);
				if(ele != null)
					System.out.println("the value at index removed is : " + ele);
				break;
			
		case 4: hm.display();
				break;
			
		case 5: sc.close();
				System.exit(0);
			
		default: System.out.println("Enter valid input."); 
		}
		}
	}
}
