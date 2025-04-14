package com.multilevel;
//2.Create a class Grandfather with method showGrandfather(). Inherit it into Father class with method showFather(),
//and then into Son class with method showSon(). 
//Call all three methods from Son class object.
public class Father extends Grand{
public void showFather() {
	System.out.println("This is father class ");
}
}
