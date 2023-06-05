package userDefinedDataStructures;

public class ULinkedList<E> {
	private class Node{
		private E data;
		private Node next;
		public Node(E data , Node next) {
			this.data = data;
			this.next = next;
		}
		public Node(E data) {
			this.data = data;
			next = null;
		}
		public String toString() {
			return data +" ";
		}
	}
	private Node head;
	
	public boolean isEmpty() {
		return head== null;
	}
	
	public int size() {
		Node temp = head;
		int count = 0;
		while(temp!= null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public boolean add(E ele) {
		if(isEmpty())
		{
			head = new Node(ele);
			return true;
		}
		Node temp = head;
		while(temp.next!= null) 
			temp = temp.next;
		temp.next = new Node(ele);
		return true;
	}
	
	public boolean add(E ele, int ind) {
		if(ind < 0 || ind > size())
			return false;
		if(ind == 0)
		{
			head = new Node(ele, head);
			return true;
		}
		Node temp = head;
		while(--ind> 0)
			temp = temp.next;
		temp.next = new Node(ele,temp.next);
		return true;
	}
	
	public boolean remove(Object o) {
		E key = (E)o;
		if(isEmpty())
			return false;
		if(key.equals(head.data))
		{
			head = head.next;
			return true;
		}
		Node temp = head.next;
		Node prev = head;
		while(temp!= null) {
			if(key.equals(temp.data))
				break;
			prev = temp;
			temp = temp.next;
		}
		if(temp == null)
			return false;
		prev.next = temp.next;
		return true;
	}
	
	public E remove(int ind) {
		if(ind < 0 || ind > (size()-1))
			return null;
		E ele;
		if(ind == 0)
		{
			ele = head.data;
			head = head.next;
			return ele;
		}
		Node temp = head.next;
		Node prev = head;
		while(--ind>0)
		{
			prev = temp;
			temp = temp.next;
		}
		ele = temp.data;
		prev.next = temp.next;
		return ele;
	}
	
	public boolean contains(Object o) {
		E key = (E)o;
		Node temp = head;
		while(temp!= null) {
			if(key.equals(temp.data))
				return true;
			temp = temp.next;
		}
		return false;
	}
	
	public int indexOf(Object o) {
		E key = (E)o;
		int count = 0;
		Node temp = head;
		while(temp != null)
		{
			if(key.equals(temp.data))
				return count;
			count++;
			temp = temp.next;
		}
		return -1;
	}
	
	public void display() {
		Node temp = head;
		while(temp!= null) {
			System.out.print(temp +" --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public void clear() {
		head = null;
	}
}
