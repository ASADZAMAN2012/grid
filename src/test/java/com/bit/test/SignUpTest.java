package com.bit.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SignUpTest 
{

	@Test
	public void login() throws MalformedURLException, Exception
    {
   
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        //WebDriver driver = new RemoteWebDriver(new URL("http://52.35.94.10:4444/wd/hub"), capability);
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.facebook.com");
        Thread.sleep(5000);
        driver.quit();
    }

}
