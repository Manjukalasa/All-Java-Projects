package innerclass;

abstract class Person
{
	abstract void eat();
}
class Tom extends Person
{
	@Override
	void eat() {
		System.out.println("Tom is Eating");
	}

}
public class Solution
{
	public static void main(String[] args) 
	{
		//explicit subclass
		Tom t=new Tom();
		t.eat();
		
		//Anonymous Inner Class
		Person p=new Person()
		{
			@Override
			void eat() {
				System.out.println("Person is Eating");	
			}
		};
		p.eat();
	}
}
