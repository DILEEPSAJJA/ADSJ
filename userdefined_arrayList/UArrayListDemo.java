package UserDefined_ArrayList;

import java.util.Iterator;
import java.util.Scanner;

public class UArrayListDemo {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UArrayList<Integer> list = new UArrayList<>();
		
		do {
			System.out.println("1.add\t\t2.remove\t\t3.contains\t\t4.indexof\t\t\n5.isEmpty\t"
					+ "6.clear\t\t\t7.display\t\t8.exit");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: System.out.println("1.add via element\n2.add via index and element.");
					System.out.println("Enter Your Choice : ");
					int key = sc.nextInt();
					switch (key) {
					case 1: System.out.println("Enter Your Element : ");
							Integer ele = sc.nextInt();
							list.add(ele);
							System.out.println("Element added sucessfully ! ");
							break;
							
					case 2: System.out.println("Enter Your index : ");
							int index = sc.nextInt();
							System.out.println("Enter Your Element : ");
							int e = sc.nextInt();
							list.add(index,e);
							System.out.println("Element added sucessfully ! ");
							break;
					default: System.out.println("Enter valid Input !");
					}
					System.out.println("Done !! " + "\n");
					break;
			case 2: System.out.println("1.remove via element\n2.remove via index.");
					System.out.println("Enter Your Choice : ");
					int k = sc.nextInt();
					switch (k) {
					case 1: System.out.println("Enter Your Element : ");
						Integer el = sc.nextInt();
						list.remove(el);
						System.out.println("Element removed sucessfully ! ");
						break;
					
					case 2: System.out.println("Enter Your index : ");
						int index = sc.nextInt();
						list.remove(index);
						System.out.println("Element removed sucessfully ! ");
						break;
					default: System.out.println("Enter valid Input !");
					}
					System.out.println("Done !! " + "\n");
					break;
				
			case 3: System.out.println("Enter Element : ");
					int e = sc.nextInt();
					list.contains(e);
					break;
				
			case 4: System.out.println("Enter Element : ");
					int ele = sc.nextInt();
					list.indexOf(ele);
					break;
				
			case 5: list.isEmpty();
					break;
				
			case 6: list.clear();
					break;
				
			case 7: System.out.println("The Element are : ");
					@SuppressWarnings("rawtypes") Iterator it = list.iterator();
					while(it.hasNext()) {
						System.out.print(it.next() + " ");
					}
					System.out.println(" ");
					break;
						
			case 8: System.exit(0);
				
			default:
						throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		}while(true);
	}
}
