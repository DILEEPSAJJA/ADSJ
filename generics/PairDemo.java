package generics;

import java.util.Scanner;

public class PairDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the cart size : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Pair[] pair = new Pair[n];
		
		int Cartquantity = 0;
		for(int i=0 ; i<n ; i++ ) {
			System.out.println("Enter product details and quantity : ");
			String name = sc.nextLine();
			int qty = sc.nextInt();
			sc.nextLine();
			Cartquantity += qty;
			pair[i] = new Pair<String,Integer>(name,qty);
		}
		
		for(Pair product: pair) {
			System.out.println(product);
		}
		System.out.println("no.of Cartquantity : " + Cartquantity);
		
		sc.close();
	}
}
