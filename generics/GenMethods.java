package generics;

public class GenMethods {
	
	// Generic methods without bounds 
	
	public static <T> void display(T[] arr) {
		System.out.println(" type of arr : " + arr.getClass().getSimpleName());
		System.out.println("Elements : ");
		for(T ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	
	// Generic methods with bounds 
	
	public static <T extends Number> double findAverage(T[] arr) {
		double sum = 0.0;
		for(T ele:arr)
			sum += ele.doubleValue();
		return (sum/arr.length);
	}
}
