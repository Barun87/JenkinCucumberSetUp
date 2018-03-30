package com.info.arusha;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DataProvide {
	@Test
	@Parameters("myname")
	public void TC1(String myname){
		System.out.println("The value of myname is"+myname);
		
	}
	
@Test(dataProvider="details")
public void outputCredentials(String username1,String passwd){
	
	System.out.println("Username="+username1+"\n"+"Password="+passwd);
	
}
@Test
public void cityNames()
{
	String departure=".ui-menu-item>a";
	WebDriver wd=new FirefoxDriver();
	wd.get("http://makemytrip.com");
	wd.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	wd.findElement(By.xpath(".//*[@id='top_content']/div[2]/div/div[2]/div/div[3]/div[2]/span[1]/a")).click();
	wd.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	List<WebElement> wl=(List<WebElement>) wd.findElements(By.cssSelector(departure));
	System.out.println(wl.size());
	for(int i= 0;i<=wl.size();i++)
	{
		System.out.println(wl.get(i).getText()+"\n");
	}
}
List l1=new ArrayList<String>();
int i;
@Test(dataProvider="test1",threadPoolSize=3,invocationCount=3)
public void getMessages(String msg)
{
	 
	//l1.add(msg);
	//i=l1.size();
	//System.out.println(i);
System.out.println(msg);	
}
@Test
public void display(){
	System.out.println(i);
}
@DataProvider(name="test1",parallel=true)
public Object[][]trialMsgs()
{   List l=new ArrayList<String>();
l.add("a");
l.add("b");
l.add("c");
l.add("d");
l.add("e");
l.add("f");
l.add("g");
//System.out.println(l);
	return new Object[][]{{l.get(1)},{l.get(2)},{l.get(3)}};
	
}


@DataProvider(name="details")
public Object[][]loginCredentials()
{
	return new Object[][]{{"Barun","password"}};
}
}