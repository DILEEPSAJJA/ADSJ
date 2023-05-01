package UserDefined_ArrayList;

public class Stack<E> {
	
	private E[] arr;
	private int size;
	private int tos = -1;
	
	@SuppressWarnings("unchecked")
	public Stack() {
		arr = (E[]) new Object[10];
	}
	
	public Stack(E[] arr) {
		this.arr = arr;
	}
	
	public int size() {
		return size;
	}
	
	@SuppressWarnings("unchecked")
	public boolean push(Object obj) {
		if(isFull())
			return false;
		E ele = (E) obj;
		arr[++tos] = ele;
		return true;
	}
	
	 public E pop() {
		if(isEmpty())
			return null;
		return arr[tos--];
	 }
	 
	public E peek() {
		return arr[tos];
	}
	
	public boolean isEmpty() {
		return tos == -1;
	}
	
	public boolean isFull() {
		return (arr.length -1 == tos);
	}
	public void display() {
		System.out.println("The Elements : ");
		for(int i=tos ; i>=0 ;i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
