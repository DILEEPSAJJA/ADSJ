package userDefinedDataStructures;

public class SeperateChaining<K,V> {
	Node<K,V>[] table;
	int size;
	int n;
	private class Node<K,V>{
		K key;
		V value;
		Node<K,V> next;
		public Node(K key,V value ,Node next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
		public String toString() {
			return "Key : "+key+", Value : "+value;
		}
	}
	
	public SeperateChaining(int cap) {
		table = new Node[cap];
		size = cap;
	}
	
	public int size() {
		return n;
	}
	
	public boolean isEmpty() {
		return n==0;
	}
	
	public V get(K key) {
		int h = (int)key % size;
		Node<K,V> temp = table[h];
		while(temp!= null) {
			if(temp.key.equals(key))
				return temp.value;
			temp = temp.next;
		}
		return null;
	}
	
	public boolean contains(K key) {
		int h = (int)key % size;
		Node<K,V> temp = table[h];
		while(temp!= null) {
			if(temp.key.equals(key))
				return true;
			temp = temp.next;
		}
		return false;
	}
	
	public void put(K k, V val) {
		int h = (Integer)k % size;
		Node<K,V> temp = table[h];
		if(table[h] == null)
			table[h] = new Node(k,val,null);
		else {
			if(temp.key.equals(k)) {
				temp.value = val;
				return;
			}
			while(temp.next != null) {
				if((temp.key).equals(k))
				{
					temp.value = val;
					return;
				}
				else
					temp = temp.next;
			}
			temp.next = new Node(k,val,null);
		}
		n++;
	}
	
	public V remove(K key) {
		int h = (Integer)key%size;
		if(contains(key)) {
			Node<K,V> pTemp = null;
			Node<K,V> temp = table[h];
			if(table[h].key.equals(key)) {
				V val = table[h].value;
				table[h] = temp.next;
				n--;
				return val;
			}
			else {
				while(temp != null) {
					if(temp.key.equals(key)) {
						V val = temp.value;
						pTemp.next = temp.next;
						n--;
						return val;
					}
					pTemp = temp;
					temp = temp.next;
				}
			}
		}
		return null;
	}
	
	public void display() {
		for(int i = 0;i< size;i++) {
			Node<K,V> temp = table[i];
			if(temp == null)
				continue;
			System.out.println("Key \t Value");
			while(temp != null) {
				System.out.println(temp.key +"\t"+temp.value);
				temp = temp.next;
			}
		}
	}
}