package com.string.array;
// subclass Cat  of  Superclass Animal can access protected method
import Modifiers.Animal;


public class Cat extends Animal {
	    public static void main(String[] args) {

	        // create an object of Dog class
	        Cat cat = new Cat();
	         // access protected method
	        cat.display();
	    }
	}
