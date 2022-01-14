package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int numbersSize = 12;
	public static final int error = -1;
	public static final int totalStartValue = -1;
	private int[] numbers = new int[numbersSize];

	public int total = totalStartValue;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
			return total == error;
		}

	public boolean isFull() {
				return total == numbersSize - 1;
			}

	protected int peekaboo() {
		if (callCheck())
			return error;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return error;
		return numbers[total--];
	}

}
