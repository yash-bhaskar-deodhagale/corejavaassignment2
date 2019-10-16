package com.yash.org.assignment.six;

import java.io.Serializable;

public class Singleton implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static Singleton singleInstance;

    private Singleton(){
      
    }

    public static Singleton getInstance() {
        if (singleInstance == null) { 
            synchronized (Singleton.class) {
                if (singleInstance == null) 
                	singleInstance = new Singleton();
            }
        }

        return singleInstance;
    }

    protected Object readResolve() {
        return singleInstance;
    }

}
