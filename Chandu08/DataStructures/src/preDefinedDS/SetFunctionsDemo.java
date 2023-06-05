package preDefinedDS;
import java.util.*;
public class SetFunctionsDemo {

	public static void main(String[] args) {
		TreeSet<Integer> a = new TreeSet<>();
		TreeSet<Integer> b = new TreeSet<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(70);
		b.add(80);
		System.out.println("Set 'a' elements are : ");
		a.forEach(ele -> System.out.print(ele + " "));
		System.out.println("\nSet 'b' elements are : ");
		b.forEach(ele -> System.out.print(ele + " "));
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1.Union\t2.Intersection\t3.Difference\t");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 : a.addAll(b);
				 break;
		case 2 : a.retainAll(b);
				 break;
		case 3 : a.removeAll(b);
				 break;
		default : System.out.println("Choose correct option");
		}
//		a.addAll(b); predefined to union
//		a.retainAll(b); predefined to intersect
//		a.removeAll(b); predefined for difference
		System.out.println("Set 'a' elements are : ");
		a.forEach(ele -> System.out.print(ele + " "));
//		for(int ele : a)
//			System.out.print(ele + " ");
//		System.out.println();
	}

}
