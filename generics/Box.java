package generics;

public class Box<T> {
	
	private T data;
	
	Box() {}
	Box( T data) {this.data = data;}
	
	public T getData() { return data; }
	public void setData(T data) { this.data = data; }
	
	public String toString() {
		return data + " ";
	}
}
