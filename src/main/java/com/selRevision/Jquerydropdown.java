package com.selRevision;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquerydropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement Dropdownbutton = driver.findElement(By.xpath("//div[@class = 'comboTreeWrapper']//button[1]"));
		Dropdownbutton.click();
		List<WebElement> Dropdownoptions = driver.findElements(By.xpath("//div[@class = 'comboTreeDropDownContainer']//span[@class = 'comboTreeItemTitle']"));
		Dropdownoptions.size();
		DropdowngenericMethod(Dropdownoptions, "choice 1","choice 2","choice 2 1");
	}

	private static void DropdowngenericMethod(List<WebElement> Elements, String... Value) {

		if (Value[0] == "all" )
			for (WebElement option:Elements) {
				option.click();
			}
		else {
			for (WebElement option:Elements){
				String Texval = option.getText();
				for (String Val : Value) {
					if(Val.equalsIgnoreCase(Texval)) {
						option.click();
					}}}}}}
				

