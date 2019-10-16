package com.yash.org.assignment.four;

public class DoubleTon {
	private static DoubleTon doubletonOne = null;
	private static DoubleTon doubletonTwo = null;

	private DoubleTon() {

	}
	public static DoubleTon getDoubleTon() {
		if (doubletonOne == null) {
			doubletonOne = new DoubleTon();
			return doubletonOne;
		} else if (doubletonTwo == null) {
			doubletonTwo = new DoubleTon();
			return doubletonTwo;
		} else {
			if (Math.random() < 0.5) {
				return doubletonOne;
			}
			else {
				return doubletonTwo;
			}

		}
	}

}
