package preDefinedDS;
import java.util.*;
public class RemoveKey {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hset = new LinkedHashSet<>();
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.print("Enter ele : ");
//			int ele = sc.nextInt();
			hset.add(sc.nextInt());
			System.out.print("Do you want to continue (y/n): ");
			choice = sc.next();
		}while(choice.equals("y") || choice.equals("Y"));
		System.out.println("Set elements are : ");
		hset.forEach(ele -> System.out.print(ele + " "));
//		for(int ele : hset) {
//			System.out.print(ele + " ");
//		}
		System.out.println();
		System.out.print("Enter a key : ");
		int key = sc.nextInt();
		if(hset.contains(key)) 
			if(hset.remove(key))
				System.out.println(key +" removed successfully ");
			else
				System.out.println("Failed to remove "+key);
		else
			System.out.println(key + " not found");
		System.out.println("Set elements are : ");
		hset.forEach(ele -> System.out.print(ele + " "));
//		for(int ele : hset) {
//			System.out.print(ele + " ");
//		}
	}

}
