package generics;

import static generics.GenMethods.*;

public class GenMethodsDemo {
	public static void main(String[] args) {
		Integer[] iarr = {1,2,3,4,5,6};
		Double[] darr = {1.1 , 2.2 , 3.3 , 4.4};
		String[] sarr = {"one" ,"two" };
		
		display(iarr);
		System.out.println("Average : " + findAverage(iarr));
		
		display(darr);
		System.out.println("Average : " + findAverage(darr));
		
		display(sarr);
	}
}
