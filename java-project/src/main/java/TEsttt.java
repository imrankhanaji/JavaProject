import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TEsttt {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		By id=By.id("test");
		getElement(id, driver);

	}
	
	public static WebElement getElement(By locator, WebDriver driver) {
		
		WebElement element= driver.findElement(locator);
		
		return element;
		
		
		
		
		
	}
	
	

}
