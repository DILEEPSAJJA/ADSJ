package inbuiltds;

import java.util.*;

public class QueueDemo {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		
		System.out.println(queue);
		
		System.out.println("Removed Element : " + queue.remove());
		System.out.println(queue);
		
		System.out.println("Removed Element : " + queue.poll());
		System.out.println(queue);
		
		System.out.println("Top Element : " + queue.peek());
		System.out.println(queue);
	}
}
