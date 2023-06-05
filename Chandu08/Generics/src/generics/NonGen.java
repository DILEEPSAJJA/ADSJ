package generics;

public class NonGen {
	private Object data;
	public NonGen() {}
	public NonGen(Object data) {
		this.data = data;
	}
	
	public void setData(Object data) {this.data = data;}
	public Object getData() {return data;}
	
	public String toString() {
		return "Data : "+data+", type of data is : "+data.getClass().getSimpleName();
	}
}
