package com.garbage_collection;

public class Employee {
	private int id;
	private String name;
	private int age;
	private static int nextid=1;
	public Employee( String name, int age) {
		super();
		this.id = nextid++;
		this.name = name;
		this.age = age;
	}
	public void show(){
		System.out.println("ID= "+id +" Name= "+name +" Age= " +age);
		
	}
	public void ShowNextId(){
		System.out.println("Next id will be "+ nextid);
	}
	
	protected void finalize(){
		nextid--;
	}

}
