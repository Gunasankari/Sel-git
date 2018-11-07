package com.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo10_Alert {
	WebDriver driver = null;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.07\\Desktop\\Drivers\\chromedriver.exe" );
	  driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
	  driver.findElement(By.name("cusid")).sendKeys("12345");
	  driver.findElement(By.name("submit")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Alert a1 = driver.switchTo().alert();
	  System.out.println("Terms and conditions of first alert is "+a1.getText());
	  Thread.sleep(1000);
	  a1.accept();
	  
	  Alert a2 = driver.switchTo().alert();
	  System.out.println("Terms and conditions of second alert is "+a2.getText());
	  a2.accept();
	  
	  driver.close();
  }
}
