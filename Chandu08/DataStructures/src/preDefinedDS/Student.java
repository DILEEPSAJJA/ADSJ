package preDefinedDS;

public class Student {
	private int id;
	private String name;
	private Double cgpa;
	
	public Student() {}
	
	public Student(int id , String name, double cgpa) {
		this.id= id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public int getId() {return id;}
	public String getName() {return name;}
	public Double getCgpa() {return cgpa;}
	
	public void setId(int id) {this.id = id;}
	public void setName(String name) {this.name = name;}
	public void setCgpa(double cgpa) {this.cgpa = cgpa;}
	
	public String toString() {
		return id +", "+name+", "+cgpa;
	}
}
