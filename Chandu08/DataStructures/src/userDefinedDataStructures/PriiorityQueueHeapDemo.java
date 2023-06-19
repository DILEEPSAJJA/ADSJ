package userDefinedDataStructures;
import java.util.Scanner;
public class PriiorityQueueHeapDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueueHeapImpl<Integer> heap = new PriorityQueueHeapImpl<>(10);
		heap.insert(75);
		heap.insert(20);
		heap.insert(25);
		heap.insert(35);
		heap.insert(40);
		heap.insert(80);
		heap.insert(55);
		heap.insert(60);
		heap.insert(79);
		heap.insert(100);
		System.out.println("1.Insert 2.Remove 3.Display 4.exit");
		while(true) {
			System.out.print("Choose one from above : ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1: System.out.print("Enter ele :");
						int ele = sc.nextInt();
						heap.insert(ele);
						break;
				case 2: System.out.println("Removed ele : "+heap.remove());
						break;
				case 3: System.out.println("Elements are :");
						heap.print();
						break;
				case 4: System.exit(0);
				default : System.out.println("Choose correct one");
			}
			
		}
	}

}
