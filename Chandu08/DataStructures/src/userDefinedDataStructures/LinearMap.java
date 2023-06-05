package userDefinedDataStructures;
import java.util.*;
public class LinearMap <K,V> {
	
	private class Entry {
		K key;
		V value;
		public Entry() {}
		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
		public String toString() {
			return "Key : "+key+", Value : "+value;
		}
	}
	
	private class Node{
		Entry data;
		Node next;
		public Node(Entry data , Node next) {
			this.data = data;
			this.next = next;
		}
		public String toString() {
			return "Data : [ "+data+" ]";
		}
	}
	Node head;
	public V put(K key, V value) {
		if(head == null) {
			head = new Node(new Entry(key, value), null);
			return null;
		}
		Node ptemp = null;
		Node temp = head;
		while(temp != null) {
			if(temp.data.key.equals(key)) {
				V tempValue = temp.data.value;
				temp.data.value = value;
				return tempValue;
			}
			ptemp = temp;
			temp = temp.next;
		}
		ptemp.next = new Node(new Entry(key,value), null);
		return null;
	}
	
	V get(K key) {
		Node temp = head;
		while(temp != null) {
			if(temp.data.key.equals(key))
				return temp.data.value;
			temp = temp.next;
		}
		return null;
	}
	
	V remove(K key) {
		Node temp = head;
		Node ptemp = null;
		V tvalue;
		if(head.data.key.equals(key)) {
			tvalue = head.data.value;
			head = head.next;
		}
		else {
			while(temp!= null) {
				if(temp.data.key.equals(key)) {
					tvalue = temp.data.value;
					ptemp.next = temp.next;
				}
				ptemp = temp;
				temp = temp.next;
			}
		}
		return null;
	}
	
	Set<Entry> entrySet(){
		LinkedHashSet<Entry> entries = new LinkedHashSet<>();
		Node temp = head;
		while(temp != null) {
			entries.add(temp.data);
			temp = temp.next;
		}
		return entries;
	}
	
	void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	Set<K> keySet(){
		LinkedHashSet<K> keys = new LinkedHashSet<>();
		Node temp = head;
		while(temp != null) {
			keys.add(temp.data.key);
			temp = temp.next;
		}
		return keys;
	} 
	
	Collection<V> values(){
		LinkedList<V> val = new LinkedList<>();
		Node temp = head;
		while(temp != null) {
			val.add(temp.data.value);
			temp = temp.next;
		}
		return val;
	}
	
	boolean containsKey(K key) {
		Node temp = head;
		while(temp != null) {
			if(key.equals(temp.data.key))
				return true;
			temp = temp.next;
		}
		return false;
	}
	
	boolean containsValue(V  value) {
		Node temp = head;
		while(temp != null) {
			if(value.equals(temp.data.value))
				return true;
			temp = temp.next;
		}
		return false;
	}
}
