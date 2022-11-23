package com.selRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capturetitle_PageSource_url {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
	driver.findElement(By.xpath("//input[@name = 'txt_unam']")).sendKeys("sylix");
	driver.findElement(By.xpath("//input[@name = 'txt_unam']/following :: input[1]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name = 'txt_unam']/following :: input[3]")).click();
	
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
	
	driver.close();

	}

}
