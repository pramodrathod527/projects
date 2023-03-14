package com.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrandSelection {

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
		
		main_searchBox.sendKeys(Keys.RETURN);
		
		Thread.sleep(2000);
		WebElement brandTab = driver.findElement(By.xpath("//div[text() = 'Brand']"));
		
		brandTab.click();
		
		WebElement hp_Brand = driver.findElement(By.xpath("//div[text()='HP']"));
		
		hp_Brand.click();
		

	}

}
