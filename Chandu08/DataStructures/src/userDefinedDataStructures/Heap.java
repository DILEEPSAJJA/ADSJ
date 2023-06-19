package userDefinedDataStructures;

public class Heap<T extends Comparable<T>>  {
	private int size;
	private int capacity;
	private T[] arr;
	
	public Heap(int n){
		arr = (T[]) new Comparable[n+1];
		size = 0;
		capacity = n+1;
	}
	
	public void add(T ele) {
		if(size +1 == capacity )
			return;
		int i = size +1;
		while(i > 1 && ele.compareTo(arr[i/2]) > 0)
		{
			arr[i] = arr[i/2];
			i = i/2;
		}
		arr[i] = ele;
		size++;
	}
	
	public void display() {
		for(int i = 1;i<= size ;i++)
			System.out.print(arr[i] +" ");
		System.out.println();
	}
	
	public T get() {
		return (isEmpty())?null:arr[1];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
//	public T remove() {
//		if(isEmpty())
//			return null;
//		int i = 1;
//		T ele = arr[1];
//		T key = arr[size--];
//		if(size == 0)
//			return ele;
//		if(size ==1) {
//			arr[1] = key;
//		}
//		while(i < size) {
//			int right = -1;
//			int left =  2*i;
//			int max = left;
//			if((2*i +1) >= size ) {
//				right = 2*i +1;
//				if(arr[right].compareTo([left]) > 0)
//					max = right;
//			}
//			if(key > arr[max])
//				arr[i] = key;
//			
//		} 
//	}
}
