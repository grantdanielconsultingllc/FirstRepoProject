package com.aca;

public class HelloWorld {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		System.out.println("Hello " + person.myName);
		
		person.myName = "David Lazenby";
		
		System.out.println("Hello " + person.myName);

	}

}
