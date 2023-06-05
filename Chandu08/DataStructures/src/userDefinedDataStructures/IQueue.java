package userDefinedDataStructures;

public interface IQueue<E> {
	public E peek();
	public E dequeue();
	public boolean enqueue(E ele);
	public boolean isEmpty();
	public int size();
}
