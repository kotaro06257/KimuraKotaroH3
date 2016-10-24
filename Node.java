/**
 *
 */
package homework3;

/**
 * @author Kotaro
 *
 */
public class Node {

	private Object data;

	private Node next;

	private Node prev;

	public Node(Object o) {
		data = o;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getNext() {
		return next;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getPrev() {
		return prev;
	}

	public Object getData() {
		return data;
	}

}
