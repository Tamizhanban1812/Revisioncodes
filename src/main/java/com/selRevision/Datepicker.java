package com.selRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		String Date_Month = "November 2021";
		String date = "12";
		String RecMonthYear = null;
		driver.get("https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
		WebElement Datepicker = driver.findElement(By.xpath("//div[@class = 'input-group date']//input"));
		Datepicker.click();
		
		
		while (true) {
			WebElement MonthYear = driver.findElement(By.xpath("(//table[@class = 'table-condensed']//thead)[1]//tr[2]//th[2]"));
			RecMonthYear = MonthYear.getText();
			if(RecMonthYear.equals(Date_Month)) {
			driver.findElement(By.xpath("//table[@class = 'table-condensed']//tbody//tr//td[text() = "+date+"]")).click();
			break;
		}
			else {
				WebElement Previousbutton = driver.findElement(By.xpath("(//table[@class = 'table-condensed']//thead)[1]//tr[2]//th[1]"));
				WebElement Afterbutton = driver.findElement(By.xpath("(//table[@class = 'table-condensed']//thead)[1]//tr[2]//th[3]"));
				Previousbutton.click(); 
			}
		
	}
}}
