class Node
{
	private int data;
	private Node next;
	
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public Node getNext()
	{
		return this.next;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public void setNext(int next)
	{
		this.next = next;
	}
	
}

class LinkedList
{
	private Node head;
	
	public LinkedList()
	{
		head=null;
	}
	
	public Node addNext(int data)
	{
		if(head == null)
		{
			head = new Node(data);
			return head;
		}
		
		if(head.next == null)
		{
			head.next = new Node(data);
			return head;
		}
		
		Node temp=head;
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = new Node(data);
		
		return head;
		
	}
	
	public int getIndex(int data)
	{
		if(head == null)
			return -1;
		
		if(head.data == data)
			return 0;
		
		Node temp = head;
		int index=1;
		while(temp.next != null)
		{
			if(temp.data == data)
				return index;
			temp=temp.next;
			index++;
			
		}
		
		
	}
}