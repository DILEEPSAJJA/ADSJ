package userDefinedDataStructures;
import java.util.Iterator;
public class UArrayList<E> {
	private int size;
	private E[] arr;
	
	public UArrayList() {
		arr = (E[]) (new Object[10]);
	}
	public UArrayList(int cap) {
		arr = (E[]) (new Object[cap]);
	}
	public UArrayList(E[] arr) {
		this.arr = arr;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean contains(Object obj) {
		E key = (E)obj;
		for(E ele : arr) 
			if(ele.equals(key))
				return true;
		return false;
	}
	
	public int indexOf(Object obj) {
		E key = (E)obj;
		for(int i = 0;i<size;i++)
				if(key.equals(arr[i]))
					return i;
		return -1;
	}
	
	public Iterator<E> iterator(){
		return new Iterator<E>() {
			private int it = 0;
			public boolean hasNext() {
				return it < size;
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
		if(size == arr.length || index < 0 || index > size)
			return false;
		for(int i = size;i>index;i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = ele;
		size++;
		return true;
	}
	
	public boolean remove(Object obj) {
		E key = (E)obj;
		if(size == 0)
			return false;
		else {
			int index = indexOf(obj);
			if(index == -1)
				return false;
			else
				remove(index);
			return true;
		}
	}
	
	public E remove(int index) {
		if(size == 0)
			return null;
		else if(index < 0 || index >= size)
			return null;
		E temp = arr[index];
		for(int i = index ; i < size-1;i++) 
			arr[i] = arr[i+1]; 
		size--;
		return temp;
	}
	
	public void clear() {
		size = 0;
	}
}
