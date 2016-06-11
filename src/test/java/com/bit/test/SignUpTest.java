package com.bit.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SignUpTest 
{

	@Test
	public void login() throws MalformedURLException, Exception
    {
   
        //DesiredCapabilities capability = DesiredCapabilities.firefox();
        //WebDriver driver = new RemoteWebDriver(new URL("http://52.35.94.10:4444/wd/hub"), capability);
		System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("asad.zaman@target.com");
        Thread.sleep(5000);
        driver.quit();
    }

}
