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
		return key;
	}
	
	public Node getParent()
	{
		return parent;
	}
	
	public Node getLeft()
	{
		return left;
	}
	
	public Node getRight()
	{
		return right;
	}
	
	public void setLeft(Node n)
	{
		left = n;
	}
	
	public void setRight(Node n)
	{
		right = n;
	}
	
	public void setParent(Node n)
	{
		parent = n;
	}
	
	public String toString()
	{
		java.lang.StringBuilder output = new java.lang.StringBuilder("(");
		output.append(key);
		output.append(",");
		if(parent != null) {
			output.append(parent.getKey());
		}
		output.append(",");
		if(left != null) {
			output.append(left.getKey());
		}
		output.append(",");
		if(right != null) {
			output.append(right.getKey());
		}
		output.append(")");
		return output.toString();
	}
	
	public boolean equals(Object o)
	{
		if (this.data == o)
			return true;

		return false;
	}
	
	public Object getData()
	{
		return data;
	}
	
	public void setData(Object o)
	{
	}
}
