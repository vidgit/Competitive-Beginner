import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedListSearch {
	public static void main(String args[]) throws IOException {
		LinkedList list = new LinkedList();
		for (int i = 0; i < 10; i++) {
			list.add(i + 1);
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value to be searched:\n Enter non number to exit.\n");
		searchList(list, br);
	}

	public static void searchList(LinkedList list, BufferedReader br) {
		int t;
		try {
			while (true) {
				t = Integer.parseInt(br.readLine());
				int i = list.getIndex(t);
				if (i == -1) {
					System.out.println("Value not found.");
				} else {
					System.out.println("Value has index: " + i);
				}
			}
		} catch (Exception e) {
			System.out.println("Exiting...");
		}
	}
}