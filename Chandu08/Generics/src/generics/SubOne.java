package generics;

public class SubOne<T> extends Super{
	T data;
	
	public SubOne() {}
	public SubOne(int sdata, T data) {
		super(sdata);
		this.data = data;
	}
	public String toString() {
		return super.toString()+", "+data;
	}
}
