package com.yash.org.assignment.nine;

import java.util.stream.Stream;

import com.yash.org.assignment.exception.InvalidInputException;

public class EvenNumberSumCalculator {

	public Integer sumOfEven(Integer[] numberArray) {

		if (numberArray == null) {
			throw new InvalidInputException("Invalid input-value is null");
		}
		Integer sum = Stream.of(numberArray).filter(number -> number % 2 == 0).reduce(0,
				(num1, num2) -> num1 + num2);
		System.out.println(sum);
		return sum;

	}

}
