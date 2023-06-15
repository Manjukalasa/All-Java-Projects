package org;
interface  Amazon
{
	int id=101;       // by default public static final	int id=101;
	void purchase();  // by default public abstract void purchase();
}
class Paytem implements Amazon
{
	@Override
	public void purchase() {
		System.out.println("purchasing laptop");
	}
}
public class InterfaceSolution {
	public static void main(String[] args) {
		Paytem Paytem=new Paytem();
		Paytem.purchase();
	}
}
/*
 * interface--->blue print an class-->blue print an-->object
interface class:-
contract of interface:(Rules)
1.make a class as abstract
2.Override abstract method
 */
