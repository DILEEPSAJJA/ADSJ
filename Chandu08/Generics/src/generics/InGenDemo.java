package generics;

public class InGenDemo {

	public static void main(String[] args) {
		SubTwo<Double,String> obj = new SubTwo<>(10,8.8,"Chandu");
		System.out.println(obj);
	}

}
