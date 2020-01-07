package com.nationalguard.careers;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
//import org.testng.internal.DynamicGraph.Status;

import com.aventstack.extentreports.Status;
import com.nationalguard.base.BaseTest;

public class Careers extends BaseTest {
	@Test
public void careers() throws InterruptedException {
		
		test=extent.createTest("careers");
		test.log(Status.INFO, "careers Test started");
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();	
		driver.findElement(By.xpath("//a[@class='child-link'][contains(text(),\"What It's Like\")]")).click();
		driver.findElement(By.xpath("//h6[contains(text(),'Aviation')]")).click();
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		driver.findElement(By.xpath("//a[@class='child-link'][contains(text(),'STEM Careers')]")).click();
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		driver.findElement(By.xpath("//a[@class='child-link'][contains(text(),'Special Forces')]")).click();
		//driver.findElement(By.xpath("//h6[contains(text(),'18D Special Forces Medical Sergeant')]")).click();
		//driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		driver.findElement(By.xpath("//a[@class='child-link'][contains(text(),'Become an Officer')]")).click();
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		driver.findElement(By.xpath("//a[@class='child-link'][contains(text(),'Become a Warrant Officer')]")).click();
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		driver.findElement(By.xpath("//a[@class='child-link'][contains(text(),'Explore Specialty Careers')]")).click();
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		driver.findElement(By.xpath("//a[@class='child-link'][contains(text(),'Job Board')]")).click();
		
		
	//test=exten
	}
}
