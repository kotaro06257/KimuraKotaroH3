/**
 *
 */
package homework3;

/**
 * @author Kotaro
 *
 */
public class DLinkedList {

	private Node dummy;

	public DLinkedList() {

		dummy = new Node(null);
		dummy.setNext(dummy);
		dummy.setPrev(dummy);
	}

	public void addFirst(Object data) {

		Node c = new Node(data);
		c.setNext(dummy.getNext());
		c.setPrev(dummy);
		dummy.getNext().setPrev(c);
		dummy.setNext(c);
	}

	public Object removeFirst() {
		Node c = dummy.getNext();
		if (c == dummy) {
			return null;
		}
		c.getNext().setPrev(c.getPrev());
		c.getPrev().setNext(c.getNext());
		return c.getData();
	}

	public Object getFirst() {
		Node c = dummy.getNext();
		if (c == dummy) {
			return null;
		}
		return c.getData();
	}

	public Object get(int index) {
		Node c = dummy.getNext();
		for (int i = 0; i < index; i++) {
			if (c == dummy) {
				return null;
			}
			c = c.getNext();
		}
		return c.getData();

	}

	public String toString() {

		StringBuilder sb = new StringBuilder("[");
		for (Node c = dummy.getNext(); c != dummy; c = c.getNext()) {

			sb.append(c.getData());
			if (c.getNext() != dummy) {
				sb.append(", ");
			}
		}
		sb.append("]");

		return sb.toString();
	}
}
