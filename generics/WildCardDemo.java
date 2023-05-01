package generics;

public class WildCardDemo {
	public static void main(String[] args) {
		
		Box<Double> b2 = new Box<>(10.1);
		Box<Integer> b3 = new Box<>(10); 
		Box<String> b4 = new Box<>("Dileep");
		
		display(b2);
		System.out.println("cube : " + cube(b2));
		
		display(b3);
		System.out.println("cube : " + cube(b3));		
		
		display(b4);
		
		Box<Number> bnum = new Box<>(100);
		
		Box<? super Integer> b = b3;
		b = bnum;
		
		display(b);
	}

	private static void display(Box<?> b) {
		System.out.println(b);
	}
	
	private static double cube(Box<? extends Number> b) {
		double res = b.getData().doubleValue();
		return res * res * res;
	}
}