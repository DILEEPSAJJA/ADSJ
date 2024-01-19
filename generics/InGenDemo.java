package generics;

class Super {
	private int superData;
	
	Super(){}
	Super(int data){ this.superData = data; }
	
	public String toString() {
		return superData + "";
	}
}

class SubOne<T> extends Super{
	private T data;
	
	SubOne() {}
	SubOne(int sdata , T data){
		super(sdata);
		this.data = data;
	}
	
	public String toString() {
		return super.toString() + " " + data ;
	}
}

class SubTwo<T,K> extends SubOne<T>{
	
	private K val ;
	
	SubTwo(){}
	SubTwo(int sdata , T data ,K val){
		super(sdata,data);
		this.val = val;
	}
	
	public String toString() {
		return super.toString() + " " + val;
	}
}

public class InGenDemo {
	public static void main(String[] args) {
		
		SubTwo<Double,String> obj = new SubTwo<>(9,9.9,"Dileep");
		System.out.println(obj);
	}
}
