package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

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

  public static WebDriver driver;
  public static ChromeDriverService service;
  @BeforeClass
  public static void createAndStartService() {
    service = new ChromeDriverService.Builder()
        .usingDriverExecutable(new File("/home/ubuntu/Chrome/chromedriver"))
        .usingAnyFreePort()
        .build();
    service.start();
  }

  @AfterClass
  public static void createAndStopService() {
    service.stop();
  }

  @BeforeTest
  public void createDriver() {
    driver = new RemoteWebDriver(service.getUrl(),
        DesiredCapabilities.chrome());
  }

  @AfterTest
  public void quitDriver() {
    driver.quit();
  }

  @Test
  public void f() throws IOException 
  {

	  /*System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Chrome/chromedriver");
      ChromeOptions options = new ChromeOptions();
      options.setBinary("/usr/bin/google-chrome");
      DesiredCapabilities capabilities = DesiredCapabilities.chrome();
      capabilities.setCapability(ChromeOptions.CAPABILITY, options);
      WebDriver driver = new ChromeDriver(options);
      driver.get("http://www.google.com");*/
	  /////////////////////////////////////////////////////////////////////////////////////////	  
	  /*ChromeDriverService srvc = new ChromeDriverService.Builder()
	  							 .usingDriverExecutable(new File("/home/ubuntu/Chrome/chromedriver"))
	  							 .withLogFile(new File("/home/ubuntu/Chrome/chromedrvr.log"))
	  							 .usingAnyFreePort()
	  							 .build();
	  srvc.start();
	  
	  
	  WebDriver driver = new RemoteWebDriver(srvc.getUrl(),DesiredCapabilities.chrome());
	  driver.get("http://www.google.com");*/
	  ////////////////////////////////////////////////////////////////////////////////////////////
	  driver.get("http://www.google.com");
	  
	  
  }
}
