package com.yash.org.assignment.five;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.yash.org.assignment.exception.InvalidInputException;

public class CharacterCount {

	public String getCharacterCount(String inputString) {
		
		if(inputString==null){
			throw new InvalidInputException("Invalid input-value is null");
		}
		String[] split = inputString.split("");

		Map<String, Long> resultMap = Stream.of(split)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		String mapAsString = resultMap.keySet().stream().map(key -> key + resultMap.get(key))
				.collect(Collectors.joining());
		return mapAsString.replace("1","");
	}

}
