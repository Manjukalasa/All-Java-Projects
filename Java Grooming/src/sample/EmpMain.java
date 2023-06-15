package sample;
class Emp
{
	int id;
	String name;
	public Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override                    
	public boolean equals(Object o)
	{
		Emp e=(Emp)o;      
		return this.id==e.id && this.name.equals(e.name) ;   
	}
}
public class EmpMain
{
	public static void main(String[] args)
	{
		Emp e1=new Emp(101,"manju");
		Emp e2=new Emp(101,"manjuk");
		if(e1.equals(e2))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are Different");		
		}
	}
}