package userDefinedDataStructures;

public class UStackLL<T> implements IStack<T>{

	private class Node{
		private T data;
		private Node next;
		public Node(T ele, Node next) {
			this.data = data;
			this.next = next;
		}
		
		public String toString() {
			return data + " ";
		}
	}
	Node top;
	public boolean isEmpty() {
		return top == null;
	}

	public int size() {
		Node temp = top;
		int count = 0;
		while(temp != null)
		{
			temp = temp.next;
			count++;
		}
		return count;
	}

	public void push(T ele) {
		top = new Node(ele,top);
	}

	public T pop() {
		if(isEmpty())
			return null;
		T ele = top.data;
		top = top.next;
		return ele;
	}

	public T peek() {
		if(isEmpty())
			return null; 
		return top.data;
	}
	
	public void display() {
		Node temp = top;
		while(temp != null) {
			System.out.println(temp + " --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public void clear() {
		top = null;
	}
}
