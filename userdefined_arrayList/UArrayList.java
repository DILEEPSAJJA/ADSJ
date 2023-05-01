package UserDefined_ArrayList;

import java.util.Iterator;

public class UArrayList<E> {
	
	private E[] arr;
	private int size;
	
	@SuppressWarnings("unchecked")
	public UArrayList() {
		arr = (E[]) new Object[10];
	}
	
	public UArrayList(E[] arr) {
		this.arr = arr;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int indexOf(Object obj) {
		@SuppressWarnings("unchecked")
		E key = (E) obj;
		for(int i=0 ; i<size ;i++)
			if(key.equals(obj))
				return i;
		return -1;
	}
	
	@SuppressWarnings("unchecked")
	public boolean contains(Object obj) {
		E ele = (E) obj;
		for(int i=0 ; i<size ;i++)
			if(ele.equals(obj))
				return true;
		return false;
	}
	
	public Iterator<E> iterator(){
		return new Iterator<E>(){
			
			private int it=0;
			
			public boolean hasNext() {
				return it<size;
			}
			
			public E next() {
				return arr[it++];
			}
		};
	}
	
	public boolean add(E ele) {
		if(size == arr.length)
			return false;
		arr[size++] = ele;
		return true;
	}
	
	public boolean add(int index , E ele) {
		if(size == arr.length)
			return false;
		else if(size < 0 || index > size)
			return false;
		else {
			for(int i=size;i>index;i--) 
				arr[i] = arr[i-1];
			arr[index] = ele;
			size++;
			return true;
		}
	}
	
	public boolean remove(Object obj) {
		if(size == 0)
			return false;
		else {
			int index = indexOf(obj);
			if(index == -1)
				return false;
			else {
				remove(index);
				return true;
			}
		}
	}
	
	public E remove(int index) {
		if(size == 0)
			return null;
		else if(size < 0 || index >= size)
			return null;
		else {
			E temp = arr[index];
			for(int i=index;i<size-1;i++) 
				arr[i] = arr[i+1];
			size--;
			return temp;
		}
	}
	
	public void clear() {
		size =0;
	}
}
