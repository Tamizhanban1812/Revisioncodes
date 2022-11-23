package com.selRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebtable {
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://demo.seleniumeasy.com/table-pagination-demo.html");
		driver.findElement(By.xpath("//section[@class = 'content']//tbody[@id = 'myTable']//tr//td"));
		int row = 5;
		int column = 7;
		
		for (int p =1; p<=3;p++) {
		for (int r =1; r<=row; r++) {
			for (int c =1; c<=column; c++) {
				WebElement TableElement = driver.findElement(By.xpath("//section[@class = 'content']//tbody[@id = 'myTable']//tr[@style = 'display: table-row;']["+r+"]//td["+c+"]"));
				System.out.println(TableElement.getText());	
			}	
		}
		System.out.println(" ");
		int pageno = p+1;
		WebElement Pages = driver.findElement(By.xpath("(//div[@class = 'col-md-6 text-left']//div[@class = 'col-md-6 text-center']//a[contains(@class, 'page_link')])["+pageno+"]"));
		Pages.click();
	
	}
	}
}
