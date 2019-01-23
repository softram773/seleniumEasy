package org.automation.elements;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class BrowserElements {
	
	WebDriver driver;
	ResourceBundle element;
	
	public BrowserElements(WebDriver driver) {
		this.driver=driver;
		element = ResourceBundle.getBundle("Elements");
		
	}
	public void singleCheckbox() {
		driver.findElement(By.xpath(element.getString("tree_xpath"))).click();
		driver.findElement(By.xpath(element.getString("click_on_checkbox_demo_xpath"))).click();
		driver.findElement(By.xpath(element.getString("check_checkbox_xpath"))).click();
	}
	public void sucessMessage() throws IOException {
		String ActualValue = driver.findElement(By.id(element.getString("read_sucess_msg_id"))).getText();
		try {
		Assert.assertEquals(ActualValue, "Success - Check box is checked");
		}catch(AssertionError e) {
			File f = ((TakesScreenshot) driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
			File f1 = new File("C:\\Users\\ramesh.biradar\\eclipse-workspace\\automation\\target\\Result.png");
			FileUtils.copyFile(f, f1);
			throw e;
		}
	}
	
	

}
