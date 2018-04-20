package com.vtigercrm.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	 static WebDriver driver;
	@BeforeClass
	public void configBC(){
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
	}
		
		@BeforeMethod
		public void configbm()
		{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		}
		@AfterMethod
		public void  logout(){
			driver.findElement(By.linkText("Sign Out")).click();
			
		}
	@AfterClass
	public void cb(){
		driver.quit();
		
		
	}
	}


