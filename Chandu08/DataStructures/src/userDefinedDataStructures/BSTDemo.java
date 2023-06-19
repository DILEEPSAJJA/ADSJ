package userDefinedDataStructures;
import java.util.Scanner;
public class BSTDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BST<Integer> bst = new BST<>();
		bst.insert(30);
		bst.insert(43);
		bst.insert(12);
		bst.insert(6);
		bst.insert(18);
		bst.insert(15);
		bst.insert(21);
		bst.insert(35);
		bst.insert(47);
		bst.insert(26);
		System.out.println("1.Add 2.Delete 3.Inorder 4.Preorder 5.Postorder 6.exit");
		while(true) {
			System.out.print("Choose an option :");
			int opt = sc.nextInt();
			switch(opt) {
			case 1: System.out.print("Enter ele :");
					int ele = sc.nextInt();
					System.out.println(bst.insert(ele));
					break;
			case 2: break;
			case 3: bst.inorder();
					System.out.println();
					break;
			case 4: bst.preorder();
					System.out.println();
					break;
			case 5: bst.postorder();
					System.out.println();
					break;
			case 6: System.exit(0);
			default:System.out.println("Choose correct one");
			}
		}
	}

}
