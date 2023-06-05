package preDefinedDS;
import java.util.LinkedList;
public class LinkedListSum {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		int sum = 0;
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(2,50);
		ll.add(0,60);
		ll.add(null);
		ll.add(null);
		ll.add(70);
		System.out.print("Elements are : ");
		ll.forEach(ele -> System.out.print(ele + "->"));
		for(int i = 0;i<ll.size();i++) {
			Integer e = ll.get(i);
			if(e != null)
				sum += e;
		}
		System.out.println("null\nSum of Elements : "+sum);
	}

}
