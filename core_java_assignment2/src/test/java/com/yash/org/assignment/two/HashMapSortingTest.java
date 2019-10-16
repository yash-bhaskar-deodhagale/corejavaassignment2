package com.yash.org.assignment.two;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.exception.InvalidInputException;

public class HashMapSortingTest {
	
	@Rule
	public ExpectedException expect=ExpectedException.none();
	
	@Test
	public void shouldReturnHashmapSortedByValueGivenAHashmap(){
		Map<String,Integer> expectedSoretedMap=new LinkedHashMap<>();
		expectedSoretedMap.put("F", 3);
		expectedSoretedMap.put("A", 5);
		expectedSoretedMap.put("C", 6);
		expectedSoretedMap.put("E", 7);
		expectedSoretedMap.put("B", 12);
		expectedSoretedMap.put("D", 19);
		
		
		Map<String,Integer> inputMap=new HashMap<>();
		inputMap.put("A", 5);
		inputMap.put("B", 12);
		inputMap.put("C", 6);
		inputMap.put("D", 19);
		inputMap.put("E", 7);
		inputMap.put("F", 3);
		HashMapSorting hmSorting=new HashMapSorting();
		Map<String,Integer> actualSortedMap=hmSorting.getHashMapSortedByValue(inputMap);
		assertEquals(expectedSoretedMap.toString(),actualSortedMap.toString());
		
		
		
	}
	
	@Test
	public void shouldReturnExceptionGivenAHashmapIsNull(){
		
		
		Map<String,Integer> inputMap=new HashMap<>();
		inputMap=null;
		HashMapSorting hmSorting=new HashMapSorting();
		expect.expect(InvalidInputException.class);
		expect.expectMessage("Invalid input-map is null");
		hmSorting.getHashMapSortedByValue(inputMap);
		
	}

}
