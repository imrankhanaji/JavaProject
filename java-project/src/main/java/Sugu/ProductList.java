package Sugu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductList {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://shop.advanceautoparts.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(10000);
		//div[@class='css-pv0q4o']//a//div[@class='css-1quo4cf']
		driver.switchTo().parentFrame().close();
		List<WebElement> topsellers=driver.findElements(By.xpath("//div[@class='css-pv0q4o']//a/div/div/div[@class='css-fr1cma']"));
		System.out.println("my code inside");
		for(int i=0; i<topsellers.size();i++){
			
			String text=topsellers.get(i).getText();
			System.out.println(text);
			
		}
		

	}
}



