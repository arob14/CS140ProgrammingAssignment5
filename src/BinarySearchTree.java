public class BinarySearchTree implements BinarySearchTreeFunctions
{
	private Node root;
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	public Node getRoot()
	{
		return root;
	}
	
	public void setRoot(Node root)
	{
		this.root = root;
	}
		
	public void insertNode(Node z) 	
	{
		Node x = getRoot();
		Node y = null;
		while(x != null) {
			x.setParent(y);
			if (z.getKey() < x.getKey()) {
				x = x.getLeft();
			}
			else {
				x = x.getRight();
			}
			z.setParent(y);
			if (y == null) {
				setRoot(z);
			}
			else if (z.getKey() < y.getKey()) {
				y.setLeft(z);
			}
			else {
				y.setRight(z);
			}
		}
	}
	
	public void updateNode(Node z)
	{
	}
	
	public void preOrderWalk(Node x)
	{
		if( x != null )
		{
			System.out.println(x.toString());
			preOrderWalk(x.getLeft());
			preOrderWalk(x.getRight());
		}
	}
	
	public void preOrderWalk(Node x, java.util.ArrayList<String> list)
	{
		if( x != null )
		{
			list.add(x.toString());
			preOrderWalk(x.getLeft(), list);
			preOrderWalk(x.getRight(), list);
		}
	}
	
	public void preOrderWalk(Node x, String id, java.util.ArrayList<String> result)
	{
		if( x != null )
		{
			System.out.println(x.toString() + " " + id);
			result.add(x.getKey() + " " + id);
			preOrderWalk(x.getLeft(), "0"+id, result);
			preOrderWalk(x.getRight(), "1"+id, result);
		}
	}
	
	public void inOrderWalk(Node x)
	{
	}
	
	public void inOrderWalk(Node x, java.util.ArrayList<String> list)
	{
	}
	
	public void postOrderWalk(Node x)
	{
	}
	
	public void postOrderWalk(Node x, java.util.ArrayList<String> list)
	{
	}
		
	public Node getMax(Node x)
	{
		Node y = x;
		while (x.getRight() != null)
		{
			y = x.getRight();
		}
		return y;
	}
	
	public Node getMin(Node x)
	{
		Node y = x;
		while (x.getLeft() != null)
		{
			y = x.getLeft();
		}
		return y;
	}
	
	public Node getSuccessor(Node x) {
		if (x.getRight() != null) {
			return getMin(x);
		}
		Node y = x.getParent();
		while ((y != null) && (x == y.getRight())) {
			x = y;
			y = y.getParent();
		}
		return y;
	}
	
	public Node getPredecessor(Node x)
	{
		if(x.getLeft() != null)
		{
			return getMax(x);
		}

		Node y = x.getParent();
		while( (y != null) && (x == y.getLeft())) {
			x = y;
			y = y.getParent();
		}
		return y;
	}
	
	public Node getNode(Node x, int key)
	{
		return null;
	}
	
	public int getHeight(Node x)
	{
		return 0;
	}
	
	public void shiftNode(Node u, Node v)
	{
	}
	
	public void deleteNode(Node z)
	{
	}
}
