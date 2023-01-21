package org.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SIVA BK\\eclipse-workspace\\SeleniumTask6\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/webhp");
	
	WebElement text = driver.findElement(By.xpath("//input[@name='q']"));
	Actions actions = new Actions(driver);
	text.sendKeys("velmurugan");
	
	actions.doubleClick(text).perform();
	
	Robot robot = new Robot();
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_X);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_X);
	
	//robot.keyPress(KeyEvent.VK_TAB);
	//robot.keyRelease(KeyEvent.VK_TAB);
	
	//robot.keyPress(KeyEvent.VK_CONTROL);
	//robot.keyPress(KeyEvent.VK_V);
	//robot.keyRelease(KeyEvent.VK_CONTROL);
	//robot.keyRelease(KeyEvent.VK_V);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
