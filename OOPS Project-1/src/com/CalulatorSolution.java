package com;
import java.util.Scanner;
public class CalulatorSolution
{
	public static void main(String[] args) 
	{
		while(true)
		{
			//Menu Driven Program
			Scanner sc=new Scanner(System.in);
			
			// Upcasting for Abstraction
			Calcultor ci=new CalcultorImp();
			
			System.out.println("1:Addition\n2:sustraction\n3:multiplication\n4:division\n5:exit");
			System.out.println("Entr yor choice");
			int Choice =sc.nextInt();

			int a=0;
			int b=0;
			if(Choice>=1 && Choice<=4)
			{
				System.out.println("Enter First Number:");
				a=sc.nextInt();
				System.out.println("Enter First Number:");
				b=sc.nextInt();
			}
			switch(Choice)
			{
			case 1:
				System.out.println("Sum of "+a+" & "+b+" is "+ci.add(a,b));
				break;
			case 2:
				System.out.println("Difference of "+a+" & "+b+" is "+ci.sub(a,b));
				break;
			case 3:
				System.out.println("Producte of "+a+" & "+b+" is "+ci.mul(a,b));
				break;
			case 4:
				int res=ci.div(a,b);
				if(res!=0)
				{
				System.out.println("Division of "+a+" & "+b+" is "+res);
				}
				System.out.println("Kindly Enter valid choice");
				break;
			case 5:
				System.out.println("Thank you..!");
				System.exit(0);  //Terminate the Program(JVM)--> System.exit(12); other values also possible but jvm will think Unfortunately it terminated
			default:
				System.out.println(ci.invalidChoice());
				sc.close(); // it will throw Exception--> NoSuchElementException
			}
			System.out.println("-------------------------------");
		}
	}
}
