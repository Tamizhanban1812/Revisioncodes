package com.selRevision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downloadfiles {

	
	public static void main(String[] args) throws FileNotFoundException {
		WebDriverManager.chromedriver().setup();
		
		String Location = System.getProperty("user.dir") + "\\Downloads";
		HashMap preferences = new HashMap();
		preferences.put("download.default_directory", Location);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://sample-videos.com/download-sample-doc-file.php#google_vignette");
		WebElement Downloadbutton = driver.findElement(By.xpath("//div[@class = 'push-form']//tbody//tr[1]//td[3]//a"));
		Downloadbutton.click();
		
		

	}

}
