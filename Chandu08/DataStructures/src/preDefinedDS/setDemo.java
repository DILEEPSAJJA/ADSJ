package preDefinedDS;
import java.util.*;
public class setDemo {

	public static void main(String[] args) {
		
		//HashSet
		HashSet<Integer> hset = new HashSet<>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		System.out.println(hset);
		System.out.println(hset.add(10));
		hset.add(null);
		System.out.println(hset); 
		//LinkedHashSet
		LinkedHashSet<Integer> lset = new LinkedHashSet<>();
		lset.add(20);
		lset.add(10);
		lset.add(40);
		lset.add(30);
		System.out.println(lset);
		System.out.println(lset.add(10));
		lset.add(null);
		System.out.println(lset);
		//TreeSet
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(10);
		tset.add(30);
		tset.add(40);
		tset.add(20);
		System.out.println(tset);
		System.out.println(tset.add(10));
//		tset.add(null); generates error
		System.out.println(tset);
	}
}
