package generics;

public class GenMethods {
	
	public static <T>void display(T[] arr) {
		System.out.println("Array is of type : "+arr.getClass().getSimpleName());
		System.out.println("Elements are");
		for(T ele : arr)
				System.out.print(ele +" ");
		System.out.println();
	}
	
	public static <T extends Number>double average(T[] arr) {
		double sum = 0.0;
		for(T ele : arr)
				sum += ele.doubleValue();
		return sum/arr.length;
	}
}
