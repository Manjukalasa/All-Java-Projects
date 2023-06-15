package lambdaexpression;

@FunctionalInterface
interface Employee
{
	void work();
}
public class Solution {

	public static void main(String[] args) 
	{
		//Lambda Expression (->)
		Employee emp=()->
		{
		System.out.println("Working");
		};
		emp.work();
		
		//Another way
		Employee emp1=()->System.out.println("Working as Analyst");
		emp1.work();
	}
}
