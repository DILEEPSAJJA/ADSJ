package preDefinedDS;
import java.util.*;
import java.util.Queue;
import java.util.Queue.*;
public class DequeueDemo {
	public static void main(String[] args) {
		Queue<Integer> que = new PriorityQueue<>();
		System.out.println(que.add(10));
		System.out.println(que.isEmpty());
		System.out.println(que.remove(20));
		System.out.println(que.offer(20));
	}
}
