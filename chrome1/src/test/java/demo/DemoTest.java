package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.net.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class DemoTest {
  @Test
  public void f() throws IOException 
  {
	  //new DesiredCapabilities();
      //URL serverurl = new URL("http://localhost:9515");
	  /*System.setProperty("webdriver.chrome.driver", "/home/ec2-user/jenkins/workspace/chromedriver");
      ChromeOptions options = new ChromeOptions();
      options.setBinary("/usr/bin/google-chrome");
      /*DesiredCapabilities capabilities = DesiredCapabilities.chrome();
      capabilities.setCapability(ChromeOptions.CAPABILITY, options);
      WebDriver driver = new ChromeDriver(options);
      driver.get("http://www.google.com");*/
      //WebElement searchEdit = driver.findElement(By.name("q"));
      //searchEdit.sendKeys("Selftechy on google");
      //searchEdit.submit();
	  
	  ChromeDriverService srvc = new ChromeDriverService.Builder()
	  							 .usingDriverExecutable(new File("/home/ubuntu/Chrome/chromedriver"))
	  							 .withLogFile(new File("/home/ubuntu/Chrome/chromedrvr.log"))
	  							 .usingAnyFreePort()
	  							 .build();
	  srvc.start();
	  
	  WebDriver driver = new RemoteWebDriver(srvc.getUrl(),DesiredCapabilities.chrome());
	  driver.get("http://www.google.com");
	  
  }
}
