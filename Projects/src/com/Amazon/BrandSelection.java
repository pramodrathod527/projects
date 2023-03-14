package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrandSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement search_tab = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		
		search_tab.sendKeys("smart watch");
		
		search_tab.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement brand = driver.findElement(By.xpath("//span[text()='Fire-Boltt']"));
		
		if(!brand.isSelected()) {
			brand.click();
		}
		

	}

}
