package innerclass;

@FunctionalInterface  //only one fun present
interface Student
{
    void eat();
}
public class MainClass
{
	public static void main(String[] args) 
	{
		//Anonymous Inner Class with Ref variable
		Student s=new Student()
		{
			@Override
			public void eat() 
			{
				System.out.println("Student is Eating");	
			}
		};
		s.eat();
		
		//Without Ref variable
		new Student()
		{
			@Override
			public void eat()
			{
				System.out.println("Student is Eating");	
			}
		}.eat();
	}
}
