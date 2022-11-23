package com.selRevision;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesfromBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		Cookie obj = new Cookie("My Cookie", "1234");
		driver.manage().addCookie(obj);
		Set<Cookie> cookies = driver.manage().getCookies();
	
		for (Cookie cookie : cookies) {
			System.out.println("Name of the cookie : " + cookie.getName());
			System.out.println("Value of the cookie : " +cookie.getValue());
			System.out.println("Domain of the cookie : " +cookie.getDomain());
			System.out.println("Path of the cookie : " +cookie.getPath());
			System.out.println("Samesite of the cookie : " +cookie.getSameSite());
			System.out.println("Expiry of the cookie : " +cookie.getExpiry());
			System.out.println();
		}

	}

}
