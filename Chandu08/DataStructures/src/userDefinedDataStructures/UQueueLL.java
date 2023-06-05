package userDefinedDataStructures;

public class UQueueLL<T>{

	private class Node{
		T data;
		Node next;
		public Node(){
			front = null;
			rare = null;
		}
		
		public Node(T data, Node next){
			this.data = data;
			this.next = next;
		}
		
		public String toString() {
			return data+" ";
		}
	}
	
	private Node front;
	private Node rare;
	
	public T peek() {
		if(front == null)
			return null;
		return front.data;
	}

	public T dequeue() {
		if(front == null)
			return null;
		T ele = front.data;
		front = front.next;
		return ele;
	}

	public boolean enqueue(T ele) {
		if(front == null)
			front = rare = new Node(ele,null);
		else {
			rare.next = new Node(ele,null);
			rare = rare.next;
		}
		return true;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public int size() {
		int size = 0;
		for(Node temp = front;temp != null;temp = temp.next,size++);
		return size;
	}
	public  void display() {
		Node temp = front;
		while(temp != null) {
			System.out.print(temp +"->");	
			temp= temp.next;
		}
		System.out.println("null");
	}
}
