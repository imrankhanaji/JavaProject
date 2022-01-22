package CollectionsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		
		ArrayList<String> marksList=new ArrayList<String>(Arrays.asList("imran","jaseena","imran"));
		
		LinkedHashSet<String> markListUnique= new LinkedHashSet<String>(marksList);
		
		System.out.println(markListUnique);
		
		}

}
