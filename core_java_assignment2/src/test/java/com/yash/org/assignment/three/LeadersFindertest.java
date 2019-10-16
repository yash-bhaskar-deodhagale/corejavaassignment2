package com.yash.org.assignment.three;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.exception.InvalidInputException;

public class LeadersFindertest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void shouldReturnListOfLeadersGivenAnArray() {
		Integer[] inputArray = { 6, 7, 4, 3, 5, 2 };
		LeadersFinder lFinder = new LeadersFinder();
		List<Integer> actualListOfLeaders = lFinder.findLeadersOfArray(inputArray);
		List<Integer> expectedListOfLeaders = new LinkedList<>();
		expectedListOfLeaders.add(2);
		expectedListOfLeaders.add(5);
		expectedListOfLeaders.add(7);
		assertEquals(expectedListOfLeaders, actualListOfLeaders);
	}

	@Test
	public void shouldReturnListOfLeadersGivenAnArrayOfSizeOne() {
		Integer[] inputArray = { 6 };
		LeadersFinder lFinder = new LeadersFinder();
		List<Integer> actualListOfLeaders = lFinder.findLeadersOfArray(inputArray);
		List<Integer> expectedListOfLeaders = new LinkedList<>();
		expectedListOfLeaders.add(6);
		assertEquals(expectedListOfLeaders, actualListOfLeaders);
	}

	@Test
	public void shouldReturnListOfLeadersGivenAnArrayOfSizeTwo() {
		Integer[] inputArray = { 6, 5 };
		LeadersFinder lFinder = new LeadersFinder();
		List<Integer> actualListOfLeaders = lFinder.findLeadersOfArray(inputArray);
		List<Integer> expectedListOfLeaders = new LinkedList<>();
		expectedListOfLeaders.add(5);
		assertEquals(expectedListOfLeaders, actualListOfLeaders);
	}

	@Test
	public void shouldThrowExceptionGivenAnArrayIsNull() {
		Integer[] inputArray = null;
		exception.expect(InvalidInputException.class);
		exception.expectMessage("Invalid input- value is null");
		LeadersFinder lFinder = new LeadersFinder();
		lFinder.findLeadersOfArray(inputArray);
	}

}
