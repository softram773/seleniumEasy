package org.automation.runMe;

import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\ramesh.biradar\\eclipse-workspace\\automation\\src\\java\\resources\\org\\automation\\feature\\checkbox.feature"},
glue= {"org.automation.runMe"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
monochrome = true
)

public class runMe extends AbstractTestNGCucumberTests{
	
	@AfterClass
	public static void reportsetup() {
		Reporter.loadXMLConfig(new File("C:\\Users\\ramesh.biradar\\eclipse-workspace\\automation\\src\\java\\resources\\extentReport1\\extent-report.xml"));
		Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
		Reporter.setSystemInfo("Time zone",System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.4.0");
	    Reporter.setSystemInfo("Maven", "3.3");
	    Reporter.setSystemInfo("Java Version", "1.8.0_151");
		Reporter.setTestRunnerOutput("Cucumber TestNG Test runner");
	}
}
