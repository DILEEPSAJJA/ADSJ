package generics;

public class SubTwo <T,K> extends SubOne<T>{
	K val;
	
	public SubTwo() {}
	public SubTwo(int sdata, T data,K val) {
		super(sdata,data);
		this.val = val;
	}
	
	public String toString() {
		return super.toString()+", "+val;
	}
}
