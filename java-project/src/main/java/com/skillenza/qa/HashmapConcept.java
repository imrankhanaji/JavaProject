package com.skillenza.qa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashmapConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://shop.advanceautoparts.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		HashMap<Integer, String> hm=new HashMap<Integer, String>();
//		
//		hm.put(1, "Selenium");
//		hm.put(2, "UFT");
//		hm.put(3, "LoadRunner");
		
		//top seller name
		List<WebElement> topSeller= driver.findElements(By.className("aap-recommend__brand"));
		
		List<WebElement> topSellerPrice= driver.findElements(By.className("aap-recommend__price"));
		
		//driver.findElements(By.className("aap-recommend__brand"));
		
				//div[@class='css-1quo4cf']
				//span[@class='aap-recommend__brand']
		
		Thread.sleep(5);
		//System.out.println(topSeller.get(0).getText());
		System.out.println(topSeller.size());
		
		
		//aap-recommend__name
		
		for(int i=0;i<topSeller.size();i++) {
			String sellerText=topSeller.get(i).getText();
			System.out.println(sellerText);
			
			}
		
		
		

	}

}
