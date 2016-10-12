package kodierung;

import java.util.*;

public class Bubble {
	static Stack<Node> nodes = new Stack<Node>();

	public static void main(String[] args) {

		Node tmp = new Node();
		List ls = new List();

		ls.insert_new_Node("A", 0.05f);
		ls.insert_new_Node("B", 0.03f);
		ls.insert_new_Node("C", 0.17f);
		ls.insert_new_Node("D", 0.23f);
		ls.insert_new_Node("E", 0.01f);
		ls.insert_new_Node("F", 0.32f);
		ls.insert_new_Node("G", 0.19f);

		ls.sort();
		ls.print_List();

		while (!ls.isEmpty()) {
			System.out.println();
			
			try{
				Node first = ls.get();
				Node second = ls.get();
				Node new_Node = new Node(first.get_char() + second.get_char(),
						first.get_weight() + second.get_weight(), null);
				ls.insert_new_Node(new_Node);
				
				ls.sort();
				ls.print_List();

				if (!nodes.isEmpty()) {
					tmp = nodes.peek();
					if (!tmp.equals(first)) {
						nodes.push(first);
					}
					if (!tmp.equals(second)) {
						nodes.push(second);
					}
					nodes.push(new_Node);
				} else {
					nodes.push(first);
					nodes.push(second);
					nodes.push(new_Node);
				}
				tmp = null;
			}catch(EmptyListException e){
				break;
			}
			
		}

		System.out.println();
		while (!nodes.isEmpty()) {
			System.out.print(" " + nodes.pop().get_weight());
		}
	}

}
