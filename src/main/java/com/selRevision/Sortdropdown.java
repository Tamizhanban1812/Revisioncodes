package com.selRevision;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public class Sortdropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		List<WebElement> Dropdownoptions = driver.findElements(By.xpath("//div[@rel-title = 'Select Country']//select//option"));
		System.out.println(Dropdownoptions.size());
		ArrayList<String> Templist = new ArrayList<String>();
		ArrayList<String> Sortlist = new ArrayList<String>();
		
		for (WebElement Options : Dropdownoptions) {
			String Option = Options.getText();
			Templist.add(Option);
			Sortlist.add(Option);
		}
		
		System.out.println("Before Sorting :" +Sortlist);
		Collections.sort(Sortlist);
		System.out.println("After Sorting : " + Sortlist);
		
		if(Templist == Sortlist) {
			System.out.println("The Dropdown options are sorted");
		}
		else {
			System.out.println("The Dropdown options are not sorted");
		}

	}

}
