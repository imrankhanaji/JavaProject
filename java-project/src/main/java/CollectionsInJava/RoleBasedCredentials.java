package CollectionsInJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoleBasedCredentials {

	public static void main(String[] args) {
		// Map is an interface in Java
		// HashMap is a class in Java- Apply top casting
		//child class can be referred by Parent Interface
		// put to insert value and get to retrieve the value against the specified key
		getValueForRole("admin");
		getValueForRole("vendor");
		getValueForRole("contractor");
		
		}
	
	public static void getValueForRole(String role) {
		
		Map<String,String> usermap=new HashMap<String, String>();
		
		usermap.put("admin", "imrankhan@gmail.com,test@123");
		usermap.put("vendor", "vendor@gmail.com,password1");
		usermap.put("contractor", "contractor@gmail.com,password2");
		
		String[] s1=usermap.get(role).split(",");
		List<String> s2=Arrays.asList(s1); //single parameter constructor called for s1
		
		for(int i=0;i<s2.size();i++) {
			System.out.println(s2.get(i));
			System.out.println("----------------------------");
		}
		
	}

}
