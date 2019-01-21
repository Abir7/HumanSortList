package com.naztech.HumanIM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HumanList implements Comparable<HumanList> {

	String name;
	int age;
	float income;
	
	public HumanList(String name, int age, float income) {
		super();
		this.name = name;
		this.age = age;
		this.income = income;
	}

	public int compareTo(HumanList li) {
		if(income==li.income)
		return 0;
		else if(income<li.income)
			return 1;
		else
			return 1;
	}
	 
 @Override
	public String toString() {
		return "HumanList [name=" + name + ", age=" + age + ", income=" + income + "]";
	}

public void valueForList()  { 
	
List<HumanList> list = new ArrayList<HumanList>();
 
 list.add(new HumanList("Masum",27 , 200.0f));
 list.add(new HumanList("Mizan",29 , 100.0f));
 list.add(new HumanList("Ariful",25 , 300.0f));
 list.add(new HumanList("Abir",22 , 500.0f));
 Collections.sort(list);
 for(HumanList li:list)
	 
	 System.err.println("Name:" + name + ", Age=" + age + ", Income=" + income +li.income );
	 
 }

}
