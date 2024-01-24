package bst;
public class BST<T extends Comparable<T>> {
	
	private class Node{
		T data;
		Node lChild;
		Node rChild;
		
		public Node(T data) {
			this.data = data;
			lChild = null;
			rChild = null;
		}
		@SuppressWarnings("unused")
		public String toString() {
			return "Data : " + data;
		}
	}
	
	private Node root;
	
	public BST() {root = null;}
	
	public boolean insert(T ele) {
		if(root == null)
			root = new Node(ele);
		Node temp = root,ptemp = null;
		while(temp != null) {
			ptemp = temp;
			if(temp.data.compareTo(ele) > 0)
				temp = temp.lChild;
			else if(temp.data.compareTo(ele) < 0)
				temp = temp.rChild;
			else
				return false;
		}
		if(ptemp.data.compareTo(ele) > 0)
			ptemp.lChild = new Node(ele);
		else
			ptemp.rChild = new Node(ele);
		
		return true;
	}
	
	void inOrder() { inOrder(root); }

	void inOrder(Node temp) {
		if(temp != null) {
			inOrder(temp.lChild);
			System.out.print(temp.data + " ");
			inOrder(temp.rChild);
		}
	}
	
	void preOrder() { preOrder(root); }

	void preOrder(Node temp) {
		if(temp != null) {
			System.out.print(temp.data + " ");
			inOrder(temp.lChild);
			inOrder(temp.rChild);
		}
	}
	
	void postOrder() { postOrder(root); }

	void postOrder(Node temp) {
		if(temp != null) {
			inOrder(temp.lChild);
			inOrder(temp.rChild);
			System.out.print(temp.data + " ");
		}
	}

}
