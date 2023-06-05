package preDefinedDS;
import java.util.Scanner;
import java.util.Stack;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<>(); 
		System.out.println("Enter a stirng");
		String str = sc.nextLine();
		for(int i = 0;i<str.length();i++)
			stk.push(str.charAt(i));
		System.out.println("Given string is "+str);
		System.out.print("Reverse of a String is ");
		while(!stk.isEmpty())
			System.out.print(stk.pop());
		System.out.println();
	}
}
