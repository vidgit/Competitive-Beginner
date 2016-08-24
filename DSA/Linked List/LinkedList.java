class LinkedList {

	private Node head;

	public LinkedList() {
		head = null;
	}

	public Node getHead() {
		return this.head;
	}

	public Node add(int data) {
		if (head == null) {
			head = new Node(data);
			return getHead();
		}

		if (head.getNext() == null) {
			head.setNext(new Node(data));
			return getHead();
		}

		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(new Node(data));

		return getHead();

	}
	
	public Node addFirst(int data){
		
		if(head == null)
		{
			head = new Node(data);
			return getHead();
		}
		
		Node temp = new Node(data);
		temp.setNext(head);
		setHead(temp);
		return getHead();
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getIndex(int data) {
		if (head == null)
			return -1;

		if (head.getData() == data)
			return 0;

		Node temp = head;
		int index = 1;
		while (temp.getNext() != null) {
			if (temp.getData() == data)
				return index;
			temp = temp.getNext();
			index++;
		}

		return -1;

	}
}