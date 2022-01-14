package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private Node last;
	private int i;
	public static final int error = -1;


	public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().setNext(new Node(i));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
	}

	public boolean isEmpty() {
		return getLast() == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
		  return error;
		return getLast().getValue();

	}

	public int pop() {
		if (isEmpty())
			return error;
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getI() {
		return i;
	}

}
