package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo6_guru {
	WebDriver driver = null;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.07\\Desktop\\Drivers\\chromedriver.exe" );
	  driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/upload/");
	  driver.manage().window().maximize();
	  WebElement upload = driver.findElement(By.id("uploadfile_0"));
	  upload.sendKeys("C:\\Users\\training_b6b.00.07\\Desktop\\Drivers\\screen.png");
	  driver.findElement(By.id("terms")).click();
	  driver.findElement(By.id("submitbutton")).click();
	  Thread.sleep(10000);
	  driver.close();
  }
}
