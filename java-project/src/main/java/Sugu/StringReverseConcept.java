package Sugu;

public class StringReverseConcept {

	public static void main(String[] args) {
		
		//StringReverseConcept.reverse("imran");
		
		String point="selenium";
		StringBuilder sc=new StringBuilder(point);
		System.out.println(sc.reverse());
	}
	
	
	public static void reverse(String name) {
		
		//String str="Selenium";
		
		
		int len=name.length();
		if(name.equals("")) {
			System.out.println("value should be keyed in.. its empty");
		}
		
		String rev="";
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
			
		}
		
		System.out.println(rev);
	}

}
