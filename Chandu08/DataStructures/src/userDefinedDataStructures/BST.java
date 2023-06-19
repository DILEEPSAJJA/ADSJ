package userDefinedDataStructures;

public class BST<T extends Comparable <T>>{
	private class Node{
		T data;
		Node lchild;
		Node rchild;
		Node(T data){
			this.data = data;
			lchild = null;
			rchild = null;
		}
		public String toString() {
			return data+" ";
		}
	}
	private Node root ;
	public BST() {root = null;}
	
	public boolean insert(T ele) {
		if(root == null)
			root = new Node(ele);
		Node ptemp = null, temp = root;
		while(temp != null) {
			ptemp = temp;
			if(temp.data.compareTo(ele) > 0)
				temp = temp.lchild;
			else if(temp.data.compareTo(ele) < 0)
				temp = temp.rchild;
			else 
				return false;
		}
		if(ptemp.data.compareTo(ele) > 0)
			ptemp.lchild = new Node(ele);
		else
			ptemp.rchild = new Node(ele);
		return true;
	}
	public void inorder() {inorder(root);}
	public void preorder() {preorder(root);}
	public void postorder() {postorder(root);}
	public void inorder(Node temp) {
		if(temp != null) {		
			inorder(temp.lchild);
			System.out.print(temp);
			inorder(temp.rchild);
		}
	}
	public void preorder(Node temp) {
		if(temp != null) {	
			System.out.print(temp);
			preorder(temp.lchild);
			preorder(temp.rchild);
		}
	}
	public void postorder(Node temp) {
		if(temp != null) {	
			postorder(temp.lchild);
			postorder(temp.rchild);
			System.out.print(temp);
		}
	}
}
