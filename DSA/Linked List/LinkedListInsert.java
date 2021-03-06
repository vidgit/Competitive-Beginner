import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedListInsert {

	public static void main(String[] args) throws IOException {
		LinkedList list = new LinkedList();
		for (int i = 0; i < 10; i++) {
			list.add(i + 1);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedListPrint.printList(list.getHead());
		int n = Integer.parseInt(br.readLine().trim());
		int p = Integer.parseInt(br.readLine().trim());
		list.insert(p, n, list.getHead());
		LinkedListPrint.printList(list.getHead());
	}
}
