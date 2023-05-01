package generics;

public class NonGen {
	
	private Object data;
		
	public NonGen() {}
	public NonGen(Object data) {
		this.data = data;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String toString() {
		return "[ data " + data + " , type = " + data.getClass().getSimpleName() + " ]";
	}
}

