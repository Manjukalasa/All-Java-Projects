package sample;
class Person
{
	int age;
	public Person(int age)
	{
		this.age=age;
	}
	@Override                    
	public boolean equals(Object o) // Object o=new Pesrson(20);  -->1.upcating
	{
		Person p=(Person)o;         //2.Downcasting
		return this.age==p.age;     //3.comparison logic
	}
}
public class PersonMain
{
	public static void main(String[] args)
	{
		Person p1=new Person(21);
		Person p2=new Person(20);
		System.out.println(p1.equals(p2)); //(p.equals(new Person(21))
	}
}
//   Rules Of Overriden equlas():-
//   1.upcating     2.Downcasting   3.comparison logic