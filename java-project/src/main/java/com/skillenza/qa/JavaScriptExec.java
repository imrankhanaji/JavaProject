package com.skillenza.qa;

import java.util.ArrayList;

public class JavaScriptExec {
	
	
	
	public static void main (String args[]) {
		
		JavaScriptExec obj=new JavaScriptExec();
		int empcount=obj.getEmployeeCount("cts");
		System.out.println(empcount);
		ArrayList<String> coFounderList=obj.getCoFounderList("google");
		System.out.println(coFounderList);
		
		statCheck();	
		System.out.println(obj.isCitizen("Ajmal"));
		System.out.println(obj.getScoreCard("Ajmal"));
		
		
		
		}
		
	// static method check
	
	public static void statCheck() {
		
		System.out.println("Static method without object creation");
	}
	
	// simple method, no retrun and no parameterized
	
	
	public void test() {
		System.out.println("simple test method");
	}
		
	public String getLangauageName() {
		System.out.println("getLangauageName");
		
		String name="Java Binding";
		return name;
	}
	
	public int add(int a, int b) {
		
		System.out.println("add method");
		
		int z=a+b;
		return z;
		
	}
	
	public ArrayList<String> webList() {
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Selenium");
		ar.add("Java");
		ar.add("Java");
		return ar;
		
	}
	
	// on the basis of company name provide the emp count
	
	public int getEmployeeCount(String compname) {
		int employeeCount=0;
		if(compname.equals("IBM")) {
			employeeCount=1000;
		}
		else if(compname.equals("CTS")) {
				employeeCount=5000;	
			
		}
		else if(compname.equals("TCS")) {
			employeeCount=8000;	
		
	}
		else {
			System.out.println("pls pass the correct company name");
		}
		return employeeCount;
		
	}
	
	// create a function where u need to pass the comp name and it returns list of co-founders
	
	public ArrayList<String> getCoFounderList(String compname) {
		
		ArrayList<String> arr=new ArrayList<String>();
		//String name=null;
		if(compname.equals("Microsoft")) {
			arr.add("LarryPage");
			arr.add("Sundarpichai");
		}
		else if(compname.equals("google")) {
			arr.add("Steve");
			arr.add("Billgates");	
		}
		else {
			System.out.println("pls pass the correct compaany name");
		}
		return arr;
		
	}
	
	public boolean isCitizen(String name) {
		
		boolean flag=false;
		if(name.equals("Imran")) {
			flag= false;
		}
		
		else if(name.equals("Ajmal")) {
			flag= true;
		}
		else if(name.equals("Jaseena")) {
			flag= true;
		}
		else {
			System.out.println("pls pass correct person name");
		}
		return flag;
		
		
	}
	
	public int getScoreCard(String name) {
		
		int marks=-1;
		
		if(name.equals("Jaseena")) {
			marks=100;
		}
		else if(name.equals("Ajmal")) {
			marks=100;
		}
		else if(name.equals("Imran")) {
			marks=80;
		}
		return marks;
		
	}
		
	}

	


