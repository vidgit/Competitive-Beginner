import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedListDelete {

	public static void main(String[] args) throws IOException {

		LinkedList list = new LinkedList();
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 100));
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedListPrint.printList(list.getHead());
		if (Integer.parseInt(br.readLine()) == 0)
			while (true) {
				int p = Integer.parseInt(br.readLine().trim());
				if (p == -1)
					break;
				list.delete(p);
				LinkedListPrint.printList(list.getHead());
			}
		else {
			while (true) {
				int p = Integer.parseInt(br.readLine().trim());
				if (p == -1)
					break;
				list.deleteVal(p);
				LinkedListPrint.printList(list.getHead());
			}
		}
	}

}
