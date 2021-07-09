package com.examples.set1;
public class Player {
	private String name;
	private static int count;

	public Player(String name) {
		System.out.println("Person Constructor");
		this.name = name;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	public String getName() {
		return this.name;
	}
	
}