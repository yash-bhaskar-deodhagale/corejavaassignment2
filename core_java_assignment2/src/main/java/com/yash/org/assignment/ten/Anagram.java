package com.yash.org.assignment.ten;

import java.util.Arrays;

import com.yash.org.assignment.exception.InvalidInputException;

public class Anagram {

	public Boolean checkAnagram(String firstInput, String secondInput) {
		if(firstInput==null || secondInput==null){
			throw new InvalidInputException("Invalid input-input is null");
		}
		firstInput=firstInput.replace(" ","");
		secondInput=secondInput.replace(" ","");
		
		if(firstInput.length()!=secondInput.length()){
			return false;
		}
		String[] firstInputArray=firstInput.toLowerCase().split("");
		String[] secondInputArray=firstInput.toLowerCase().split("");
		Arrays.sort(firstInputArray);
		Arrays.sort(secondInputArray);
		
		return Arrays.equals(firstInputArray, secondInputArray);
		
	}

}
