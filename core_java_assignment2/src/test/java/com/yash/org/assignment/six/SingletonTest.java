package com.yash.org.assignment.six;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class SingletonTest {
	
	
	@Test
	public void checkSingtetonReturnsOnlyOneObject() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		System.out.println("instance1 hashCode:- " + instance1.hashCode());
		System.out.println("instance2 hashCode:- " + instance2.hashCode());

	}
	
	@Test
	public void checkSingtetonClassForSerializationSafe() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		Singleton instance1 = Singleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
		out.writeObject(instance1);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
		Singleton instance2 = (Singleton) in.readObject();
		in.close();

		assertEquals(instance1.hashCode(), instance2.hashCode());
       
	}
	
	@Test
	public void checkThreadSafetyForSingletonClass(){
 
        Runnable runnableThreadOne=  ()-> Singleton.getInstance();
        Thread threadOne = new Thread(runnableThreadOne);
        
        Runnable runnableThreadTwo=  ()-> Singleton.getInstance();
        Thread threadTwo = new Thread(runnableThreadTwo);
       
        threadOne.start();
        threadTwo.start();
	}

}
