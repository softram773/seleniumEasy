package org.automation.runMe;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Loader;
import org.automation.demo.LaunchBrowser;
import org.automation.elements.BrowserElements;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.*;


public class checkboxSteps {
	
	WebDriver driver;
	BrowserElements be;
	LaunchBrowser lb = new LaunchBrowser();;
	Logger logger = LogManager.getLogger(checkboxSteps.class);
	
	@Given("^Open selenium easy site$")
	public void open_selenium_easy_site() throws Throwable {
		LaunchBrowser lb =new LaunchBrowser();
		driver = lb.createBrowser();
		logger.info("Launching Browser");
	}

	@When("^Select checkbox$")
	public void select_checkbox() throws Throwable {
	   be = new BrowserElements(driver);
	   be.singleCheckbox();
	   logger.info("Select checkbox from right panel and click");
	  }

	@Then("^Success message should display$")
	public void success_message_should_display() throws Throwable {
	    be.sucessMessage();
	    logger.info("Success Message");
	  	}


}
