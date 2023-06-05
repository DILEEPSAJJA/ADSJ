package userDefinedDataStructures;
import java.util.*;
public class UserHashMapDemo {

	public static void main(String[] args) {
		UserHashMap<Integer,String> user = new UserHashMap(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("1.put 2.get 3.remove 4.display 5.exit");
		while(true) {
			System.out.print("Choose one from above : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1: System.out.println("Enter key, value pair");
						int key = sc.nextInt();
						sc.nextLine();
						String value = sc.nextLine();
						System.out.println("Pair added : "+user.put(key, value));
						break;
				case 2: System.out.print("Enter key : ");
						key = sc.nextInt();
						sc.nextLine();
						System.out.println("Value : "+user.get(key));
						break;
				case 3: System.out.print("Enter key : ");
						key = sc.nextInt();
						sc.nextLine();
						System.out.println("Removed Value : "+user.remove(key));
						break;
				case 4: System.out.println("Users are : ");	
						user.display();
						break;
				case 5: System.exit(0);
				default:System.out.println("Invalid choice");
				
			}
		}
	}

}
