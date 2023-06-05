package generics;

public class WildCardDemo {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>(10);
		Box<Double> b2 = new Box<>(8.8);
		Box<String> b3 = new Box<>("Chandu");
		Box<Number> bnum = new Box<>(8);
		
		display(b1);
		System.out.println(cube(b1));
		display(b2);
		System.out.println(cube(b2));
		display(b3);
//		System.out.println(cube(b3));
		//b can hold object reference of integer and its super class
		@SuppressWarnings("unused")
		Box<? super Integer> b = b1;
		b = bnum;
	}
	//b can hold any type object reference
	public static void display(Box<?> b) {
		System.out.println(b);
	}
	//b can hold any type object reference of Number and its subtypes
	public static double cube(Box<? extends Number> b) {
		double c = b.getData().doubleValue();
		return c*c*c;
	}
}
