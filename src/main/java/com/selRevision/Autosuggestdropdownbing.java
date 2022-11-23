package com.selRevision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestdropdownbing {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		WebElement Searchbox = driver.findElement(By.xpath("//input[@type = 'search']"));
		Searchbox.sendKeys("Jai Anjaneya");
		List<WebElement> Suggestdropdown = driver.findElements(By.xpath("//div[@class = 'sa_as']//li[@role = 'option']//span//strong"));
		DropdownSelect(Suggestdropdown,"songs");

	}

	private static void DropdownSelect(List<WebElement> Suggestions, String Text) {
		for (WebElement Dropdown :Suggestions ) {
			String DropdownVal = Dropdown.getText();
			System.out.println(DropdownVal);
			if (DropdownVal.contains(Text)) {
				Dropdown.click();
				break;
			}
		}
	}

}
