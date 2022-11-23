package com.selRevision;

import java.io.FileNotFoundException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadfiles {

	public static void main(String[] args) throws FileNotFoundException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://tus.io/demo.html");
		WebElement Uploadfile = driver.findElement
				(By.xpath("//div[@class = 'container']//div[@id = 'js-upload-container']//input[@type = 'file']"));
		Uploadfile.sendKeys("D:\\Full Revision\\Full Rev as Mavn Project\\Downloads\\SampleDOCFile_100kb.doc");
	}
}


