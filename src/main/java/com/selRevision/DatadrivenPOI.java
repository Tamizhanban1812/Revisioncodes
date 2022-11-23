package com.selRevision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatadrivenPOI {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://qavalidation.com/demo/");
		
		FileInputStream fs = new FileInputStream(".\\Utilities\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet s = wb.getSheetAt(0);
		int Rowcount = s.getLastRowNum();
		int Columncount = s.getRow(0).getLastCellNum();
		
		System.out.println(Rowcount);
		System.out.println(Columncount);
		/*String [][] Data = new String[9][3];
		String DatainExcel = null;*/
		
		for (int r = 0; r<Rowcount; r++) {
			/*for (int c = 0; c<Columncount; c++) {
			
			DatainExcel = df.formatCellValue(row.getCell(c));
			Data[r][c] = DatainExcel;*/
			
			XSSFRow row = s.getRow(r);
			WebElement UserName = driver.findElement(By.xpath("//form[@id = 'form1']//div[@class = 'line']//input[@id = 'username']"));
			WebElement Email = driver.findElement(By.xpath("//form[@id = 'form1']//div[@class = 'line']//input[@id = 'username']/following :: input[1]"));
			WebElement Telephone = driver.findElement(By.xpath("//form[@id = 'form1']//div[@class = 'line']//input[@id = 'username']/following :: input[2]"));
			DataFormatter df = new DataFormatter();
			String username = df.formatCellValue(row.getCell(0));
			String email = df.formatCellValue(row.getCell(1));
			String telephone = df.formatCellValue(row.getCell(2));
			UserName.sendKeys(username);
			Email.sendKeys(email);
			Telephone.sendKeys(telephone);
			Thread.sleep(2000);
			driver.navigate().refresh();
		}
		
		driver.close();
}}
