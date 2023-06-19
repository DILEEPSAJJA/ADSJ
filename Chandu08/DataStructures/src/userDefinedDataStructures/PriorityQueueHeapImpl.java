package userDefinedDataStructures;
import java.util.NoSuchElementException;
import java.util.Arrays;
public class PriorityQueueHeapImpl<T extends Comparable<T>> {
	T[] heap;
	int size;
	public PriorityQueueHeapImpl() {
		this(10);
	}
	public PriorityQueueHeapImpl(int cap) {
		heap = (T[]) new Comparable[cap];
		size = 0;
	}
	
	public void insert(T ele) {
		if(heap.length >= size)
			heap = Arrays.copyOf(heap, heap.length*2);
		heap[size++] = ele;
		bubbleUp(size-1);
	} 
	
	public void bubbleUp(int i) {
		while(i > 0) {
			if(heap[i].compareTo(heap[(i-1)/2])<= 0)
				break;
			swap(i,(i-1)/2);
			i = (i-1)/2;
		}
	}
	
	public void swap(int i, int j) {
		T temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	
	public T peek() {
		if(size == 0)
			throw new NoSuchElementException();
		return heap[0];
	}
	
	public T remove() {
		T dele = peek();
		heap[0] = heap[--size];
		heap[size] = null;
		bubbleDown(0);
		return dele;
	}
	
	public void bubbleDown(int i) {
		while(i*2 +1 < size) {
			int maxChild = i*2+1;
			if(i*2+2 < size && heap[maxChild].compareTo(heap[i*2+2]) < 0)
				++maxChild;
			if(heap[maxChild].compareTo(heap[i]) < 0)
				break;
			swap(i, maxChild);
			i = maxChild;
		}
	}
	
	public int size() {
		return size;
	}
	
	public void print() {
		for(int i = 0;i< size;i++)
				System.out.println(heap[i] + " ("+ i +")");
	} 
}
