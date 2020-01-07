package com.nationalguard.myenlistmenttimeline;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
//import org.testng.internal.DynamicGraph.Status;

import com.aventstack.extentreports.Status;
import com.nationalguard.base.BaseTest;

public class Myenlistmenttimeline extends BaseTest {
	@Test
	public void myenlistmenttimelin() {
		test=extent.createTest("myenlistmenttimeline");
		test.log(Status.INFO, "myenlistmenttimeline Test Started");
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		driver.findElement(By.xpath("//a[@class='child-link'][contains(text(),'My Enlistment Timeline')]")).click();
		driver.findElement(By.xpath("//button[@name='start_enlistment']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Helping people')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Paying for college')]")).click();
		driver.findElement(By.xpath("//button[@name='enlistment_cont']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'At the office')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Somewhere different every day')]")).click();
		driver.findElement(By.xpath("//button[@name='enlistment_cont']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Math or computers')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Science')]")).click();
		driver.findElement(By.xpath("//button[@name='enlistment_cont']")).click();
		driver.findElement(By.xpath("//label[contains(text(), 'Technology or computers')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Weapons or machinery')]")).click();
		driver.findElement(By.xpath("//button[@name='enlistment_cont']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Training')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Education')]")).click();
		driver.findElement(By.xpath("//button[@name='enlistment_cont']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'GED')")).click();
		driver.findElement(By.xpath("//button[@name='enlistment_cont']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Infantry and Weapons Systems')]")).click();
		driver.findElement(By.xpath("//button[@name='enlistment_cont']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Later than two months')]")).click();
		driver.findElement(By.xpath("//button[@name='enlistment_cont']")).click();
		driver.findElement(By.xpath("//button[@name='enlistment_cont']")).click();
}
}