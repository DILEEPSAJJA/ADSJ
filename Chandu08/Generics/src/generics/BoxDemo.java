package generics;

public class BoxDemo {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>(100);
		Box<String> b2 = new Box<>("One");
		Box<Student> b3 = new Box<>(new Student(8,"Chandu"));
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		//updations
		int a = b1.getData();
		a *= 5;
		b1.setData(a);
		
		String str = b2.getData();
		str = str.toUpperCase();
		b2.setData(str);
		
		b3.setData(new Student(9,"Dileep"));

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
