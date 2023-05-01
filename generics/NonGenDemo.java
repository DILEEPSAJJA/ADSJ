package generics;

public class NonGenDemo {
	public static void main(String[] args) {
		
		NonGen obj1 = new NonGen(10);
		NonGen obj2 = new NonGen("one");
	
		System.out.println(obj1);
		System.out.println(obj2);
	
		int idata = (int)obj1.getData();
	
		idata += 10;
		obj1.setData(idata);
		System.out.println(obj1);
		
		String sdata = (String)obj2.getData();
		
		sdata = sdata.toUpperCase();
		obj2.setData(sdata);
		System.out.println(obj2);
	}
}
