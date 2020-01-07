package com.nationalguard.eligibility;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.nationalguard.base.BaseTest;

public class Eligibility extends BaseTest {
	@Test
	public void eligibility() throws InterruptedException {
		
		test=extent.createTest("eligibility");
		test.log(Status.INFO, "eligibility Test started");
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		driver.findElement(By.xpath("//a[@class='child-link'][contains(text(),'What It Takes')]")).click();
		String str1=driver.findElement(By.xpath("//h3[@class='h1 gray']")).getText();
		System.out.println(str1);
		Thread.sleep(1500);
		/*driver.findElement(By.xpath("//span[@class='active patty-2']xpathvalue")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		driver.findElement(By.xpath("//a[@class='child-link'][contains(text(),'How to join')]")).click();
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		driver.findElement(By.xpath("//a[@href='//a[@href='/basic-combat-training']']")).click();
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		driver.findElement(By.xpath("//a[@href='/eligibility/prior-service']")).click();
		//driver.getTitle()
		//driver.findElement(By.xpath("//a[@class='child-link'][contains(text(),'What It Takes')]")).click();
		//driver.findElement(By.xpath("//a[@class='child-link'][contains(text(),'What It Takes')]")).click();*/
	}

}
