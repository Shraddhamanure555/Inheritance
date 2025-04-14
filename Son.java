package com.multilevel;
//2.Create a class Grandfather with method showGrandfather(). Inherit it into Father class with method showFather(),
//and then into Son class with method showSon(). 
//Call all three methods from Son class object.
public class Son extends Father{
public void showSon() {
	System.out.println("son extend all bheviour of grand &  father this is the 3rd gen");
}
public static void main(String args []) {
	Son s = new Son();
	s.showGrandfather();
	s.showFather();
	s.showSon();
}
}
