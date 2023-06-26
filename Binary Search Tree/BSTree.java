package bst;

public class BSTree<T extends Comparable<T>> {
	
	private class Node{
		T data;
		Node left;
		Node right;
		
		@SuppressWarnings("unused")
		Node(T ele){
			this.data = ele;
			left = null;
			right = null;
		}
	}
	private Node root;
	
	void insert(T ele) {
		root = insert(root, ele);
	}

	private Node insert(Node root, T ele) {
		if(root == null) return new Node(ele);
		if(ele.compareTo(root.data)<0)
			root.left = insert(root.left,ele);
		else if(ele.compareTo(root.data)>0)
			root.right = insert(root.right,ele);
		return root;
	}
	
	T getMin(T ele) {
		return getMin(root);
	}
	private T getMin(Node root) {
		if(root == null) return null;
		if(root.left == null) return root.data;
		return getMin(root.left);
	}
	
	T getMax(T ele) {
		return getMax(root);
	}
	private T getMax(Node root) {
		if(root == null) return null;
		Node temp = root;
		while(temp.right != null)
			temp = temp.right;
		return temp.data;	
	}
	
	void remove(T ele) {
		root = remove(root, ele);
	}

	private Node remove(Node root, T ele) {
		if(root == null) return null;
		if(ele.compareTo(root.data)<0)
			root.left = remove(root.left,ele);
		else if(ele.compareTo(root.data)>0)
			root.right = remove(root.right, ele);
		else {
			if(root.left == null && root.right == null)
				return null;
			else if(root.left == null && root.right != null)
				return root.right;
			else if(root.left != null && root.right == null)
				return root.left;
			else {
				root.data = getMax(root.left);
				root.left = remove(root.left, root.data);
			}
		}	
		return root;
	}
	
	boolean search(T key) {
		return search(root,key);
	}
	private boolean search(Node root, T key) {
		if(root == null ) return false;
		if(key.equals(root.data)) return true;
		if(key.compareTo(root.data) < 0)
			return search(root.left,key);
		else
			return search(root.right,key);
	}
	
	int height() {
		return height(root);
	}
	private int height(Node root) {
		if(root==null) return -1;
		return 1+Math.max(height(root.left), height(root.right));
	}
	
	int size() {
		return size(root);
	}
	
	private int size(Node root) {
		if(root==null) return 0;
		return size(root.left)+1+size(root.right);
	}
	
	void inOrder() { inOrder(root); }

	void inOrder(Node temp) {
		if(temp != null) {
			inOrder(temp.left);
			System.out.print(temp.data + " ");
			inOrder(temp.right);
		}
	}
	void preOrder() { preOrder(root); }

	void preOrder(Node temp) {
		if(temp != null) {
			System.out.print(temp.data + " ");
			preOrder(temp.left);
			preOrder(temp.right);
		}
	}
	
	void postOrder() { postOrder(root); }

	void postOrder(Node temp) {
		if(temp != null) {
			postOrder(temp.left);
			postOrder(temp.right);
			System.out.print(temp.data + " ");
		}
	}
}
