package com.multilevel;
//3.Write a program where a class Shape is inherited by Circle,
//Rectangle, and Triangle. Each subclass should have a method to calculate area.
public class Rectangle extends Shape{
	double len = 4;
	double width =6;
	public void areaR() {
		double area=len*width;
		System.out.println("Area or rectangle :  "+ area);
	}
	public  static void main(String args[]) {
		Rectangle  r =new Rectangle ();
		r.areaR();
		r.mainShape();
	}
	
}
