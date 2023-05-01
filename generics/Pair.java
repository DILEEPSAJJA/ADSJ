package generics;

public class Pair<K,V> {
	private K key;
	private V value;
	
	public Pair() {}
	public Pair(K key ,V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() { return key; } 
	public void setKey(K key) { this.key = key; }
	
	public V getValue() { return value; }
	public void setValue(V value) { this.value = value; }
	
	public String toString() {
		return "[ key : " + key + " , type : " + key.getClass().getSimpleName() + " ]" + "\n" + 
				"[ value : " + value + " , type : " + value.getClass().getSimpleName() + " ]";
	}
}
