package com.info.arusha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhijeetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try{   
		System.out.println("hi");
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\chromedriver.exe");
           ChromeDriver driver=new ChromeDriver();
           driver.get("http://www.google.com");
           WebElement x=driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
           x.sendKeys("flowers");
           driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")) .click(); 
        }catch(Exception ex)
        {
        	System.out.println();
        }
           
	}

}
