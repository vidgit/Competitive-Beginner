import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedListPrint {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList list = new LinkedList();
		System.out.println("Enter number of terms.");
		int t = Integer.parseInt(br.readLine());
		for(int i = 0;i < t;i++)
		{
			list.add(i+1);
		}
		printList(list.getHead());
		printInReverse(list.getHead());
	}
	
	public static void printList(Node head)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println(".");
	}
	
	public static void printInReverse(Node head){
		Node temp = head;
		String s="";
		while(temp!=null){
			s=temp.getData()+"\n"+s;
			temp=temp.getNext();
		}
		System.out.println(s);
	}
}
