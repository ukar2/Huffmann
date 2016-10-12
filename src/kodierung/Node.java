package kodierung;

public class Node {
	private String character;
	private float weight;
	private Node next;
	
	
	public Node(){
		this.character = "";
		this.weight = 0.0f;
		this.next = null;
		
	}
	
	public Node(String item, float weight, Node next){
		this.character = item;
		this.weight = weight;
		this.next = next;
	}
	
	public void set_char(String character) {
		this.character = character;
		
	}
	
	public void set_weight(float weight) {
		this.weight = weight;
		
	}
	
	public void set_next(Node next) {
		this.next = next;
		
	}
	
	public String get_char() {
		return this.character;
		
	}
	
	public float get_weight() {
		return this.weight;
		
	}
	
	public Node get_next() {
		return this.next;
		
	}
	
	@Override
	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		if(o == this){
			return true;
		}
		
		Node tmp = (Node) o;
		
		return tmp.character == this.character && tmp.weight == tmp.weight;
	}
	
	@Override
	public Object clone(){
		Node clon = new Node();
		clon.character = this.character;
		clon.weight = this.weight;
		clon.next = this.next;
		
		return (Object) clon;
	}
	
	@Override
	public String toString(){
		return this.character + " "  + this.weight + " ";
	}

}
