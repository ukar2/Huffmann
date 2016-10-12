package kodierung;

public class List {
	public int length = 0;
	private Node head;
	private Node tail;

	public List() {
		this.head = new Node();
		this.tail = new Node();

		this.tail.set_next(null);
		this.head.set_next(tail);

	}

	public void insert_new_Node(String item, float weight) {
		Node n = new Node();
		n.set_char(item);
		n.set_weight(weight);

		n.set_next(head.get_next());
		head.set_next(n);
		length++;

	}

	public void insert_new_Node(Node n) {
		n.set_next(head.get_next());
		head.set_next(n);
		length++;

	}

	public void delete_Node(String item) {
		Node temp = new Node();

		for (temp.set_next(head); temp.get_next() != null; temp.set_next(temp
				.get_next().get_next())) {
			if (temp.get_next().get_next().get_char() == item) {
				Node delNode = temp.get_next().get_next();
				temp.get_next().set_next(delNode.get_next());
				delNode.set_next(null);
				break;
			}
		}
		length--;
	}

	public void print_List() {
		Node temp = new Node();

		for (temp.set_next(head.get_next()); temp.get_next().get_next() != null; temp
				.set_next(temp.get_next().get_next())) {
			System.out.print(temp.get_next().get_char() + " "
					+ temp.get_next().get_weight() + "\n");
		}
	}

	public void sort() {
		Node tmp = head;
		Node temp = head.get_next();

		for (int i = 1; i < length; i++) {
			for (int j = 0; j < length - i; j++) {
				if (temp.get_weight() > temp.get_next().get_weight()) {
					tmp.set_next(temp.get_next());
					tmp = tmp.get_next();
					temp.set_next(tmp.get_next());
					tmp.set_next(temp);

				} else {
					tmp = temp;
					temp = temp.get_next();
				}

			}
			tmp = head;
			temp = head.get_next();

		}

	}

	public Node get() throws EmptyListException {
		if (head.get_next() != tail) {
			Node temp = head.get_next();
			head.set_next(temp.get_next());
			temp.set_next(null);
			length--;
			return temp;
		} else {
			throw new EmptyListException("List is empty");
		}
		
	}

	public boolean isEmpty() {
		if (head.get_next() == tail)
			return true;
		else
			return false;
	}

}
