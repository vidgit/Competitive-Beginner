class LinkedList {

	private Node head;
	private int size;

	public LinkedList() {
		head = null;
		size = 0;
	}

	public Node getHead() {
		return this.head;
	}

	public Node add(int data) {
		if (head == null) {
			head = new Node(data);
			size++;
			return getHead();
		}

		if (head.getNext() == null) {
			head.setNext(new Node(data));
			size++;
			return getHead();
		}

		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(new Node(data));
		size++;
		return getHead();

	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Node addFirst(int data) {

		if (head == null) {
			head = new Node(data);
			return getHead();
		}

		Node temp = new Node(data);
		temp.setNext(head);
		setHead(temp);
		size++;
		return getHead();
	}

	public Node insert(int position, int data, Node head) {
		if(position>size||position<0)
		{
			System.out.println("Out of bounds");
			return getHead();
		}
		Node temp = head;
		if (head == null) {
			head = new Node(data);
			size++;
			return getHead();
		}
		if (position == 0) {
			Node node = new Node(data);
			node.setNext(getHead());
			setHead(node);
			size++;
			return getHead();
		}
		for (int i = 0; i < position-1; i++) {
			temp = temp.getNext();
		}
		Node node = new Node(data);
		node.setNext(temp.getNext());
		temp.setNext(node);
		size++;
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
	
	public Node delete(int position){
		
		if(position<0||position>=size){
			System.out.println("Out of bounds");
			size++;
		}
		
		else if(position == 0){
			setHead(getHead().getNext());
		}
		else{
			Node temp=head;
			int i=0;
			while(temp.getNext()!=null)
			{
				
				if(i==position-1)
				{
					temp.setNext(temp.getNext().getNext());
					break;
				}
				temp=temp.getNext();
				i++;
			}
		}
		
		size--;
		return getHead();
		
	}
	
	public boolean deleteVal(int val){
		Node temp = getHead(), prev = null;
		while(temp!=null&&temp.getData()!=val){
			prev = temp;
			temp = temp.getNext();
		}
		if(temp == null)
		{
			return false;
		}
		
		prev.setNext(temp.getNext());
		return true;
		
	}
	public Node reverse(Node head){
		Node prev = null;
	    Node current = head;
	    Node next = null;
	    while (current != null) {
	        next = current.getNext();
	        current.setNext(prev);
	        prev = current;
	        current = next;
	        
	    }
	    setHead(prev);
	    return getHead();
	}
	
}