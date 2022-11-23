package com.selRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gettextandattribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		WebElement FullName = driver.findElement(By.xpath("//div[@class = 'text-field-container']//input[@placeholder = 'Full Name']"));
		FullName.sendKeys("Jai Anjaneya");
		Thread.sleep(3000);
		System.out.println(FullName.getText());
		System.out.println(FullName.getAttribute("id"));
		Thread.sleep(3000);
		FullName.clear();
		System.out.println(FullName.getText());
		System.out.println(FullName.getAttribute("id"));
		driver.close();

	}

}
