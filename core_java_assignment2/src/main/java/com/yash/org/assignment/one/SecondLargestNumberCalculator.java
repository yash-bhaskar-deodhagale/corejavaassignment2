package com.yash.org.assignment.one;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.yash.org.assignment.exception.InvalidInputException;

public class SecondLargestNumberCalculator {

	public Integer findSecondLargestNumber(Integer[] numArray) {
		
		if(numArray==null){
			throw new InvalidInputException("invalid input- array is null");
		}
		if(numArray.length==1){
			throw new InvalidInputException("invalid input- array has only one number");
		}
		TreeSet<Integer> treeSet=Stream.of(numArray).collect(Collectors.toCollection(TreeSet::new));
		List<Integer> list=new LinkedList<>(treeSet);
		return list.get(list.size()-2);
		
	}

}
