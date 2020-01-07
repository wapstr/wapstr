package com.nationalguard.resources;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.nationalguard.base.BaseTest;

public class Resources extends BaseTest {
	@Test
	public void resources() throws InterruptedException {
		test = extent.createTest("resources");
		test.log(Status.INFO, "resources Test Started");
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Soldier Tools')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'The Guard Story')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'FAQ')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(),'FAQs for Parents')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Hometown Hero')]")).click();
	}

}
