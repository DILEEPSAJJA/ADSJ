package UserDefined_ArrayList;

public class UArrayQueue<E> {
	private int front;
	private int rear;
	private E[] qArr;
	
	@SuppressWarnings("unchecked")
	public UArrayQueue(int cap) {
		qArr = (E[]) new Object[cap];
		front = 0;
		rear = -1;
	}
	
	public UArrayQueue(E[] qarr) {
		this.qArr = qarr;
	}
	
	public boolean isEmpty() {
		return front > rear;
	}
	
	public boolean isFull(){
		return rear == qArr.length -1;
	}
	
	public boolean enqueue(E ele) {
		if(isFull())
			return false;
		qArr[++rear] = ele;
		return true;
	}
	
	public E dequeue() {
		if(isEmpty())
			return null;
		return qArr[front++];
	}
	
	public void display() {
		System.out.println("The Elements are : ");
		for(int i = front;i<=rear;i++) {
			System.out.print(qArr[i] + " ");
		}
		System.out.println(" ");
	}
}
