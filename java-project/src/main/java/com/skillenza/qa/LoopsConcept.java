package com.skillenza.qa;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//print 1 to 10 using loops ie while
		
		int i=0;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("-------");
		//print 1 to 10 using loops ie for
		
		for(int j=0;j<=10;j++) {
			System.out.println(j);
			
			if(j==4) {
				System.out.println("value is 4- stop");
				break;
			}
		}

	}

}
