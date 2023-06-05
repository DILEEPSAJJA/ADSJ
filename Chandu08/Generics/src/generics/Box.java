package generics;

public class Box <T>{
	private T data;
	
	public Box() {}
	public Box(T data) {
		this.data = data;
	}
	
	public void setData(T data) {this.data = data;}
	public T getData() {return data;}
	
	public String toString() {
		return "Data : "+data+" , type of data : "+data.getClass().getSimpleName();
	}
}
