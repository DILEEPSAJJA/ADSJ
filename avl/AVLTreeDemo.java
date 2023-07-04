package avl;

import java.util.*;

public class AVLTreeDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AVLTree<Integer> avl = new AVLTree<>();
		
		avl.insert(14);
		avl.insert(8);
		avl.insert(12);
		avl.insert(46);
		avl.insert(23);
		avl.insert(5);
		avl.insert(77);
		avl.insert(88);
		avl.insert(20);
		
		avl.display();
		
		sc.close();
		
//		System.out.println("1)insert\t2)search\t3)display\t4)exit");
//		
//		while(true) {
//			
//			System.out.println("Enter Your Choice: ");
//			int ch = sc.nextInt();
//		
//			switch (ch) {
//				case 1: System.out.println("Enter element : ");
//						Integer elem = sc.nextInt();
//						avl.insert(elem);
//						System.out.println(elem + " is added.");
//						break;
//				
//				case 2: System.out.println("Enter element to search : ");
//					 	elem = sc.nextInt();
//					 	if(avl.search(elem))
//					 		System.out.println(elem + " is found.");
//					 	else
//					 		System.out.println(elem + " is not found.");
//					 	break;
//			
//				case 3: 
//						avl.inOrder();
//						System.out.println();
//						break;
//			
//			
//				case 4: sc.close();
//						System.exit(0);
//			
//				default: System.out.println("Enter valid input.");
//				
//			}
//		}
		
	}
}
