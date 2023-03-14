package com.Flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProduct {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement popup_button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		popup_button.click();	
		
		WebElement main_searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		main_searchBox.sendKeys("laptop");
		
		// keys board key uses by following method
		main_searchBox.sendKeys(Keys.RETURN);
		
		
		
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].scrollIntoView();",brandTab);
//		
		Thread.sleep(1000);
		
		List<WebElement> product_list = driver.findElements(By.xpath("//div[@class='_2kHMtA']"));
		
		int list = product_list.size();
	
		
//		product_list.get(1).click();
		
		
		for(int i=0;i<=list;i++) {
			product_list.get(i).click();	
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
//		driver.quit();
		
		
			
			
			
		}
		
		
		
		
		

	}

}
