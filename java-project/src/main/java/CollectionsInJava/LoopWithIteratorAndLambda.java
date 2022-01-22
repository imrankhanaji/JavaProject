package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class LoopWithIteratorAndLambda {

	public static void main(String[] args) {
		// ArrayList is a default class in Java
		// Its one of the collection as well
		
		ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("imran");
		ar.add("ajmal");
		ar.add("Jaseena");
		ar.add("kalima");
		
		//Iterator different ways- for and foreach already used
		// now use iterator concept and only for lambda -need jdk1.8 above
		
		//Iterator concept
				Iterator<String> it=ar.iterator();
				
				while (it.hasNext()) {
					System.out.println(it.next());
				}	
		
		for (String s : ar) {
			System.out.println(s);
			
		}
		System.out.println("------------");
		
		
		
		
	}

}
