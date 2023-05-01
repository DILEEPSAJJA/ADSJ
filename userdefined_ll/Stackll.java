package userdefined_ll;

public class Stackll<T> implements Istack<T> {
	
	private class Node{
		T data;
		Node next;
		
		Node(T data,Node next){
			this.data = data;
			this.next = next;
		}
		
		public String toString() {
			return data.toString();
		}
	}
	
	private Node top;

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public int size() {
		int count = 0;
		Node temp = top;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	@Override
	public void push(T ele) {
		top = new Node(ele , top);
		
	}

	@Override
	public T pop() {
		if(top == null)
			return null;
		T ele = top.data;
		top = top.next;
		return ele;
	}

	@Override
	public T peek() {
		if(top == null)
			return null;
		return  top.data;
	}
	
	public void display() {
		Node temp = top;
		while(temp != null) {
			System.out.print(temp + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
}
