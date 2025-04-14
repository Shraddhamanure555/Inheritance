package com.multilevel;
//3.Write a program where a class Shape is inherited by Circle,
//Rectangle, and Triangle. Each subclass should have a method to calculate area.
public class Triangle  extends Shape{
	double base = 8;
	double height = 6;
	double area = 0.5 * base * height;
	public void areaT() {
		double area = 0.5 * base * height;
		System.out.println("Area of tringle: "+area);
	}
	public  static void main(String args[]) {
		Triangle  t =new Triangle ();
		t.areaT() ;
		t.mainShape();
	}
}
