package com.vtigercrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CompaigenTest extends Baseclass{
	@Test
	public void compaigenTest(){
		
		driver.findElement(By.linkText("More")).click();
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//*[@title='Create Campaign...']")).click();
		driver.findElement(By.name("campaignname")).sendKeys("airtel");
		WebElement msg=driver.findElement(By.name("campaigntype"));
		Select sel=new Select(msg);
	    sel.selectByVisibleText("Advertisement");
		WebElement msg1=driver.findElement(By.name("campaignstatus"));
		Select sel1=new Select(msg1);
		sel1.selectByVisibleText("                                                 Active                                         ");
		
	}
		
		
	}


