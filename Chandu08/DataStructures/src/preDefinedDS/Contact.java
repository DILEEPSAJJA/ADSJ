package preDefinedDS;

public class Contact implements Comparable<Contact>{
	private String name;
	private long number;
	
	public Contact(String name, long number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {return name;}
	public long getNumber() {return number;}
	
	public String toString() {
		return name+" "+number;
	}
	
	public int compareTo(Contact obj) {
		return name.compareTo(obj.name);
	}
}
