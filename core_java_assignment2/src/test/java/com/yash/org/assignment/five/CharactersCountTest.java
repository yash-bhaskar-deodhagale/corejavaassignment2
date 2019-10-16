package com.yash.org.assignment.five;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.exception.InvalidInputException;
import com.yash.org.assignment.five.CharacterCount;

public class CharactersCountTest {
	
	@Rule
	public ExpectedException expection=ExpectedException.none();
	
	@Test
	public void shouldReturnCountofCharacterGivenAStringInput(){
		String inputString="iamyashemployee";
		CharacterCount charCount=new CharacterCount();
		String expectedStringResult="ia2m2y2she3plo";
	    String actualResultString=charCount.getCharacterCount(inputString);	
	    assertEquals(expectedStringResult,actualResultString);
	}
	
	@Test
	public void shouldThrowExceptionGivenAStringIsNull(){
		String inputString=null;
		expection.expect(InvalidInputException.class);
		expection.expectMessage("Invalid input-value is null");
		CharacterCount charCount=new CharacterCount();
	    charCount.getCharacterCount(inputString);	
	}

}
