package problems;

import java.util.*;

import problems.Node.ListNode;

public class ReverseLL{
	
	public static void main(String[] args) {
		
		
		Node list = new Node();
 		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.display();
		
		//ListNode NewList = reverseList(list);
		
		//NewList.display();
//		
		ListNode prev = null;
		Node temp = list;
		while(temp != null){
			ListNode node = temp.next;
            temp.next = prev;
            prev = temp;
            temp = node;
      }
		prev.display();
		
	}

	public static ListNode reverseList(ListNode list) {
		ListNode prev = null;
		ListNode temp = list;
		while(temp != null){
			ListNode node = temp.next;
            temp.next = prev;
            prev = temp;
            temp = node;
      }
		return prev;
	}

}