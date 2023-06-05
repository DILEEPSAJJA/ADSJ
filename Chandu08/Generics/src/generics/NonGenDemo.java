package generics;

public class NonGenDemo {

	public static void main(String[] args) {
		Integer num = 10;
		String str = "one";
		
		NonGen a = new NonGen(num);
		NonGen b = new NonGen(str);
		
		System.out.println(a);
		System.out.println(b);
		
		num = 10 + (Integer)a.getData();
		str = ((String)b.getData()).toUpperCase();
		
		a.setData(num);
		b.setData(str);
		
		System.out.println(a);
		System.out.println(b);
		
		//a=b ;
		//it leads to classcast exception during runtime but wont show during compile time
	}

}
