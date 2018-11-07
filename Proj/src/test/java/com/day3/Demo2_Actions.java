package com.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo2_Actions {
	WebDriver driver = null;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.07\\Desktop\\Drivers\\chromedriver.exe" );
	  driver = new ChromeDriver();
	  driver.get("https://www.hdfcbank.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  Actions a1 = new Actions(driver);
	 // a1.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[1]/a"))).perform();
	  a1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
	  Thread.sleep(2000);
	  //a1.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[2]/div[2]/div[1]/ul/li[4]/a"))).perform();
	  a1.moveToElement(driver.findElement(By.xpath("//a[@href='personal/products/demat']"))).perform();
	  Thread.sleep(2000);
	  //a1.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[2]/div[2]/div[2]/div[4]/div/ul/li[1]/a"))).click().build().perform();
	  a1.moveToElement(driver.findElement(By.xpath("//a[@href='personal/products/demat/demat-account']"))).click().build().perform();
	  Thread.sleep(5000);
	  driver.close();
  }
}
