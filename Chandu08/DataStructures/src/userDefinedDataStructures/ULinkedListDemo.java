package userDefinedDataStructures;
import java.util.Scanner;
public class ULinkedListDemo {
	public static void main(String[]  args) {
		Scanner sc = new Scanner(System.in);
		ULinkedList<String> ll = new ULinkedList<>();
		System.out.println("1.Add at end \t2.add at index\t3. remove at index\t"
				+ "4.remove element\t5.contains\t6.indexof\t7.isEmpty\t8.Size\t9.Display\t10.Exit");
		while(true) {
			System.out.println("Choose one from above options");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1 :System.out.println("Enter the string to add");
						String str = sc.nextLine();
						if(ll.add(str))
							System.out.println("String added");
						else
							System.out.println("Unable to add");
						break;
				case 2 :System.out.println("Enter the index,string to add");
						int ind = sc.nextInt();
						sc.nextLine();
						str = sc.nextLine();
						if(ll.add(str,ind))
							System.out.println("String added");
						else
							System.out.println("Unable to add");
						break;
				case 3 :System.out.println("Enter the index to remove");
						ind = sc.nextInt();
						sc.nextLine();
						String s = ll.remove(ind);
						if(s != null)
							System.out.println("String : "+s);
						else
							System.out.println("Unable to remove");
						break;
				case 4 :System.out.println("Enter the string to remove");
						str = sc.nextLine();
						if(ll.remove(str))
							System.out.println("String removed");
						else
							System.out.println("Unable to remove");
						break;
				case 5 :System.out.println("Enter the string to check");
						str = sc.nextLine();
						if(ll.contains(str))
							System.out.println("String is there");
						else
							System.out.println("String is not there");
						break;
				case 6 :System.out.println("Enter the string to find");
						str = sc.nextLine();
						ind = ll.indexOf(str);
						if(ind != -1)
							System.out.println("String found at "+ ind);
						else
							System.out.println("Unable to find");
						break;
				case 7 :if(ll.isEmpty())
							System.out.println("Linked list is empty");
						else
							System.out.println("Linked lsit is not empty");
						break;
				case 8 :System.out.println("Size of linked list is : "+ll.size());
						break;
				case 9 :System.out.println("Linkedlist elements are : "); 
						ll.display();
						break;
				case 10:ll.clear();
						System.exit(0);
				default : System.out.println("Enter correct choice");	
			}
		}
	}
}
