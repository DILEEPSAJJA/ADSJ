package generics;

public class Test {
	public static void main(String[] args) {
		Integer iarr[]= {1,2,3,4,5,6,0,2};
		Double darr[]= {10.6,12.6,33.4,4.6,5.9,6.6,10.9};
		String sarr[]= {"Chandu","Mani","Bhuvi","Dileep"};
		System.out.println(findMin(iarr));
		System.out.println(findMin(darr));
		System.out.println(findMin(sarr));
		System.out.println(findMax(iarr));
		System.out.println(findMax(darr));
		System.out.println(findMax(sarr));
		System.out.println(findMedian(iarr));
	}
	
	public static <T extends Comparable<T>> T findMin(T[] arr) {
		T min=arr[0];
		for(int i=0;i<arr.length;i++)
			if((arr[i]).compareTo(min)<0)
				min=arr[i];
		return min;
	}
	public static <T extends Comparable<T>> T findMax(T[] arr) {
		T max=arr[0];
		for(int i=0;i<arr.length;i++)
			if((arr[i]).compareTo(max)>0)
				max=arr[i];
		return max;
	}

	public static<T extends Number> double findMedian(T[] arr) {
		int mid=(arr.length)/2;
		if((arr.length&1)==1)
			return arr[mid].doubleValue();
		else
			return (arr[mid].doubleValue() + arr[mid-1].doubleValue())/2;
	}
	
}