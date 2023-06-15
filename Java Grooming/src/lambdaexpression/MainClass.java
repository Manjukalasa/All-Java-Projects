package lambdaexpression;

@FunctionalInterface
interface Calculator
{
	void add(int a,int b);
}
public class MainClass {
	public static void main(String[] args) 
	{
		//Lambda Expression (->)
		Calculator c=(a,b)->{
			System.out.println("Sum: "+(a+b));
		};
		c.add(10,20);
		
		//Another way
		Calculator c1=(a,b)->System.out.println("Sum: "+(a+b));
		c1.add(100,200);
	}
}