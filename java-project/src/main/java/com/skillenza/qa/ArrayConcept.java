package com.skillenza.qa;

import java.util.ArrayList;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int i[]=new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
	
		System.out.println(i[2]);
		System.out.println(i.length);
		
		for(int k=0;k<i.length;k++) {
			
			System.out.println(i[k]);
			
		}
		
		char c[]=new char[2];
			c[0]='$';
			System.out.println(c[0]);
			System.out.println(c[1]);
			
			String str[]=new String[2];
			str[0]="imran";
			System.out.println(str[1]);
		
			ArrayList<String> ar=new ArrayList<String>();
			ar.add("imran");
			ar.size();
			
			
			
	}
	
	

}
