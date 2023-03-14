package com.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement popup_button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		popup_button.click();	
		
		WebElement login_Button = driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));
	
		//Task1: we will use mouse only
		
		Actions act = new Actions(driver);
		
		act.moveToElement(login_Button).perform();
		
		WebElement signUp_button = driver.findElement(By.xpath("//div[text()='Sign Up']"));
		
		act.click(signUp_button).perform();
		
		WebElement mobileNumberField = driver.findElement(By.xpath("//span[starts-with(text(),'Looks like')]/../../../div[2]/div/form/div/input"));
		
		mobileNumberField.sendKeys("9168729713");
		
		
		
		

	}

}
