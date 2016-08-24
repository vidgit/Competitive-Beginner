import java.io.*;

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
	
	public void setNext(Node next)
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
	
	public Node getHead()
	{
		return this.head;
	}
	
	public Node add(int data)
	{
		if(head == null)
		{
			head = new Node(data);
			return getHead();
		}
		
		if(head.getNext() == null)
		{
			head.setNext(new Node(data));
			return getHead();
		}
		
		Node temp=head;
		
		while(temp.getNext() != null)
		{
			temp = temp.getNext();
		}
		
		temp.setNext( new Node(data));
		
		return getHead();
		
	}
	
	public int getIndex(int data)
	{
		if(head == null)
			return -1;
		
		if(head.getData() == data)
			return 0;
		
		Node temp = head;
		int index=1;
		while(temp.getNext() != null)
		{
			if(temp.getData() == data)
				return index;
			temp=temp.getNext();
			index++;
		}
		
		return -1;

	}
}

public class LinkedListCreation
{
	public static void main(String args[])throws IOException
	{
		LinkedList list = new LinkedList();
		for(int i = 0; i < 10; i++)
		{
			list.add(i + 1);
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value to be searched:\n Enter non number to exit.\n");
		int t = 0;
		
		try 
		{
			while(true)
			{
				t = Integer.parseInt(br.readLine());
				int i = list.getIndex(t);
				if(i == -1)
				{
					System.out.println("Value not found.");
				}
				else
				{
					System.out.println("Value has index: " + i);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Exiting...");
		}
	}
}