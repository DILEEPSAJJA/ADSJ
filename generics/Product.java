package generics;

//import java.util.Comparator;

public class Product implements Comparable<Object> {
	private int id;
	private String name;
	public Product(int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id + " " + name;
	}
	public int compareTo(Object o) {
		Product p = (Product)o;
		return name.compareTo(p.name);
	}
}
