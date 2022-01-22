package Sugu;

import java.util.ArrayList;

public class MethodsConcept {

	public static void main(String[] args) {
		
		System.out.println(getTrainerName());
		System.out.println(test("imran"));
		System.out.println(coFoundersList("MS"));

	}
	
	//print the student marks based on the name
	public static int test(String name) {
		System.out.println("test method");
		
		int marks=0;
		if(name.equals("imran")) {
			
			marks=100;
		}
		return marks;
		
		
	}
	
	public static String getTrainerName() {
		
		System.out.println("getTrainerName method");
		
		String name="imran";
		
		return name;
		
	}
	
	// return the co founder list as per company name
	
	public static ArrayList<String> coFoundersList(String compName) {
		
		ArrayList<String> cfl= new ArrayList<String>();
		
		if(compName.equals("MS")) {
			cfl.add("Steve");
			cfl.add("LarryPage");
			
			for(String ar:cfl) {
				System.out.println(ar);
			}
		}
		else if(compName.equals("TCS")) {
			cfl.add("Gopi");
			cfl.add("Swami");
		}
		else {
			System.out.println("Pls pass the correct input");
		}
		
		return cfl;
	}

}
