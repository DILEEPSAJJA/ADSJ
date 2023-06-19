package bst;

import java.util.*;

public class BSTDemo {
	
	public static void main(String[] args) {
		
		BST<Integer> ph = new BST<>();
		Scanner sc = new Scanner(System.in);
		
		ph.insert(10);
		ph.insert(20);
		ph.insert(15);
		ph.insert(5);
		ph.insert(7);
		ph.insert(25);
		ph.insert(3);
		ph.insert(17);
		
		System.out.println("1)insert \t2)inorder \t3)preorder\t 4)postorder\t 5)exit\n");
		
		while(true) {
			
			System.out.println("Enter Your Choice: ");
			int ch = sc.nextInt();
		
			switch (ch) {
				case 1: System.out.println("Enter value : ");
					Integer elem = sc.nextInt();
					ph.insert(elem);
						System.out.println(elem + " is added.");
					break;
				
				case 2: 
					 ph.inOrder();
					 System.out.println();
					 break;
			
				case 3: 
					ph.preOrder();
					System.out.println();
					break;
			
				case 4: ph.postOrder();
					System.out.println();
					break;
			
				case 5: sc.close();
					System.exit(0);
			
				default: System.out.println("Enter valid input.");
				
			}
		}
		
	}
}
