package generics;

import java.util.Arrays;

public class GenArray <T>{
	T[] arr;
	
	@SuppressWarnings("unchecked")
	public GenArray(int n) {
		arr =  (T[])(new Object[n]);
	}
	
	public GenArray(T[] arr) {
		this.arr = arr;
	}
	
	public void insert(int index , T val) {
		arr[index] = val;
	}
	
	public void sort() {
		Arrays.sort(arr);
		//System.out.println(this);
	}
	
	public String toString() {
		return Arrays.toString(arr);
	}
}
