package com.selRevision;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsdisplayedEnabledSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/text-box");
		boolean DisplayStatus = driver.findElement(By.xpath("//input[@id = 'userName']")).isDisplayed();
		System.out.println(DisplayStatus);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)");
		
		driver.findElement(By.xpath("//div[@class = 'element-group']//ul[@class = 'menu-list']//li//span[text() = 'Check Box']")).click();
		WebElement Checkbox = driver.findElement(By.xpath("//label[@for = 'tree-node-home']//span[@class = 'rct-checkbox']"));
		System.out.println(Checkbox.isSelected());
		System.out.println(Checkbox.isEnabled());
		Thread.sleep(3000);
		Checkbox.click();
		Thread.sleep(5000);
		System.out.println(Checkbox.isSelected());
		Thread.sleep(4000);
		
		
		js.executeScript("window.open()");
		
		ArrayList <String> Tab1 = new ArrayList <String>(driver.getWindowHandles());
		driver.switchTo().window(Tab1.get(1));
		driver.get("https://demoqa.com/radio-button");
		WebElement Yesbutton = driver.findElement(By.xpath("//div[contains (@class,'custom-control')]//label[text()= 'Yes']"));
		System.out.println(Yesbutton.isSelected());
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,900)");
		
		Yesbutton.click();
		Thread.sleep(5000);
		System.out.println(Yesbutton.isSelected());
	}

}
