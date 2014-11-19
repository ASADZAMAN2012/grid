package com.bit.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SignUpTest 
{

	public static void main(String[] args) throws MalformedURLException, Exception
    {
        //FirefoxDriver driver = new FirefoxDriver();
         
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.16:4444/wd/hub"), capability);
        driver.get("http://www.facebook.com");
        Thread.sleep(5000);
        driver.close();
    }

}
