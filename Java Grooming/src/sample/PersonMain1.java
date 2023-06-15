package sample;
class Person1
{
	double age;
	String name;
	public Person1(double age,String name)
	{
		this.age=age;
		this.name=name;
	}
	@Override                    
	public boolean equals(Object o)
	{
		Person1 p=(Person1)o;      
		return this.age==p.age;   
	//	return this.name==p.name;
	}
}
public class PersonMain1
{
	public static void main(String[] args)
	{
		Person1 p1=new Person1(21.5,"manju");
		Person1 p2=new Person1(21.5,"manjuk");
		System.out.println(p1.equals(p2));
	}
}