package com.selRevision;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinksfind {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
		System.out.println(Alllinks.size());
		
		for (WebElement links : Alllinks) {
			String texturl = links.getAttribute("href");
			if (texturl == null) {
				System.out.println("The URL is not thre");
			}
			else {
				URL url = new URL(texturl);
				HttpURLConnection urcon = (HttpURLConnection) url.openConnection();
				urcon.connect();
				if(urcon.getResponseCode() >=400) {
					System.out.println(url + "Bad Connection");
				}
				else {
					System.out.println(url + "URL is active");
				}
				
		}
		
		

	}

}}
