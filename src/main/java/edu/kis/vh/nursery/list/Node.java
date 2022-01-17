package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	private Node prev;
	private Node next;

	/**
	 *
	 * @param i
	 * ustawia wartość value elementu Node na wartosć podaną w i
	 */
	public Node(int i) {
		setValue(i);
	}

	/**
	 *
	 * @return
	 * zwraca wartość value elementu Node
	 */
	public int getValue() {
		return value;
	}

	/**
	 *
	 *
	 * @param value
	 * ustawia wartość value elementu Node na wartosć podaną w parametrze value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 *
	 * @return
	 * zwraca element Node znajdujący się wcześniej w liście
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 *
	 * @param prev
	 * Ustawia poprzedni element w liście na ten podany w parametrze
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 *
	 * @return
	 * zwraca następny element Node w liście
	 */
	public Node getNext() {
		return next;
	}

	/**
	 *
	 * @param next
	 * ustawia następny element w liście na ten podany w argumencie
	 *
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}
