package userDefinedDataStructures;
import java.util.*;
public class LinearMapDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearMap<Integer, String> user = new LinearMap<>();
		System.out.println("1.put 2.get 3.remove 4.entrySet 5.display 6.keySet 7.values 8.containsValue 9.exit");
		while(true) {
			System.out.println("Choose one from above");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1: System.out.println("Enter key ,value pair : ");
						int key = sc.nextInt();
						sc.nextLine();
						String val = sc.nextLine();
						String pval;
						if((pval = user.put(key,val)) != null)
							System.out.println(pval);
						else
							System.out.println("User added");
						break;
				case 2: System.out.print("Enter key : ");
						key = sc.nextInt();
						sc.nextLine();
						if(user.containsKey(key))
							System.out.println(user.get(key));
						else
							System.out.println("Key not found");
						break;
				case 3: System.out.print("Enter key : ");
						key = sc.nextInt();
						sc.nextLine();
						System.out.println(user.remove(key));
						break;
				case 4: System.out.println(user.entrySet());	
						break;
				case 5: user.display();
						break;
				case 6: System.out.println(user.keySet());
						break;
				case 7: System.out.println(user.values());
						break;
				case 8: System.out.print("Enter value : ");
						val = sc.nextLine();
						String line = (user.containsValue(val))?"Value found":"Value not found";
						System.out.println(line);
						break;
				case 9: System.exit(0);
				default:System.out.println("Invalid choice");
			}
		}
	}

}
