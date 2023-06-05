package generics;
import java.util.Scanner;

public class PairDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cart size");
		int n = sc.nextInt();
		sc.nextLine();
		Pair[] cart = new Pair[n];
		int cartQuantity = 0;
		for(int i = 0;i<n;i++) {
			String product;
			int qty;
			System.out.println("Enter the product and qty :");
			product = sc.nextLine();
			qty = sc.nextInt();
			sc.nextLine();
			cartQuantity += qty;
			cart[i] = new Pair<String,Integer>(product,qty);
		}
		
		System.out.println("Cart products and there quantities are : ");
		for(Pair products : cart) {
			System.out.println(products);
		}
		System.out.println("Total cart quantity is : "+cartQuantity);
		sc.close();
	}

}
