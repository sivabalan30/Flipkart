package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SIVA BK\\eclipse-workspace\\SeleniumTask6\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	WebElement id = driver.findElement(By.id("email"));
	Actions actions = new Actions(driver);
	
	id.sendKeys("harsh@123");
	
	WebElement pass = driver.findElement(By.id("pass"));
	
	pass.sendKeys("123456");
	
	actions.contextClick(pass).perform();
	
actions.doubleClick(id).perform();
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
}
