package com.selRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qavalidation.com/demo-table/");
		List<WebElement> Table01 = driver.findElements(By.xpath("//table[@id = 'table01']//tbody//tr//td"));
		System.out.println(Table01.size());
		int row = 3;
		int column = 5;
		
		for (int r = 1;r<=row;r++) {
			for (int c=1;c<=column;c++) {
				WebElement TableElement = driver.findElement(By.xpath("//table[@id = 'table01']//tbody//tr["+r+"]//td["+c+"]"));
				System.out.println(TableElement.getText());
				
			}
		}
		
		

	}

}
