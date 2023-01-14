package com.garbage_collection;

public class Test {

	public static void main(String[] args) {
		Employee e=new Employee("Swapnil", 23);
		Employee e1=new Employee("Shubham", 24);
		Employee e2=new Employee("Sanket", 28);
		e.show();
		e1.show();
		e2.show();
		e.ShowNextId();
		e1.ShowNextId();
		e2.ShowNextId();
		
		{
			Employee e3=new Employee("Prashant", 29);
			e3.show();
			e3.ShowNextId();
			
			e3=null;
			System.gc();
			System.runFinalization();
		}
         e.ShowNextId();
         
	}

}
