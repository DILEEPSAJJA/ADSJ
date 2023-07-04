package problems;

public class Node {
public class ListNode{
	int val;
	ListNode next;
	
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	public void display() {
ListNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		
		System.out.println("null");
		// TODO Auto-generated method stub
		
	}
	public void add(int ele) {
		// TODO Auto-generated method stub
		if(head == null)
			head = new ListNode(ele);
		else {
			ListNode temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = new ListNode(ele);
		}
		
	}
}
	private ListNode head;
	
	public void display() {
		
		ListNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		
		System.out.println("null");
	}
	
	public boolean add(int ele) {
		if(head == null)
			head = new ListNode(ele);
		else {
			ListNode temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = new ListNode(ele);
		}
		return true;
	}
	
}