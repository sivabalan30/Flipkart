package org.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SIVA BK\\eclipse-workspace\\SeleniumTask6\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	
	WebElement id = driver.findElement(By.id("heading201"));
	
	id.click();
	
	WebElement k = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
	
	Actions actions = new Actions(driver);
	
	actions.contextClick(k).perform();
	
	Robot robot = new Robot();
	
	for (int i = 0; i <4; i++) {
		
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
