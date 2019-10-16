package com.yash.org.assignment.three;

import java.util.LinkedList;
import java.util.List;

import com.yash.org.assignment.exception.InvalidInputException;

public class LeadersFinder {

	public List<Integer> findLeadersOfArray(Integer[] inputArray) {
		List<Integer> leaderList=new LinkedList<>();
		if(inputArray==null){
			throw new InvalidInputException("Invalid input- value is null");
		}
		leaderList.add(inputArray[inputArray.length-1]);
		if(inputArray.length==1||inputArray.length==2){
			return leaderList;
		}
		for(int i=inputArray.length-2;i>=1;i--){
			if(inputArray[i]>inputArray[i-1]){
			leaderList.add(inputArray[i]);
			}
		}
		return leaderList;
	}

	

}
