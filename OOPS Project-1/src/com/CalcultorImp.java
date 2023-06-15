package com;

public class CalcultorImp implements Calcultor
{
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}

	@Override
	public int div(int a, int b) 
	{
		if(b!=0)
		{
			return a/b;
		}
		return 0;
	}
	@Override
	public String invalidChoice() {
		return "Kindly Enter valid choice";
	}

}
