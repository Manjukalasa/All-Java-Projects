package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class Solution 
{
	public static void main(String[] args)
	{
		Map<Integer,String> m=new LinkedHashMap<Integer,String>();
		m.put(10,"apple");
		m.put(20,"sony");
		m.put(30,"Samsung");
		Set<Integer>keys=m.keySet();
		for(int key:keys)//for each loop
		{
			System.out.println(key+"->"+m.get(key));
		}
	}
}
