package userdefined_ll;

import java.util.Scanner;

public class ULinkedListDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ULinkedList<String> ll = new ULinkedList<>();
		
		while(true) {
			System.out.println("1.add an element    2.add with index    3.remove element    " +
								"4.remove with index    5.display    6.search    7.exit");
			System.out.println("Enter Your choice : ");
			int ch = sc.nextInt();
			
			switch(ch) {
			
			case 1: System.out.println("Enter Element : ");
			    	String ele = sc.next();
			    	if(ll.add(ele))
			    		System.out.println(ele + " is added.");
			    	else
			    		System.out.println(ele + " is not added.");
			    	break;
				
			case 2: System.out.println("Enter index, Element : ");
					int index = sc.nextInt();
	    			ele = sc.next();
	    			if(ll.add(index, ele))
	    				System.out.println(ele + " is added at " + index);
	    			else
	    				System.out.println(ele + " is not added at " + index);
	    			break;
				
			case 3: System.out.println("Enter Element to remove : ");
	    			ele = sc.next();
	    			if(ll.remove(ele))
	    				System.out.println(ele + " is removed.");
	    			else
	    				System.out.println(ele + " is not removed.");
	    			break;
	    			
			case 4 : System.out.println("Enter index : ");
					 index = sc.nextInt();
					 String dele = ll.remove(index);
					 if(null != dele)
						 System.out.println(dele + " is removed at " + index);
					 else
						 System.out.println(dele + " is not removed at " + index);
					 break;
	    			
			case 5 : ll.display();
					 break;
					 
			case 6 : System.out.println("Enter Element to search : ");
	    			 ele = sc.next();
	    			 if(ll.cointains(ele))
	    				 System.out.println(ele + " is found.");
	    			 else
	    				 System.out.println(ele + " is not found.");
	    			 break;
	    			
			case 7 : sc.close();
					 System.exit(0);
					 
			default : System.out.println("Invalid input.");
			}
		}
	}
}
