package userDefinedDataStructures;
import java.util.Iterator;
import java.util.Scanner;
public class UArrayListDemo {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the capacity of an array");
		int cap = sc.nextInt();
		UArrayList<Integer> arr = new UArrayList<>(cap);
		System.out.println("1.Add at End\t2.Add at index\t3.Remove object\t"
				+ "4.Remove at index\t5.isEmpty\t6.Size\t7.Display\t8.Clear\t9.Exit");
		while(true) {
			System.out.println("Choose one of the above options");
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : 
					System.out.println("Enter the element to be add");
					int ele = sc.nextInt();
					if(arr.add(ele))
						System.out.println(ele +" added successfully");
					else
						System.out.println("Failed to add "+ele);
					break;
				case 2 :
					System.out.println("Enter the index and ele to be add");
					int index = sc.nextInt();
					ele = sc.nextInt();
					if(arr.add(index,ele))
						System.out.println(ele +" added successfully at "+index);
					else
						System.out.println("Failed to add "+ele+" at "+index);
					break;
				case 3 : 
					System.out.println("Enter the element to be delete");
					Integer e = sc.nextInt();
					if(arr.remove(e))
						System.out.println(e +" removed successfully");
					else
						System.out.println("Failed to remove "+e);
					break;
				case 4 : 
					System.out.println("Enter the index to remove ele ");
					index = sc.nextInt();
					Integer element = arr.remove(index);
					if(element != null)
						System.out.println("Removed successfully and the element is "+element);
					else
						System.out.println("Failed to remove");
					break;
				case 5 :
					if(arr.isEmpty())
						System.out.println("ArrayList is empty");
					else
						System.out.println("ArrayList is not empty");
					break;
				case 6 :
					System.out.println("Array size is "+arr.size());
					break;
				case 7 :
					System.out.println("ArrayList elements are : ");
					Iterator<Integer> it = arr.iterator();
					while(it.hasNext())
						System.out.print(it.next()+" ");
					System.out.println();
					break;
				case 8 :
					arr.clear();
					System.out.println("ArrayList elements are cleared");
					break;
				case 9 :
					sc.close();
					System.exit(0);
				default :
					System.out.println("Choose a correct option");
			}
		}
	}

}
