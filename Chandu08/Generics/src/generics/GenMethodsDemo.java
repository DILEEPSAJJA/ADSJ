package generics;
// static import
import static generics.GenMethods.*;
public class GenMethodsDemo {

	public static void main(String[] args) {
		
		Integer[] iarr = {1,2,3,4,5};
		Double[] darr = {1.2,2.3,4.3,5.6};
		String[] sarr = {"one","two","three","four"};
		
		display(iarr);
		display(darr);
		display(sarr);
		
		System.out.println("Average of integer array : "+average(iarr));
		System.out.println("Average of double array : "+average(darr));
		//average of string array is not possible as it is not a subclass of Number class
	}

}
