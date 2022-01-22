package com.skillenza.qa;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		String browser ="opera";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Launch chrome browser");
		}
		
		else if(browser.equalsIgnoreCase("safari")) {
			System.out.println("Launch safari browser");
		}
		
		else if(browser.equalsIgnoreCase("IE")) {
			System.out.println("Launch IE browser");
		}
		
		else {
			System.out.println("pls pass correct browser name"+" "+browser+ " "+ "is not handled");
		}
		
		//Using switch case
		
		String browserName="opera";
		
		switch (browserName) {
		
		case "chrome":
			System.out.println("launch chrome browser");
			break;
		case "firefox":
			System.out.println("launch chrome browser");
			break;
			
		default:
			System.out.println("browser not found");
			break;
		}
		
	}

}
