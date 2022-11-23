package com.selRevision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxselect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		List<WebElement> Checkboxes = driver.findElements(By.xpath("(//div[@class= 'panel panel-default'])[3]//div[@class = 'panel-body']//div[@class = 'checkbox']//label"));
		Toclickcheckboxes(Checkboxes,"Option 2","Option 4");
}

	private static void Toclickcheckboxes(List<WebElement> Checkboxes, String...text) {
		for (WebElement Checkbox : Checkboxes) {
			String Checkoption = Checkbox.getText();
			for(String textval : text) {
			if(Checkoption.equals(textval)) {
				Checkbox.click();
			}
		}
	}}}
