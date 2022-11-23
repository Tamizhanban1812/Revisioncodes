package com.selRevision;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/sliders/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		WebElement FrameElement = driver.findElement(By.xpath("//iframe[@class = 'demo-frame lazyloaded']"));
		driver.switchTo().frame(FrameElement);
		WebElement SliderRed = driver.findElement(By.xpath("//div[@id = 'red']//span[@tabindex = '0']"));
		
		for (int i = 0; i<=100; i++) {
		SliderRed.sendKeys(Keys.ARROW_LEFT);
	}
		System.out.println("Location : " +SliderRed.getLocation());
		System.out.println("Height of the Element : " +SliderRed.getRect().getHeight());
		System.out.println("Width of the Element : " + SliderRed.getRect().getWidth());
		System.out.println("Dimension of the Element : " + SliderRed.getRect().getDimension());
		System.out.println("Point of the Element : " + SliderRed.getRect().getPoint());
		
	
}
}