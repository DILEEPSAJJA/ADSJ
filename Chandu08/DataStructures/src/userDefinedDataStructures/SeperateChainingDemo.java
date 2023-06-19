package userDefinedDataStructures;
import java.util.*;
public class SeperateChainingDemo {

	public static void main(String[] args) {
		SeperateChaining<Integer, String> user = new SeperateChaining<>(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("1.put 2.get 3.remove 4.display 5.exit");
		while(true) {
			System.out.print("Choose an option : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1: System.out.println("Enter key, value");
						int key = sc.nextInt();
						sc.nextLine();
						String value = sc.nextLine();
						user.put(key, value);
						break;
				case 2: System.out.println("Enter the key");
						key = sc.nextInt();
						sc.nextLine();
						value = user.get(key);
						if(value != null)
							System.out.println("Value : "+value );
						else
							System.out.println("Key not found");
						break;
				case 3: System.out.println("Enter the key");
						key = sc.nextInt();
						sc.nextLine();
						value = user.remove(key);
						if(value != null)
							System.out.println("Removed Value : "+value );
						else
							System.out.println("Key not found");
						break;
				case 4: user.display();
						break;
				case 5: System.exit(0);
				default:System.out.println("Choose correct option");
			}
		}
	}

}
