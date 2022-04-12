
public class DoublyLinkedList {
	public Node head=new Node();
	public Node node=new Node();

	class Node{
		Node prev;
		Node next;
		String data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.addAtFirst("B");
		dl.addAfter("C","B");
		dl.printAll();
		/*
		 * dl.addAtLast("A"); dl.addAtLast("A1");
		 * 
		 * dl.find("B"); 
		 * 
		 * dl.delete("B");
		 */
		
	}

	private void printAll() {
		// TODO Auto-generated method stub
		node=head;
		while(node!=null) {
			System.out.print(node.data+"->");
			node=node.next;	
		}
		
	}

	private void delete(String string) {
		// TODO Auto-generated method stub
		
	}

	private void addAfter(String addStr, String afterStr) {
		node=head;
		
		while(node!=null) {
			System.out.println(node.data);
			if(node.data!=null && node.data.equals(afterStr)) {
				Node newNode=new Node();
				newNode.data=addStr;
				newNode.next=node.next;
				newNode.prev=node;
				node.next=newNode;								
			}
			node=node.next;
		}
		
		
	}

	private void find(String string) {
		// TODO Auto-generated method stub
		
	}

	private void addAtFirst(String string) {
		node=head;
		Node firstNode=new Node();
		firstNode.data=string;
		firstNode.next=head.next;
		head.next=firstNode;
		firstNode.prev=head;				
	}

	private void addAtLast(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}


