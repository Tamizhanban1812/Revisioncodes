package com.selRevision;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlepopups {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//div[@id = 'javascriptAlertsWrapper']//button[@id = 'alertButton']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//driver.switchTo().alert().sendkeys() - To send a message to the alerts
		//For the autopopus before opening the website - driver.get("https://username:password@demoqa.com/alertsdemoqa.com/alerts"
	}

}
