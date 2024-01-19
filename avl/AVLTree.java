package avl;
public class AVLTree<T extends Comparable<T>> {
	
	private class Node{
		
		T key;
		Node left,right;
		int height;
		
		Node(T d){
			key = d;
			height = 1;
		}
	}
	
	private Node root;
	
	boolean isEmpty() {
		return root == null;
	}
	
	int max(int a,int b) {
		return (a>b)?a:b;
	}
	
	int height(Node n) {
		if(n==null) return 0;
		return n.height;
	}
	
	Node rightRotate(Node t) {
		Node L = t.left;
		t.left = L.right;
		L.right = t;
		
		t.height = max(height(t.left),height(t.right))+1;
		L.height = max(height(L.left),height(L.right))+1;
		
		return L;
	}
	
	Node leftRotate(Node t) {
		Node R = t.right;
		t.right = R.left;
		R.left = t;
		
		t.height = max(height(t.left),height(t.right))+1;
		R.height = max(height(R.left),height(R.right))+1;
		
		return R;
	}
	
	void insert(T key) {
		root = insert(root, key);
	}

	private Node insert(AVLTree<T>.Node node, T key) {
		
		if(node == null) return new Node(key);
		
		if(key.compareTo(node.key)<0)
			node.left = insert(node.left, key);
		else
			node.right = insert(node.right, key);
		
		node.height = 1 + max(height(node.left),height(node.right));
		
		int bal = getBalance(node);
		
		if(bal > 1 && key.compareTo(node.left.key)<0)
			return rightRotate(node);
		
		if(bal < -1 && key.compareTo(node.right.key)>0)
			return leftRotate(node);
		
		if(bal > 1 && key.compareTo(node.left.key)>0) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		
		if(bal < -1 && key.compareTo(node.right.key)<0) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}
		
		return node;
	}
	
	private int getBalance(Node node) {
		if(node == null) return 0;
		return height(node.left)-height(node.right);
	}
	
	boolean search(T key) {
		Node t = root;
		while(t != null) {
			if(key.equals(t.key))
				return true;
			if(key.compareTo(t.key)<0)
				t= t.left;
			else
				t =t.right;
		}
		return false;
	}
	
	void display() { inOrder(root); }

	void inOrder(Node temp) {
		if(temp != null) {
			inOrder(temp.left);
			System.out.print(temp.key + " ");
			inOrder(temp.right);
		}
	}
	
}
