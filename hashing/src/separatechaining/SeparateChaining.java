package separatechaining;

public class SeparateChaining<K, V> {
	
	private Node<K,V>[] table;
	private int size;
	private int n;
	
	private class Node<K, V>{
		private K key;
		private V value;
		private Node<K, V> next;
		
		public Node() {	}
		public Node(K key,V value,Node next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public SeparateChaining(int capacity) {
		table = new Node[capacity];
		size = capacity;
	}
	
	public int size() {
		return n;
	}
	
	public boolean isEmpty() {
		return n==0;
	}
	
	public V get(K key) {
		int h;
		int k = (Integer)key;
		h = k%size;
		Node t = table[h];
		
		while(t != null) {
			if(t.key.equals(key)) {
				V val = (V) t.value;
				return val;
			}
			t =t.next;
		}
		return null;
	}
	
	public boolean contains(K key) {
		int h;
		int k = (Integer)key;
		h = k%size;
		Node t = table[h];
		
		while(t != null) {
			if(t.key.equals(key)) {
				return true;
			}
			t =t.next;
		}
		return false;
	}
	
	public void put(K key, V value) {
		int h;
		int k = (Integer)key;
		h = k%size;
		Node<K, V> nn = new Node<>(key,value,null);
		
		if(table[h] == null)
			table[h] = nn;
		else {
			Node<K, V> t = table[h];
			while(t.next != null) 
				t = t.next;
			t.next = nn;
		}
		n++;
	}
	
	public V remove(K key) {
		
		if(contains(key))
			System.out.println("Data deleted successfully");
		
		int h;
		int k = (Integer)key;
		h = k%size;
		
		if(table[h].key.equals(key)) {
			V val = table[h].value;
			table[h] = table[h].next;
			n--;
			return val;
		}
		
		Node<K, V> t = table[h] , p = null;
		while(t != null) {
			if(t.key.equals(key)) {
				V val = t.value;
				p.next = t.next;
				n--;
				return val;
			}
		
		p=t;
		t =t.next;
		}
		System.out.println("Given data is not present.");
		return null;
	}
	
	public void display() {
		
		for(int i=0;i<size;i++) {
			
			Node t = table[i];
			
			if(t != null) {
				System.out.println("Data at index " + i + "in hashTable.");
				System.out.printf(" %-9s%s\n","IP","value");
				System.out.println("------------------");
			}
			
			while(t != null) {
				
				System.out.printf(" %-9s%s\n",t.key,t.value);
				t = t.next;
			}
		}
	}	
}
