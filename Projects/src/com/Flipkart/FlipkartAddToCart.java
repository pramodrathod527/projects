package com.Flipkart;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAddToCart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		
//		Thread.sleep(3000);
		
		WebElement popup_button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		popup_button.click();	
		
		WebElement main_searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		main_searchBox.sendKeys("mobile");
		main_searchBox.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		List<WebElement> product_list = driver.findElements(By.xpath("//div[@class='_2kHMtA']"));
		
		product_list.get(4).click();
		
		Thread.sleep(2000);
		
		ArrayList<String> list = new ArrayList<>(driver.getWindowHandles());
		
		String child = list.get(1);
		
		 driver.switchTo().window(child);
		
		
		WebElement addToCart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		
		addToCart.click();
		
		WebElement saveForLater = driver.findElement(By.xpath("//div[text()='Save for later']"));
		
		saveForLater.click();
		
		WebElement removeFromkart = driver.findElement(By.xpath("//div[text()='Remove']"));
		removeFromkart.click();
		
		WebElement conform = driver.findElement(By.xpath("(//div[text()='Remove'])[1]"));
		
		conform.click();
		
		
		
		
		
		
	}
}
