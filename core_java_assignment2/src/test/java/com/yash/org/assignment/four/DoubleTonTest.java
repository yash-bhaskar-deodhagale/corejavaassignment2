package com.yash.org.assignment.four;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class DoubleTonTest {
	
	@Test
	public void shouldReturnOnlySameTwoObject(){
      DoubleTon objectOne=DoubleTon.getDoubleTon();
      DoubleTon objectTwo=DoubleTon.getDoubleTon();
      DoubleTon objectThree=DoubleTon.getDoubleTon();
      DoubleTon objectFour=DoubleTon.getDoubleTon();
      DoubleTon objectFive=DoubleTon.getDoubleTon(); 
      DoubleTon objectSix=DoubleTon.getDoubleTon(); 
      DoubleTon objectSeven=DoubleTon.getDoubleTon(); 
      DoubleTon objectEight=DoubleTon.getDoubleTon(); 
      DoubleTon objectNine=DoubleTon.getDoubleTon(); 
      Set<Integer> hashCodeSet=new HashSet<>();
      hashCodeSet.add(objectOne.hashCode());
      hashCodeSet.add(objectTwo.hashCode());
      hashCodeSet.add(objectThree.hashCode());
      hashCodeSet.add(objectFour.hashCode());
      hashCodeSet.add(objectFive.hashCode());
      hashCodeSet.add(objectSix.hashCode());
      hashCodeSet.add(objectSeven.hashCode());
      hashCodeSet.add(objectEight.hashCode());
      hashCodeSet.add(objectFour.hashCode());
      hashCodeSet.add(objectNine.hashCode());
      Integer expectedResult=2;
      assertEquals(expectedResult,(Integer)hashCodeSet.size());
	
	}
}
