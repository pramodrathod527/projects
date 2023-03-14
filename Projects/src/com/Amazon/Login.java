package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		WebElement accountAndList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions act = new Actions(driver);
		
		act.moveToElement(accountAndList).click().perform();
		
		WebElement emailOrMobile = driver.findElement(By.xpath("//input[@id='ap_email']"));
		
//		emailOrMobile.sendKeys("9168729713");
		
		WebElement createAcc = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		
		createAcc.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		WebElement mbl_no = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		WebElement mail = driver.findElement(By.xpath("//input[@id='ap_email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
		WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
		
		
		
		name.sendKeys("Pramod Rathod");
		mbl_no.sendKeys("9168729713");
		mail.sendKeys("pramodrathod528@gmail.com");
		pass.sendKeys("Praja@123");
		cont.click();
		
		
		
		
		

	}

}
