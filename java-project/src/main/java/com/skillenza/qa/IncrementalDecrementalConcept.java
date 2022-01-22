package com.skillenza.qa;

public class IncrementalDecrementalConcept {

	public static void main(String[] args) {
		
		int a=1;
		int b=a++; // Post increment- increase the value by 1 later
		System.out.println(a);
		System.out.println(b);
		
		int x=1;
		int y=++x; // pre increment- increase the value by 1 immediately
		System.out.println(x);
		System.out.println(y);
		
		int point=1;
		switch (point) {
		case 0:
			System.out.println("point is 0");
			break;
		case 1:
			System.out.println("point is 1");
			break;
			
		default:
			System.out.println("point is not found");
			break;
		}

	}

}
