package preDefinedDS;
import java.util.Comparator;
import java.util.TreeSet;
public class TreeSetDemo {
	public static void main(String[] args) {
		Comparator<Contact> cmp = new Comparator<Contact>(){
			public int compare(Contact c1 , Contact c2) {
				return c2.getName().compareTo(c1.getName());
			}
		};
		TreeSet<Contact> ts = new TreeSet<>();
		ts.add(new Contact("Chandu", 9999L));
		ts.add(new Contact("Dileep", 8888L));
		ts.add(new Contact("Bhuvi", 877777L));
		ts.forEach(System.out::println);
		
		TreeSet<Contact> tp = new TreeSet<Contact>((o1,o2)-> {return (int)o2.getNumber() - (int)o1.getNumber();});

		tp.add(new Contact("Chandu", 9999L));
		tp.add(new Contact("Dileep", 1010L));
		tp.add(new Contact("Bhuvi", 8777L));
		tp.forEach(System.out::println);
	}
	
}
