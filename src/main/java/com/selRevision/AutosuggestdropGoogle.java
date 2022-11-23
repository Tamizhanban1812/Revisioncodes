package com.selRevision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestdropGoogle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		WebElement Searchbox = driver.findElement(By.xpath("//div[@class = 'a4bIc']//input[@name = 'q']"));
		Searchbox.sendKeys("Jai Anjaneya");
		List<WebElement> Dropdownoptions = driver.findElements(By.xpath("//div[@class= 'mkHrUc']//li//div[@role = 'option']//span//b"));
		Dropdownmethod(Dropdownoptions, "images");

	}

	private static void Dropdownmethod(List<WebElement> Ele, String Dropdownvalue) {
		for (WebElement option : Ele) {
			String Dropdownval = option.getText();
			if(Dropdownval.contains(Dropdownvalue)) {
				option.click();
			}
		}
	}

}
