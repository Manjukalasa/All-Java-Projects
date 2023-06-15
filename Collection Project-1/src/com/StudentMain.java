package com;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentMain {
	public static void main(String[] args) 
	{
		Map<Integer,Student> map=new LinkedHashMap<Integer,Student> (); //  <K,V> K-Integer V-Student Object
		Student s1=new Student(21,"manju");
		Student s2=new Student(22,"kalasa");
		Student s3=new Student(23,"mbk");
		map.put(100,s1);   //	map.put(100,new Student(21,"manju"));  
		map.put(200,s2);  //    map.put(200,new Student(22,"kalasa")); 
		map.put(300,s3);  //	map.put(300,new Student(23,"mbk")); 

		//Converting Map into set using keySet()
		Set<Integer> keys=map.keySet();   

		//creating an instance of ArrayList & Upcasting to List
		List<Student> list=new ArrayList<Student>(); 
		System.out.println(list);
		for(int key:keys)
		{
			Student std=map.get(key);//getting valuse (Student Object)
		    list.add(std);  //adding the valuse (student Object) into ArrayList
			System.out.println(std); //print the value (student Object)
		}
		System.out.println(list);
		System.out.println(list.get(2));// Retriveing 2 element	
	}
}
