package com.selRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class dropdownselect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement Dropdownoption = driver.findElement(By.xpath("//div[@rel-title= 'Select Country']//select"));
		Drpdownselectmethod(Dropdownoption, 13);
		Drpdownselectmethod(Dropdownoption, "ATG");
		Drpdownselectmethod(Dropdownoption, "Albania", "By Country");

	}

	private static void Drpdownselectmethod(WebElement ele, int index) {
		Select sc = new Select(ele);
		sc.selectByIndex(index);
	}
	
	private static void Drpdownselectmethod(WebElement ele, String value)  {
		Select sc = new Select(ele);
		sc.selectByValue(value);
	}
	
	private static void Drpdownselectmethod(WebElement ele, String text, String Methname) {
		Select sc = new Select(ele);
		sc.selectByVisibleText(text);
	}

}
