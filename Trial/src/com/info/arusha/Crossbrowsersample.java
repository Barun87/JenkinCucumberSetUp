package com.info.arusha;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



	public class Crossbrowsersample {
		public WebDriver driver;

	  

	  @Parameters("browser")

	  @BeforeClass

	  // Passing Browser parameter from TestNG xml

	  public void beforeTest(String browser) {

	  // If the browser is Firefox, then do this

	  if(browser.equalsIgnoreCase("firefox")) {

		  driver = new FirefoxDriver();

	  // If browser is IE, then do this	  

	  }else if (browser.equalsIgnoreCase("chrome")) { 

		  // Here I am setting up the path for my IEDriver

		  System.setProperty("webdriver.chrome.driver", "C:/Softwares/chromedriver.exe");

		  driver = new ChromeDriver();

	  } 

	  // Doesn't the browser type, lauch the Website

	  driver.get("http://google.com"); 

	  }

	  

	  // Once Before method is completed, Test method will start

	  @Test
	  public void login() throws InterruptedException {

		System.out.println("Co browser testing");

		}  



	  @AfterClass public void afterTest() {

			driver.quit();

		}

	}


