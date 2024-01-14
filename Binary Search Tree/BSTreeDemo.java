package bst;

import java.util.*;

public class BSTreeDemo {
	public static void main(String[] args) {
		
		BSTree<Integer> bst = new BSTree<>();
		Scanner sc = new Scanner(System.in);
		
		bst.insert(10);
		bst.insert(20);
		bst.insert(15);
		System.out.println("1)insert \t2)remove \t3)search\t 4)display\t 5)exit\n");
		
		while(true) {
			
			System.out.println("Enter Your Choice: ");
			int ch = sc.nextInt();
		
			switch (ch) {
				case 1: System.out.println("Enter value : ");
						Integer elem = sc.nextInt();
						bst.insert(elem);
						System.out.println(elem + " is added.");
						break;
				
				case 2: System.out.println("Enter Element to remove : ");
						elem = sc.nextInt();
						if(bst.search(elem)) {
							bst.remove(elem);
							System.out.println(elem + " is removed.");
						}
						else
							System.out.println(elem + " is not found");
						break;
			
				case 3: System.out.println("Enter element : ");
						elem = sc.nextInt();
						if(bst.search(elem))
							System.out.println(elem + " is found.");
						else
							System.out.println(elem + " is not found.");
						break;
			
				case 4: System.out.print("inorder : ");
						bst.inOrder();
						System.out.println();
						System.out.print("preorder : ");
						bst.preOrder();
						System.out.println();
						System.out.print("postorder : ");
						bst.postOrder();
						System.out.println();
						break;
			
				case 5: sc.close();
						System.exit(0);
			
				default: System.out.println("Enter valid input.");
			}
		}
	}
}
