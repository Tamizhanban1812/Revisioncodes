package com.selRevision;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RtDbClk_DrgDrp_Movtab_Toolkt {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://qavbox.github.io/demo/dragndrop/");
		Actions ac = new Actions(driver);
		WebElement Elementtodrag = driver.findElement(By.xpath("//div[@class = 'container']//div[@id = 'draggable']"));
		WebElement ToDrop = driver.findElement(By.xpath("//div[@class = 'container']//div[@id = 'droppable']"));
		ac.dragAndDrop(Elementtodrag, ToDrop).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		ArrayList <String> Tab1 = new ArrayList <String>(driver.getWindowHandles());
		driver.switchTo().window(Tab1.get(1));
		driver.get("https://www.amazon.in/");
		WebElement Accounts_Signin = driver.findElement(By.xpath("(//div[@id = 'nav-belt']//div[@id = 'nav-tools']//a)[2]"));
		WebElement Your_Account = driver.findElement(By.xpath("//div[@id = 'nav-al-container']//div[@id = 'nav-al-your-account']//span[text() = 'Your Account']"));
		ac.moveToElement(Accounts_Signin).build().perform();
		Your_Account.click();
		
		js.executeScript("window.open()");
		ArrayList <String> Tab2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Tab2.get(2));
		driver.get("https://www.google.com/");
		WebElement Gmail = driver.findElement(By.xpath("//div[@id = 'gb']//div[@class = 'gb_8d gb_f gb_mg gb_dg']//a[text() = 'Gmail']"));
		ac.contextClick(Gmail).perform();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_UP);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		ArrayList<String> Tab2R = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Tab2R.get(2));
		driver.get("https://www.facebook.com/");
		
		ArrayList<String> Tab3R = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Tab3R.get(3));
		driver.get("https://www.facebook.com/");
		
		js.executeScript("window.open()");
		ArrayList<String> Tab4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Tab4.get(4));
		driver.get("https://www.globalsqa.com/demo-site/tooltip/#Image%20Based");
		driver.switchTo().frame(3);
		WebElement Captext = driver.findElement(By.xpath("//div[@class = 'ui-widget photo']//h3//a[text() = 'Vienna, Austria']"));
		System.out.println("Tooltip Value : " +Captext.getAttribute("href"));
		driver.quit();
	}

}
