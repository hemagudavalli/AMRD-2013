package technical;


import org.junit.Assert;
import org.junit.Test;

import technical.LinkedList.Node;

public class LinkedListTest {

	@Test
	public void test() {
		LinkedList linkedList = new LinkedList();
		Assert.assertNull(linkedList.reverse(null));
	}
	@Test
	public void testForNotNull() {
		LinkedList linkedList = new LinkedList();
		linkedList.head = new Node(85);
		linkedList.head.next = new Node(15);
		linkedList.head.next.next = new Node(4);
		linkedList.head.next.next.next = new Node(20);
		Assert.assertNotNull(linkedList.reverse(linkedList.head));

	}

}
