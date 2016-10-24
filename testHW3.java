/**
 *
 */
package homework3;

/**
 * @author Kotaro
 *
 */
public class testHW3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DLinkedList l = new DLinkedList();
		l.addFirst("Apple");
		System.out.println(l);
		l.addFirst("Banana");
		System.out.println(l);
		l.addFirst("Lemon");
		System.out.println(l);
		System.out.println("");

		System.out.println("Traverse the list forwards and print");
		System.out.println(l);

		System.out.println("");

		System.out.println("Traverse the list backwards and print");
		String s0 = (String) l.get(0);
		String s1 = (String) l.get(1);
		String s2 = (String) l.get(2);

		System.out.println("[" + s2 + ", " + s1 + ", " + s0 + "]");

		System.out.println("");

		String removed = (String)l.removeFirst();
        System.out.println("Delete a node from the list : " );
        System.out.println(l);

        System.out.println("");

        removed = (String)l.removeFirst();
        removed = (String)l.removeFirst();
        System.out.println("Delete/destroy the list");
        System.out.println(l);

	}

}
