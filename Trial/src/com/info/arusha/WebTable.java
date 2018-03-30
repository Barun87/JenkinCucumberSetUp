package com.info.arusha;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.ScrollAction;

import com.opera.core.systems.scope.protos.ExecProtos.MouseAction;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver wd=new FirefoxDriver();
       wd.get("http://webdatacommons.org/webtables/");
       WebElement wl=wd.findElement(By.xpath(".//*[@id='toccontent']/table[2]/tbody"));
      WebElement wl1= wl.findElement(By.tagName("tr"));
    System.out.println( wl1.getSize()); 
      /* Actions action =new Actions(wd);
       action.keyDown(Keys.DOWN).moveToElement(wl);
       JavascriptExecutor jsx = (JavascriptExecutor)wd;
       jsx.executeScript("window.scrollBy(0,1000)", "");*/
	}

}
