package com.skillenza.qa;

import java.sql.Array;

public class DataTypes {

	public static void main(String[] args) {
		
		byte b=10;
		System.out.println(b);
		b=20;
		System.out.println(b);
		
		int i=100;
		System.out.println(i+20);
		
		char c='a';
		char gender='b';
		System.out.println(c);
		System.out.println("-------------");
		System.out.println(c+gender);
		System.out.println("output is"+" "+gender);
		
		String s1="imran";
		String s2="khan";
		System.out.println("Output value is"+ " "+s1+" "+s2);
		
		float f=12.33f;
		System.out.println(f);
		//range=-128 to +127==256 including 0
		//250-256=-6 is the output
		byte b6=(byte) 250;
		System.out.println(b6);
		
		System.out.println("-------------");
		
		int x=500;
		int y=400;
		int z=300;
		
		if(x>y && x>z) {
			System.out.println("X is the highest number");
			}
		else if(y>z) {
			System.out.println("y is the highest number");
			}
		else {
			System.out.println("z is the highest number");
		}

	}

}
