package com.yash.org.assignment.one;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.exception.InvalidInputException;
import com.yash.org.assignment.one.SecondLargestNumberCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;

public class SecondLargestNumberCalculatorTest {
	
	@Rule
	public ExpectedException exception=ExpectedException.none();
	
	@Test
	public void shouldReturnSecondLargestNumberGivenArray(){
		Integer [] numArray={12,4,5,1,3,7,2};
		SecondLargestNumberCalculator secondLargestNumberCal=new SecondLargestNumberCalculator(); 
		Integer actualSecondLargest=secondLargestNumberCal.findSecondLargestNumber(numArray);
		Integer expectedSecondLargest=7;
		assertEquals(expectedSecondLargest,actualSecondLargest);
			
	}
	
	@Test
	public void shouldThrowExceptionIfGivenArrayIsNull(){
		Integer [] numArray=null;
		exception.expect(InvalidInputException.class);
		exception.expectMessage("invalid input- array is null");
		SecondLargestNumberCalculator secondLargestNumberCal=new SecondLargestNumberCalculator(); 
		secondLargestNumberCal.findSecondLargestNumber(numArray);
			
	}
	
	@Test
	public void shouldThrowExceptionIfGivenArrayHasOnlyOneNumber(){
		Integer [] numArray={12};
		exception.expect(InvalidInputException.class);
		exception.expectMessage("invalid input- array has only one number");
		SecondLargestNumberCalculator secondLargestNumberCal=new SecondLargestNumberCalculator(); 
		secondLargestNumberCal.findSecondLargestNumber(numArray);
			
	}
	
	@Test
	public void shouldThrowExceptionIfGivenArrayHasDuplicateValues(){
		Integer [] numArray={12,12,12,4,5,1,3,7,2};
		SecondLargestNumberCalculator secondLargestNumberCal=new SecondLargestNumberCalculator(); 
		Integer actualSecondLargest=secondLargestNumberCal.findSecondLargestNumber(numArray);
		Integer expectedSecondLargest=7;
		assertEquals(expectedSecondLargest,actualSecondLargest);
			
	}

}
