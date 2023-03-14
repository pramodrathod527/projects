package com.Flipkart;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductShort {

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
		
		
		WebElement relivance = driver.findElement(By.xpath("//div[text()='Relevance']"));
		WebElement popularity = driver.findElement(By.xpath("//div[text()='Popularity']"));
		WebElement price_Low_to_high = driver.findElement(By.xpath("//div[text()='Price -- Low to High']"));
		WebElement price_high_to_low = driver.findElement(By.xpath("//div[text()='Price -- High to Low']"));
		WebElement newest_first = driver.findElement(By.xpath("//div[text()='Newest First']"));	
		
		ArrayList<WebElement> arr = new ArrayList<>();
		arr.add(relivance);
		arr.add(popularity);
		arr.add(price_Low_to_high);
		arr.add(price_high_to_low);
		arr.add(newest_first);
		
		for(int i=0;i<arr.size();i++){
			arr.get(i).click();
		}
		
		Thread.sleep(2000);

	}

}
