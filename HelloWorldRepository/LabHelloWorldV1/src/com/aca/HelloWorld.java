package com.aca;

public class HelloWorld {

	public static void main(String[] args) {
		
		Person person = new Person();
		Person person2 = new Person();
		
		System.out.println("Hello " + person.myName);
		
		person.myName = "David Lazenby";
		person2.myName = "Andrew White";
		
		System.out.println("Hello " + person.myName);
		System.out.println("Hello " + person.myName);

	}

}
