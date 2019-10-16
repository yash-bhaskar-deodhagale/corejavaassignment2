package com.yash.org.assignment.ten;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.exception.InvalidInputException;

public class AnagramTest {
	
	@Rule
	public ExpectedException expection=ExpectedException.none();
	
	@Test
	public void ShouldReturnTrueIfGivenTwoInputWordsAreAnagram(){
		Anagram anagram=new Anagram();
		String firstInput="keep";
		String secondInput="peek";
		Boolean actualResult=anagram.checkAnagram(firstInput,secondInput);
		Boolean expectedResult=true;
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void ShouldReturnTrueIfGivenTwoInputHavingUpperAndLowerCaseCharactersAreAnagram(){
		Anagram anagram=new Anagram();
		String firstInput="Mothers in LAW";
		String secondInput="Hitler WoMAns";
		Boolean actualResult=anagram.checkAnagram(firstInput,secondInput);
		Boolean expectedResult=true;
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void ShouldReturnFalseIfGivenTwoInputAreNotAnagram(){
		Anagram anagram=new Anagram();
		String firstInput="Mothers in LAW";
		String secondInput="Hitler WoMA";
		Boolean actualResult=anagram.checkAnagram(firstInput,secondInput);
		Boolean expectedResult=false;
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void ShouldReturnExceptionGivenTwoInputAreNull(){
		Anagram anagram=new Anagram();
		String firstInput=null;
		String secondInput=null;
		expection.expect(InvalidInputException.class);
		expection.expectMessage("Invalid input-input is null");
		anagram.checkAnagram(firstInput,secondInput);
	}
	
	@Test
	public void ShouldReturnExceptionGivenFirstInputIsNull(){
		Anagram anagram=new Anagram();
		String firstInput=null;
		String secondInput="keep";
		expection.expect(InvalidInputException.class);
		expection.expectMessage("Invalid input-input is null");
		anagram.checkAnagram(firstInput,secondInput);
	}
	
	@Test
	public void ShouldReturnExceptionGivenSecondInputIsNull(){
		Anagram anagram=new Anagram();
		String firstInput="keep";
		String secondInput=null;
		expection.expect(InvalidInputException.class);
		expection.expectMessage("Invalid input-input is null");
		anagram.checkAnagram(firstInput,secondInput);
	}

}
