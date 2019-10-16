package com.yash.org.assignment.two;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.yash.org.assignment.exception.InvalidInputException;

public class HashMapSorting {

	public Map<String, Integer> getHashMapSortedByValue(Map<String, Integer> inputMap) {
		if(inputMap==null){
			throw new InvalidInputException("Invalid input-map is null");
		}
		Map<String, Integer> output=inputMap.entrySet().stream()
        .sorted(Map.Entry.comparingByValue((value1,value2)->value1.compareTo(value2)))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println(output);
		return output;
	}
}
