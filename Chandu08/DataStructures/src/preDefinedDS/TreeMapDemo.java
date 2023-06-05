package preDefinedDS;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.*;
import java.util.Iterator;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,Student> tm = new TreeMap<Integer,Student>((a,b) ->b-a);
		tm.put(101,new Student(1206,"Bhuvi",9));
		tm.put(102,new Student(1208,"Chandu",9.36));
		tm.put(103,new Student(1209,"Dileep",9));
		Set<Entry<Integer,Student>> set = tm.entrySet();
		set.stream().sorted((s1,s2)-> s1.getValue().getCgpa().compareTo(s2.getValue().getCgpa())).forEach(System.out::println);
		
		Iterator<Entry<Integer,Student>> it = set.iterator();
		while(it.hasNext()) {
			Entry<Integer,Student> s = it.next();
			int key = s.getKey();
			Student value = s.getValue();
			System.out.println(key+ "->"+value);
		}
		
		tm.forEach((k,v) -> System.out.println(k + "->" +v));
	}

}
