import java.util.*;
public class BinaryTree
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	
		Node root=createTree();
		inOrder(root);
		
	}
	
	static Node createTree()
	{
	    	Scanner Sc=new Scanner(System.in);
	    Node root=null;
	    System.out.println("Enter data:");
	    int data=Sc.nextInt();
	    
	    if(data==-1) return null;
	    
	    root=new Node(data);
	    
	    System.out.println("Enter the left of "+data);
	    root.left=createTree();
	    
	    
	    System.out.println("Enter the right of"+data);
	    root.right=createTree();
	    return root;
	}
	
	static void inOrder(Node root){
	    if(root==null) return;
	    
	    inOrder(root.left);
	    System.out.print(root.data+ " ");
	    inOrder(root.right);
	}
	
	static void preOrder(Node root){
	    if(root==null)return;
	    
	    System.out.print(root.data+" ");
	    preOrder(root.left);
	    preOrder(root.right);
	}
	
	static void postOrder(Node root){
	    postOrder(root.left);
	    postOrder(root.right);
	    System.out.println(root.data+" ");
	}
}
class Node{
    Node left,right;
    int data;
    
    public Node(int data){
        this.data=data;
    }
}
