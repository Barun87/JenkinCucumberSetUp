package com.info.arusha;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {

	public static void main(String[] args) throws Exception {
		WebDriver wd=new FirefoxDriver();
		wd.get("http://www.toolsqa.com/automation-practice-form/");
		wd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		wd.findElement(By.xpath(".//*[@id='photo']")).click();
		Runtime.getRuntime().exec("C:\\autoit scripts\\autodemo.exe");
		wd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//wd.close();

	}

}
