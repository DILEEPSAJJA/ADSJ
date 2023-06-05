package preDefinedDS;
import java.util.*;
public class setSumDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hset = new HashSet<>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		hset.add(50);
		hset.add(60);
		hset.forEach(ele -> System.out.print(ele+" "));
		System.out.println("\n Minimum element in a hashset is : "+min(hset));
		System.out.println("Sum of elements in a hashset is : "+sum(hset));
		int sum = hset.stream().mapToInt(ele -> ele).sum();
		System.out.println("Sum of elements are : "+sum);
		Optional<Integer> min = hset.stream().reduce((a,b) -> (a<b?a:b) );
		System.out.println("Min ele : "+min.get());
		Optional<Integer> max = hset.stream().reduce((a,b) -> (a>b?a:b) );
		System.out.println("Max ele : "+max.get());
	}
	
	public static int min(HashSet<Integer> hset) {
		int min = Integer.MAX_VALUE;
		Iterator<Integer> it = hset.iterator();
		while(it.hasNext()) {
			int ele = it.next();
			if(ele < min)
				min = ele;
		}
		return min;
	}
	
	public static int sum(HashSet<Integer> hset) {
		int sum = 0;
		for(int ele : hset)
			sum += ele;
		return sum;
	}
}
