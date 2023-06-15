package anonymous_lambda_class;

@FunctionalInterface  //only one fun present
interface Person
{
	String display(int age); // Age: 20
}
public class Runner {

	public static void main(String[] args) 
	{
		// 1.Anonymous ineer class
		Person p=new Person() {
			@Override
			public String display(int age){
				return "Age: "+age;
			}
		};
		System.out.println(p.display(20));
		System.out.println("************************");

		//2.Lambda Expression
		Person p1=(age)-> {
			return "Age: "+age;
		};
		System.out.println(p1.display(40));
	}
}
