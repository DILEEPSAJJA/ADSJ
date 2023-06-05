package userDefinedDataStructures;

public class UQueue<E>{

	private int rare;
	private int front ;
	E[] que;
	int cap;
	public UQueue(int cap) {
		rare = -1;
		front = 0;
		que = (E[]) new Object[cap];
		this.cap = cap;
	}
	public UQueue(E[] que) {
		rare = -1;
		front = 0;
		this.que = que;
		cap = 10;
	}
	
	public E peek() {
		if(isEmpty())
			return null;
		return que[front];
	} 

	public E dequeue() {
		if(isEmpty())
			return null;
		E ele = que[front];
		front++;
		return ele;
	}

	public boolean enqueue(E ele ) {
		if(rare >= (cap -1 ))
			return false;
		que[++rare] = ele;
		return true;
	}

	public boolean isEmpty() {
		return rare < front;
	}
	
	public int size() {
		int j = 0;
		for(int i = front;i<=rare;i++ ,j++);
		return j;
	}
	public void display() {
		for(int i = front ;i<= rare ;i++)
			System.out.print(que[i]+" ");
		System.out.println();
	}
}
