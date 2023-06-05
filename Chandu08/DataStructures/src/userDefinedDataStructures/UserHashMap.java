package userDefinedDataStructures;
public class UserHashMap<K,V> {
	private class Entry{
		K key;
		V value;
		Entry(K key, V value){
			this.key = key;
			this.value = value;
		}
		public String toString() {
			return "Key : "+key+", Value : "+value+"\n";
		}
	}
	
	Object[] hTable;
	int size;
	
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
		if(index == -1 )
			return false;
		if(hTable[index] == null)
			hTable[index] = new Entry(key, value);
		else {
			index = linearProbe(index);
			if(index == -1)
				return false;
			else
				hTable[index] = new Entry(key, value);
		}
		return true;
	}
	
	public int hash(K key) {
		String name = key.getClass().getSimpleName();
		if(name.equals("Integer"))
			return (int)key%size;
		else if(name.equals("String"))
			return ((String)key).codePointAt(0) % size;
		else 
			return -1;
	}
	
	public int linearProbe(int index) {
		for(int i = 1;i< size;i++) {
			int newIndex = (index + i) % size;
			if((hTable[newIndex] == null))
				return newIndex;
		}
		return -1;
	}
	
	public V get(K key) {
		int index = hash(key);
		Entry ele = (UserHashMap<K,V>.Entry)hTable[index];
		if(ele != null && ele.key.equals(key))
			return ele.value;
		else {
			for(int i = 1;i < size;i++) {
				int newInd = ((int)key + i)% size;
				ele = (UserHashMap<K,V>.Entry)hTable[newInd];
				if(ele != null && ele.key.equals(key))
					return ele.value;
			}
			return null;
		}
	}
	
	public V remove(K key){
		int index = hash(key);
		Entry ele = (UserHashMap<K,V>.Entry)hTable[index];
		if(ele != null && ele.key.equals(key)) {
			hTable[index] = null;
			return ele.value;
		}
			
		else {
			for(int i = 1;i < size;i++) {
				int newInd = ((int)key + i)% size;
				ele = (UserHashMap<K,V>.Entry)hTable[newInd];
				if(ele != null && ele.key.equals(key)){
					hTable[newInd] = null;
					return ele.value;
				}
			}
			return null;
		}
	}
	
	public void display() {
		for(int i = 0;i< size ;i++) {
			if(hTable[i] != null)
				System.out.println(hTable[i]);
		}
	}
}
