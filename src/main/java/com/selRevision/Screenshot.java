package com.selRevision;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Src = ts.getScreenshotAs(OutputType.FILE);
		File Trg = new File (".\\Screenshots\\Amazon.png");
		Files.copy(Src, Trg);
		
		WebElement Mobiles = driver.findElement(By.xpath("//div[@id = 'nav-xshop-container']//div//a[text() = 'Mobiles']"));
		File MobileScrnshot = Mobiles.getScreenshotAs(OutputType.FILE);
		File MobilTrg = new File (".\\Screenshots\\Mobile.png");
		Files.copy(MobileScrnshot, MobilTrg);
	}

}
