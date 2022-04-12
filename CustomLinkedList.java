
public class CustomLinkedList {
	public Node head=new Node();
	public Node node=new Node();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomLinkedList cl = new CustomLinkedList();
		cl.addAtLast("A");
		cl.addAtLast("A1");
		cl.addAtFirst("B");
		
		cl.find("B");
		cl.addAfter("B","C");
		
		cl.delete("B");
		cl.printAll();
	}



	private void delete(String string) {
		node=head;
		Node prev = null;
		while(node!=null) {
		if(node.value!=null && node.value.equals(string)){
			prev.next=node.next;
		}
		prev = node;
		node=node.next;
		}
	}



	private void printAll() {
		// TODO Auto-generated method stub
		node = head;
		while(node !=null) {
			System.out.print(node.value+"->");
			node = node.next;
		}
	}



	private void addAfter(String findStr, String addStr) {
		node=head;
		while(node.next!=null) {
			if(node.value!=null && node.value.equals(findStr)) {
				Node addNode=new Node(addStr,null);
				addNode.next=node.next;
				node.next=addNode;
				break;
			}
			node=node.next;
		}
	}



	private void find(String string) {
		node=head;
		int count=0;
		while(node.next!=null) {
			
			if(node.value!=null && node.value.equals(string)) {
				System.out.println("Found at position"+ count);
				break;
			}
			node=node.next;
			count++;
		}
		
	}



	private void addAtFirst(String string) {
		// TODO Auto-generated method stub
		node=head;
		Node temp=head.next;
		Node firstNode=new Node(string,temp);
		head.next=firstNode; 
	}



	private void addAtLast(String string) {
		node = head;
		while(node.next!=null) {
			node=node.next;			
		}
		Node lastNode=new Node(string,null);	
		node.next=lastNode;
	}

}

 class Node{	
	public Node(String string, Node node) {
		// TODO Auto-generated constructor stub
		this.value=string;
		this.next=node;
	}
	public Node() {
		// TODO Auto-generated constructor stub
		this.value=null;
		this.next=null;
	}
	String value;
	Node next;
	
}
