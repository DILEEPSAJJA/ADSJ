package userdefined_ll;

public interface Istack<T> {
	boolean isEmpty();
	int size();
	void push(T ele);
	T pop();
	T peek();
}
