package userDefinedDataStructures;
import java.util.*;
public class HeapDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Heap<Integer> heap = new Heap<>(10);
		System.out.println("1.add 2.remove 3.display 4.get 5.exit");
		while(true) {
			System.out.println("Choose from above");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.print("Enter ele : ");
					int ele = sc.nextInt();
					heap.add(ele);
					break;
			case 3: heap.display();
					break;
			case 4: System.out.println(heap.get()); 
					break;
			case 5: System.exit(0);
			default:System.out.println("Choose correctly");
			}
		}
	}

}
