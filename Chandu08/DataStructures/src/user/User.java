package user;

public class User {
	private static int nextId = 1000;
	private int id;
	private String name;
	private String password;
	
	public User() {
		id = nextId++;
	}
	
	public User(String name , String password) {
		id = nextId++;
		this.name = name;
		this.password = password;
	}
	
	public User(int id,String name , String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public int getId() {return id;}
	public String getName() {return name;}
	public String getPassword() {return password;}
	
	public void setName(String name) {this.name = name;}
	public void setPassword(String password) {this.password = password;}

	public String toString() {
		return id + " , "+name + " , "+password;
	}
}
