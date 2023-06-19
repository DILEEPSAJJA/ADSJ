package heapds;

import java.util.*;

public class priorityQHImpl<T extends Comparable<T>> {
	@SuppressWarnings("unused")
	private T[] heap;
	private int size;
	
	@SuppressWarnings("unchecked")
	public priorityQHImpl(int cap) {
		heap = (T[]) new Comparable[cap];
		size = 0;
	}
	
	public priorityQHImpl() {
		this(10);
	}
	
	public int size() { return size; }
	
	public void insert(T ele) {
		if(size == heap.length)
			heap = Arrays.copyOf(heap, heap.length*2);
		heap[size++] = ele;
		bubbleUp(size-1);
	}

	private void bubbleUp(int i) {
		while(i<0) {
			if(heap[i].compareTo(heap[(i-1)/2])<=0)
				break;
			swap(i,(i-1)/2);
			i = (i-1)/2;
		}
	}

	private void swap(int i, int j) {
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

	private void bubbleDown(int i) {
		
		while(2*i+1 <= size-1) {
			int maxChild = 2*i+1;
			if(2*i+2 <= size-1 && heap[2*i+2].compareTo(heap[2*i+1])>0)
				++maxChild;
			if(heap[i].compareTo(heap[maxChild])>=0)
				break;
			
			swap(i,maxChild);
			i = maxChild;
		}
	}
	
	public void print() {
		for(int i=0;i<size;++i)
			System.out.println(heap[i] + "( " + i + " )");
	}
}
