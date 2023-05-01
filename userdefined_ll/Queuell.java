package userdefined_ll;

public class Queuell<T> implements IQueue<T> {

	private class Node{
		T data;
		Node next;
		
		Node(T data){
			this.data = data;
			this.next = null;
		}
		
		public String toString() {
			return data.toString();
		}
	}
	private Node front,rear;
	@Override
	public boolean isEmpty() {
		return front == null && rear == null ;
	}
	@Override
	public int size() {
		int count = 0;
		Node temp = front;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	@Override
	public void enqueue(T ele) {
		if(isEmpty())
			front = rear = new Node(ele);
		else {
			Node nn = new Node(ele);
			rear.next = nn;
			rear = nn;
		}
	}
	@Override
	public T dequeue() {
		if(isEmpty())
			return null;
		T ele = front.data;
		front = front.next;
		if(front==null) rear =null;
		return ele;
	}
	@Override
	public T peek() {
		if(isEmpty())
			return null;
		return rear.data;
	}
	
	public void display() {
		Node temp = front;
		while(temp != null) {
			System.out.print(temp + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
}
