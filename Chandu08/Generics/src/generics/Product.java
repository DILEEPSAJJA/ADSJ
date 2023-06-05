package generics;

@SuppressWarnings("rawtypes")
public class Product implements Comparable{
	private int id ;
	private String name;
	
	public Product(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(Object o) {
		Product p = (Product)o;
		return name.compareTo(p.name);
	}
	public String toString()
	{
		return "[ "+id+" , "+name+" ]";
	}
}
