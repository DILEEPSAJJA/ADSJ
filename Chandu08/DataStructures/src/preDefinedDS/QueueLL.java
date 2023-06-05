package preDefinedDS;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class QueueLL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<>();
//		System.out.println(que.offer(10));
//		System.out.println(que.add(20));
//		System.out.println(que.peek());
//		System.out.println(que.element());
//		System.out.println(que.size ());		
//		System.out.println(que.remove(30));
//		System.out.println(que.poll());
		System.out.println("1.offer 2.poll 3.element 4.size 5.display 6.exit");
		while(true) {
			System.out.println("Choose one from above");
			int choice = sc.nextInt();
			switch(choice) {
				case 1 :System.out.print("Enter element : ");
					 	int ele = sc.nextInt();
					 	System.out.println("Element offered : "+que.offer(ele));
					 	break;
				case 2 :System.out.println("Element polled : "+que.poll());
				 		break;
				case 3 :System.out.println("Element : "+que.element());
		 				break;
				case 4 :System.out.println("Queue size : "+que.size());
		 				break;
				case 5 :que.forEach(System.out::println);
						break;
				case 6 :System.exit(0);
				default:System.out.println("Choose correct option");
			}
		}
	}

}
