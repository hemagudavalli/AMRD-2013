package technical;

public class LinkedList {

	static Node head;
	static class Node{
		Node next;
		int value;
		Node(int d)
		{
			value = d;
			next = null;
		}
		
	}
	public Node reverse(Node head){
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current !=null)
		{
			next = current.next;
			current.next = prev;
			prev=current;
			current = next;
		}
		head = prev;
		return head;
	}
	public void printList(Node node){
		while (node!=null)
		{
			System.out.print(node.value+ "");
			node = node.next;
		}
}
	/*public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(8);
		list.head.next = new Node(5);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(2);
		
		System.out.println("Given Linked list is: ");
		 list.printList(head);
		 head = list.reverse(head);
		 System.out.println("");
		 System.out.println("linked list after reversing");
		 list.printList(head);
		 
	}*/
}
