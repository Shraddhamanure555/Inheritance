package com.multilevel;
//3.Write a program where a class Shape is inherited by Circle,
//Rectangle, and Triangle. Each subclass should have a method to calculate area.
public class Circle extends Shape{
	int radius = 3;
	
public void areaC() {
	double area = Math.PI*radius*2;
	System.out.println("Area OF CIRCLE: "+area);
}
public  static void main(String args[]) {
	Circle c =new Circle();
	c.areaC();
	c.mainShape();
}
}
