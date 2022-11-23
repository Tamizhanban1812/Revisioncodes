package com.selRevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigatemeth {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=8dBUNQu66pk");
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		

	}

}
