package problems;

public class ll<E> {
	private class Node{
		E data;
		Node next;
		
		@SuppressWarnings("unused")
		Node(E data,Node next){
			this.data = data;
			this.next = next;
		}
		@SuppressWarnings("unused")
		Node(E data){
			this.data = data;
			next = null;
		}
		
		public String toString() {
			return data.toString();
		}
	}
	
	private Node head;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void clear() {
		head = null;
	}
	
	public boolean add(E ele) {
		if(head == null)
			head = new Node(ele);
		else {
			Node temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = new Node(ele);
		}
		return true;
	}
	
	public boolean add(int index, E ele) {
		if(index >=0 && index <= size()) {
			if(index == 0)
				head = new Node(ele,head);
			else {
				int count = 1;
				Node temp = head;
				while(count < index) {
					temp = temp.next;
					count++;
				}
				temp.next = new Node(ele, temp.next);
			}
			return true;
		}
		else
			return false;
	}
	
	@SuppressWarnings("unchecked")
	public boolean remove(Object ele) {
		E key = (E)ele;
		if(head == null)
			return false;
		else if(key.equals(head.data))
			head = head.next;
		else {
			Node ptemp = head,temp = head.next;
			while(temp != null) {
				if(key.equals(temp.data))
					break;
				ptemp = temp;
				temp = temp.next;
			}
			if(temp == null)
				return false;
			else {
				ptemp.next = temp.next;
				return true;
			}
		}
		return false;
	}
	
	public E remove(int index) {
		if(index >= 0 && index <= size()) {
			E key;
			if(index == 0) {
				key = head.data;
				head = head.next;
			}else {
				Node ptemp = head, temp = head.next;
				int count = 1;
				while(count < index) {
					count++;
					temp = temp.next;
					ptemp = temp;
				}
				key = temp.data;
				ptemp.next = temp.next;
			}
			return key;
		}
		else
			return null;
	}
	
	public int indexOf(Object obj) {
		@SuppressWarnings("unchecked")
		E ele = (E)obj;
		if(head == null) return -1;
		Node temp = head;
		int count = 0;
		while(temp != null) {
			if(ele.equals(temp.data))
				return count;
			
			count++;
			temp = temp.next;
		}
		return -1;
	}
	
	@SuppressWarnings("unchecked")
	public boolean cointains(Object obj) {
		E ele = (E)obj;
		Node temp = head;
		
		while(temp != null) {
			if(ele.equals(temp.data))
				return true;			
			temp = temp.next;
		}
		return false;
	}
	
	public int size() {
		int count =0;
		Node temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
}

/*

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public ListNode reverseList(ListNode head) {

        if(head == null) return null;

        ListNode prev = null;
        ListNode temp = head;
        while(temp != null){
            ListNode node = temp.next;
            temp.next = prev;
            prev = temp;
            temp = node;
        }
        return prev;
    }

	 * */