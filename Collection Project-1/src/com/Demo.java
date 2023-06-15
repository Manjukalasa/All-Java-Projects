package com;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class Demo
{
	public static void main(String[] args)
	{
		Map<String,Double> map=new LinkedHashMap<String,Double>();
		map.put("Tom", 10.1);    //  <K,V> K-String V-Double
		map.put("jerry", 20.2);
		map.put("manju", 30.3);
		Set<String> keys=map.keySet();   
		for(String key:keys)
		{
			System.out.println("Salary of "+key+" is "+map.get(key));
		}
	}
}
