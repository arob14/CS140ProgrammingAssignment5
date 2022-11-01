public class Node implements NodeFunctions
{
	private final int key;
	private Node parent;
	private Node left;
	private Node right;
	private Object data;
	
	public Node(int key, Object data)
	{
		this.key = key;
		parent = null;
		left = null;
		right = null;
		this.data = data;
	}
	
	public Node(int key)
	{
		this(key, null);
	}
	
	public int getKey()
	{
		return 0;
	}
	
	public Node getParent()
	{
		return null;
	}
	
	public Node getLeft()
	{
		return null;
	}
	
	public Node getRight()
	{
		return null;
	}
	
	public void setLeft(Node n)
	{
	}
	
	public void setRight(Node n)
	{
	}
	
	public void setParent(Node n)
	{
	}
	
	public String toString()
	{
		return "";
	}
	
	public boolean equals(Object o)
	{
		return false;
	}
	
	public Object getData()
	{
		return null;
	}
	
	public void setData(Object o)
	{
	}
}
