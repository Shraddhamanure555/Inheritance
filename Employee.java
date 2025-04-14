package com.multilevel;
//4.Design a Person class inherited by Student and Employee. 
//Print details of both using a common method in base class.
public class Employee extends Person{

	public static void main (String args[]) {
		Employee  mr = new Employee ();
		System.out.println("Employee can access the data of person");
		mr.personDeatils();
		

}
}
