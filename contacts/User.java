package contacts;
public class User {
	
	private int id;
	private String name;
	private String password;
	public static int nextId = 1000;
	
	public User() { id = nextId++; }
	
	public User(String name, String password) {
		id = nextId++;
		this.password = password;
		this.name = name;
	}
	
	public User(int id,String name,String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public int getId() { return id; }
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() { return password; }
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() { return name; }
	
	public String toString() {
		return "User [ id : " + id + "]";
	}
}
