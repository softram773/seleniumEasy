package org.automation.demo;


import java.util.ResourceBundle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchBrowser {

	public static WebDriver driver;
	ResourceBundle config;
	
	public static void main(String[] args) {
		LaunchBrowser lb = new LaunchBrowser();
		lb.createBrowser();
	}

	public WebDriver createBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ResourceBundle config= ResourceBundle.getBundle("config");
		driver = new ChromeDriver();
		driver.get(config.getString("applicationURL"));
		driver.manage().window().maximize();
		return driver;
	}

}
