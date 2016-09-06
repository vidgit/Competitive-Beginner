import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedListReverse {

	public static void main(String[] args)throws IOException {
		LinkedList list = new LinkedList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			list.add(i+1);
		}
		
		list.reverse(list.getHead());
		LinkedListPrint.printList(list.getHead());
		
	}

}
