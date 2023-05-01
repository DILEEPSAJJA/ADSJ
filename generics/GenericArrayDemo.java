package generics;

public class GenericArrayDemo {
	public static void main(String[] args) {
		
		Integer[] arr = {100,25,300,40,5};
		
		GenericArray<Integer> obj1 = new GenericArray<>(arr);
		
		System.out.println(obj1);
		obj1.insert(0, 9);
		obj1.sort();
		System.out.println(obj1);
		
		String[] sarr = {"one","two","three","four"};
		
		GenericArray<String> obj2 = new GenericArray<>(sarr);
		System.out.println(obj2);
		obj2.insert(1,"Dileep");
		obj2.sort();
		System.out.println(obj2);
		
		Product[] product = {
				new Product(101, "pen"),
				new Product(102, "pencil"),
				new Product(103, "Book")
			};
		
		GenericArray<Product> parr = new GenericArray<>(product);
		
		System.out.println(parr);
		parr.insert(1, new Product(100, "pencil"));
		parr.sort();              
		System.out.println(parr);
	}
}
