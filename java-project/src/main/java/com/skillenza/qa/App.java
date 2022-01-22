package com.skillenza.qa;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App
{
    public static void main( String[] args )
    {
        //System.setProperty("webdriver.chrome.driver","/path/to/chrome_driver/chromedriver");
    	
    	/**
    	 * submit kyc filling
    	 */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://submit-kyc.herokuapp.com/";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        WebElement userName=driver.findElement(By.id("formBasicUsername"));
        userName.sendKeys("admin");
        WebElement password=driver.findElement(By.id("formBasicPassword"));
        password.sendKeys("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InN1cnlhQHNraWxsZW56YS5jb20iLCJpYXQiOjE2MTEzMTc2Njh9.HVMcJZZJh8_EAhB_mcSeGLfZZarE5ZgnEgbbAxSu99g");
        WebElement checkBox=driver.findElement(By.id("formBasicCheckbox"));
        checkBox.click();
        WebElement loginButton=driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();
        //******************************************************************************//
        
        WebElement bankName=driver.findElement(By.id("bankName"));
        bankName.sendKeys("ICICI");
        WebElement bankIfsc=driver.findElement(By.id("bankIFSC"));
        bankIfsc.sendKeys("765656");
        WebElement bankAcno=driver.findElement(By.id("bankAccountno"));
        bankAcno.sendKeys("9876765654543");
        WebElement accountHolder=driver.findElement(By.id("bankAccountHolder"));
        accountHolder.sendKeys("Imran");
        WebElement submitKyc=driver.findElement(By.xpath("//button[text()='Submit KYC']"));
        submitKyc.click();
        
        WebElement result_div=driver.findElement(By.xpath("//*[@class='result']/p"));

        String result_str = result_div.getText();

        try {
        	FileWriter myWriter = new FileWriter("./result.txt");
            myWriter.write(result_str);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
