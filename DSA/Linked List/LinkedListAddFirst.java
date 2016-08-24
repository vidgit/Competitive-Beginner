import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedListAddFirst {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number upto which to fill.");
		int t = Integer.parseInt(br.readLine());
		LinkedList list = new LinkedList();
		for(int i = 0;i < t; i++)
		{
			list.add(i+1);
		}
		LinkedListPrint.printList(list.getHead());
		System.out.println("Enter number to put in front.");
		int p = Integer.parseInt(br.readLine());
		list.addFirst(p);
		LinkedListPrint.printList(list.getHead());
	}

}
