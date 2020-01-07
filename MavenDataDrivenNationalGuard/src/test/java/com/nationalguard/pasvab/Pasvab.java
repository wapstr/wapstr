package com.nationalguard.pasvab;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.nationalguard.base.BaseTest;

public class Pasvab extends BaseTest {
	@Test
	public void pasvab() {
		test = extent.createTest("pasvab");
		test.log(Status.INFO, "pasvab Test Started");
		driver.findElement(By.xpath("//button[@class='hamburger tab-focus']")).click();
		driver.findElement(By.xpath("//*[text()='Taking the ASVAB' and @class='child-link']")).click();
		driver.findElement(By.xpath("//*[text()='PRACTICE ASVAB']")).click();
		driver.findElement(By.name("start-test")).click();
		driver.findElement(By.xpath("//*[text()='A.']")).click();
		driver.findElement(By.xpath("//*[@type='submit'and @class='btn-gold chevron-right']")).click();
		driver.findElement(By.xpath("//*[text()='D.']")).click();
		driver.findElement(By.xpath("//*[@type='submit'and @class='btn-gold chevron-right']")).click();
		driver.findElement(By.xpath("//*[text()='D.']")).click();
		driver.findElement(By.xpath("//*[@type='submit'and @class='btn-gold chevron-right']")).click();
		driver.findElement(By.xpath("//*[text()='D.']")).click();
		driver.findElement(By.xpath("//*[@type='submit'and @class='btn-gold chevron-right']")).click();
		driver.findElement(By.xpath("//*[text()='D.']")).click();
		driver.findElement(By.xpath("//*[@type='submit'and @class='btn-gold chevron-right']")).click();
		driver.findElement(By.xpath("//*[text()='C.']")).click();
		driver.findElement(By.xpath("//*[@type='submit'and @class='btn-gold chevron-right']")).click();
		driver.findElement(By.xpath("//*[text()='D.']")).click();
		driver.findElement(By.xpath("//*[@type='submit'and @class='btn-gold chevron-right']")).click();
		driver.findElement(By.xpath("//*[text()='B.']")).click();
		driver.findElement(By.xpath("//*[@type='submit'and @class='btn-gold chevron-right']")).click();
		driver.findElement(By.xpath("//*[text()='C.']")).click();
		driver.findElement(By.xpath("//*[@type='submit'and @class='btn-gold chevron-right']")).click();
		driver.findElement(By.xpath("//*[text()='C.']")).click();
		driver.findElement(By.xpath("//*[@type='submit'and @class='btn-gold chevron-right']")).click();
		driver.findElement(By.xpath("//*[text()='B.']")).click();
		driver.findElement(By.xpath("//*[@type='submit'and @class='btn-gold chevron-right']")).click();
		driver.findElement(By.xpath("//*[text()='D.']")).click();
		driver.findElement(By.xpath("//*[@type='submit'and @class='btn-gold chevron-right']")).click();
	}

}
