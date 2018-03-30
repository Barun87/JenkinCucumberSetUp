package com.info.arusha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver wd=new FirefoxDriver();
    wd.get("http://flipkart.com");
    
    List<WebElement>wl=wd.findElements(By.cssSelector(".menu-text.fk-inline-block>span"));
    for(int i=0;i<wl.size();i++)
    	
    {
    	System.out.println(wl.get(i).getText());
    	if(wl.get(i).getText()=="MEN")
    	{
    		wl.get(i).click();
    	}
    }
	}

}
