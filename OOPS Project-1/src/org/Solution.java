package org;
 abstract class Person
{
	abstract void eat();
}
 class manju extends Person
 {
	 @Override
	 void eat()
	 {
		 System.out.println("Eating Food");
	 }
 }
public class Solution {

	public static void main(String[] args) {
     manju m=new manju();
     m.eat();
	}
}
/*
abstract class,concrete class,abstract method,concrete method
contract of abstract:(Rules)
1.make a class as abstract
2.Override abstract method
*/