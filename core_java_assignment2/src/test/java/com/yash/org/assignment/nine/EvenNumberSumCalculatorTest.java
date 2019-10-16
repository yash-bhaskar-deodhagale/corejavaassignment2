package com.yash.org.assignment.nine;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.exception.InvalidInputException;

public class EvenNumberSumCalculatorTest {
	
	@Rule
	public ExpectedException exception=ExpectedException.none();
	
	@Test
	public void shouldReturnSumOfEvenIntegerGivenAArray(){
		Integer[] numberArray={12,3,45,65,8,9,10,4,6};
		EvenNumberSumCalculator evenSumCalculator=new EvenNumberSumCalculator();
		Integer actualSum=evenSumCalculator.sumOfEven(numberArray);
		Integer expectedSum=40;
		assertEquals(expectedSum,actualSum);
		
	}
	
	@Test
	public void shouldReturnZeroIfGivenArrayHasNoEvenNumber(){
		Integer[] numberArray={1,3,45,65,7,9,11,5,13};
		EvenNumberSumCalculator evenSumCalculator=new EvenNumberSumCalculator();
		Integer actualSum=evenSumCalculator.sumOfEven(numberArray);
		Integer expectedSum=0;
		assertEquals(expectedSum,actualSum);
		
	}
	
	@Test
	public void shouldReturnExcpectionIfGivenArrayHasNoEvenNumber(){
		Integer[] numberArray=null;
		exception.expect(InvalidInputException.class);
		exception.expectMessage("Invalid input-value is null");
		EvenNumberSumCalculator evenSumCalculator=new EvenNumberSumCalculator();
		evenSumCalculator.sumOfEven(numberArray);
		
	}

}
