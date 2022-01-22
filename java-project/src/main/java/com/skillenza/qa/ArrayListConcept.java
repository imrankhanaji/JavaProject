package com.skillenza.qa;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList<Object> ar=new ArrayList<Object>();
		
		ar.add("© 2021 Synchrony Bank");
		ar.add("Online Privacy Policy");
		ar.add("Privacy Policy");
		ar.add("Online Usage Agreement");
		ar.add("Fraud Protection");
		ar.add("Amazon.com");
		ar.remove(1);
		
		System.out.println(ar.get(2));
		System.out.println(ar.size());
		
		for(Object s:ar) {
			
			System.out.println(s);
			
		}
		

	}

}
