package generics;

public class Searching {
	
	@SuppressWarnings("unused")
	static int IntSearch(Integer[] data,Integer key) {
		for(int i=0;i<data.length;i++) {
			if(data[i].equals(key));
				return i;
		}
		return -1;
	}
	@SuppressWarnings("unused")
	static int StringSearch(String[] data,String key) {
		for(int i=0;i<data.length;i++) {
			if(data[i].equals(key));
				return i;
		}
		return -1;
	}
	
}
