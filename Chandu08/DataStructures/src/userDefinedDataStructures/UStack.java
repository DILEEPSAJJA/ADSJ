package userDefinedDataStructures;
import java.util.Iterator;
public class UStack<E> {
	private int top = -1;
	E[] stack;
	
	public UStack() {
		stack = (E[]) new Object[10];
	}
	public UStack(int cap) {
		stack = (E[]) new Object[cap];
	}
	public UStack(E[] stack) {
		this.stack = stack;
	}
	public E eleAt(int index) {
		if(isEmpty())
			return null;
		else if(index > top || index < 0 )
			return null;
		return stack[index];
	}
	public boolean isFull() {
		return top == (stack.length-1);
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean push(E ele) {
		if(isFull())
			return false;
		stack[++top] = ele;
		return true;
	}
	
	public E pop() {
		if(isEmpty())
			return null;
		return stack[top--];
	}
	
	public E peek() {
		if(isEmpty())
			return null;
		return stack[top];
	}
	
	public int top() {
		return top;
	}
	
	public void clear() {
		top = -1;
	}
	
	public void display() {
		for(int i = 0;i <= top;i++)
			System.out.print(stack[i] +" ");
		System.out.println();
	}
}
