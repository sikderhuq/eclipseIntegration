package com.helloworld;

public class Main {
	public static void main (String[] args){
		System.out.println("Hello world");
		Person p1 = new Person("Alice", 18);
		Person p2 = new Person("Bob", 16);
		
		p1.show();
		p2.show();	
		
	}
	
	static int add (int num1, int num2){
		return num1 + num2;
	}

}
