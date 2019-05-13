package com.pactera.qaAutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

  @Test
  public void mainTest() throws InterruptedException {
//    throw new RuntimeException("Test not implemented");
	System.out.println( "AppTest Hello World!" );
	System.setProperty("webdriver.chrome.driver", "E:\\Test\\webDriver\\chromedriver.exe");
    WebDriver webDriver = new ChromeDriver();
    webDriver.get("https://www.baidu.com/");
    webDriver.manage().window().setSize(new Dimension(550, 762));
    webDriver.findElement(By.id("kw")).sendKeys("qa");
    webDriver.findElement(By.id("kw")).sendKeys(Keys.ENTER);
    Thread.sleep(5000);
    
    webDriver.findElement(By.linkText("QA_百度百科")).click();

    Thread.sleep(5000);
    webDriver.quit();
    System.out.println( "AppTest Bye!" );
  }
}
