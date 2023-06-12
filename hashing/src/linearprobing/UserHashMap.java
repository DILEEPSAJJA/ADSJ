package linearprobing;

public class UserHashMap<K, V> {
	
	private class Entry{
		K key;
		V value;
		
		Entry(K key, V value){
			this.key = key;
			this.value = value;
		}
		
		public String toString() {
			return "Key : " + key + " ,value : " + value ;
		}
	}
	private Object[] hTable;
	private int size;
	
	public UserHashMap() {
		hTable = new Object[10];
		size = 10;
	}
	
	public UserHashMap(int n) {
		hTable = new Object[n];
		size = n;
	}
	
	public boolean put(K key, V value) {
		int index = hash(key);
		if(index == -1)
			return false;
		else if(index == 0)
			hTable[index] = new Entry(key, value);
		else {
			index = linearProbe(index);
			if(index != -1)
				hTable[index] = new Entry(key, value);
			else
				return false;
		}
		return true;
	}

	private int linearProbe(int index) {
		for(int i=1 ;i<size;i++) {
			int newIndex = (index + i)%size;
			if(hTable[newIndex] == null)
				return newIndex;
		}
		return -1;
	}

	public int hash(K key) {
		if(key.getClass().getSimpleName().equals("Integer"))
			return (int)key%size;
		else if(key.getClass().getSimpleName().equals("String"))
			return key.toString().codePointAt(0)%size;
		else
			return -1;
	}
	
	public void display() {
		for(int i=0;i<size;i++) {
			if(hTable[i] != null)
				System.out.println(i + " " +hTable[i] );
		}
	}
	
	@SuppressWarnings({ "unchecked", "unused" })
	public V get( K key) {
		int index = hash(key);
		Entry ele = (UserHashMap<K, V>.Entry)hTable[index];
		if(ele != null && key.equals(ele.key))
			return ele.value;
		else {
			for(int i=1;i<size;i++) {
				int newIndex = (index + i)%size;
				ele = (UserHashMap<K, V>.Entry)hTable[newIndex];
				return ele.value;
			}
		}
		return null;
	}
	
	@SuppressWarnings({ "unchecked", "unused" })
	public V remove(K key) {
		int index = hash(key);
		Entry ele = (UserHashMap<K, V>.Entry)hTable[index];
		if(ele != null && key.equals(ele.key)) {
			hTable[index] = null;
			return ele.value;
		}
		else {
			for(int i=1;i<size;i++) {
				int newIndex = (index + i)%size;
				ele = (UserHashMap<K, V>.Entry)hTable[newIndex];
				hTable[newIndex] = null;
				return ele.value;
			}
		}
		return null;
	}
}
