package com.multilevel;
//4.Design a Person class inherited by Student and Employee.
//Print details of both using a common method in base class.
public class Maneger extends Person {
	public static void main (String args[]) {
		Maneger mr = new Maneger();
		System.out.println("Maneger can access the data of person");
		mr.personDeatils();
		
	}
}
