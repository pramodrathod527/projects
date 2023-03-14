package com.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {

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
		
		
		
		
		WebElement order_cart = driver.findElement(By.xpath("//div[text()='Orders']"));
		
		act.moveToElement(order_cart).click().build().perform();
		
		Thread.sleep(2000);
		
		WebElement login_textbox = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		
		login_textbox.sendKeys("9168729713");
	}

}
