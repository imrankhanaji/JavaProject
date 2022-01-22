package Sugu;

public class SystemProperty {

	public static void main(String[] args) {
		
		//  Project current directory
		String text=System.getProperty("user.dir")+ "./src/main/java/sugu/test.properties";
		System.out.println(text);
		
		//String path= text + "./src/main/java/sugu/test.properties";
		
		//System.out.println(path);

	}

}
