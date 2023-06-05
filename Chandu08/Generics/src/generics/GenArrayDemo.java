package generics;

public class GenArrayDemo {

	public static void main(String[] args) {
		Integer[] iarr = {5,4,3,2,1};
		String[] sarr = {"one","two","three","four"};
		Product[] parr = {  new Product (1,"Pen"),
							new Product (2,"Book"),
							new Product (3,"Scale")};
		
		GenArray<Integer> a = new GenArray<>(iarr);
		GenArray<String> b = new GenArray<>(sarr);
		GenArray<Product> c = new GenArray<>(parr);
		
		System.out.println("Before sort");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		//insertion
		a.insert(1, 10);
		b.insert(2,"five");
		c.insert(0,new Product(10,"watch"));
		
		a.sort();
		b.sort();
		c.sort();
		
		System.out.println("Elements after insertion and sort");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
