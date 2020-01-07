package com.nationalguard.benefits;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.nationalguard.base.BaseTest;

public class Benefits extends BaseTest {
	@Test
	public void benefits() throws InterruptedException {
		test = extent.createTest("benefits");
		test.log(Status.INFO, "benefits Test Started");
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(),'What You Get')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(),'Education')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(),'Guard Pay')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(),'Insurance')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(),'Retirement')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(),'Home Loans')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(),'Bonuses')]")).click();
	}
}
