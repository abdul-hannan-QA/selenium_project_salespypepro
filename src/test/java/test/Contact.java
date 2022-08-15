package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.Base;
import model.CommonMethods;
import model.Locators;

public class Contact extends Base{
	
	@Test(priority = 1)
	public void addtag() throws Exception {
		
		MyScreenRecorder.startRecording("salespypepro Contact module");
		ExtentTest test= extent.createTest("Tag module testcase"); 
		
		//CommonMethods.timeOut();
		//CommonMethods.clickOnButton(Locators.toggle);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.clickcontact);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		
		
		
		CommonMethods.sendText(Locators.searchcontact, "crmhannan");
		CommonMethods.timeOut();
		test.pass("crmhannan contact found");
		CommonMethods.clickOnButton(Locators.contactselect);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.actincontact);
		CommonMethods.timeOut();
		
		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Assign Tag']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);

		CommonMethods.timeOut();
		
		CommonMethods.sendText(Locators.searchtag, "new");
		CommonMethods.clickOnButton(Locators.selecttag);
		CommonMethods.clickOnButton(Locators.assigntag);
		
		CommonMethods.timeOut();
		
	   boolean tagpresent= CommonMethods.testDISPLAY(Locators.tag);
	   
	if(tagpresent) {
		test.pass("Tag added successfully");
	}
	else {
		
		test.fail("tag does not added");
	}
		
		
		
		
		
	}
	
	@Test(priority = 2)
	public void addcampaign() throws Exception {
		
		
		ExtentTest test= extent.createTest("add campaign testcase"); 
		
		CommonMethods.clickOnButton(Locators.actincontact);
		CommonMethods.timeOut();
		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Add To Campaign']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
		
		CommonMethods.timeOut();
		CommonMethods.sendText(Locators.searchcampaign, "issue test");
		CommonMethods.clickOnButton(Locators.selectcampaign);
		CommonMethods.clickOnButton(Locators.nextbutton);
		CommonMethods.clickOnButton(Locators.startbutton);
		CommonMethods.timeOut();
		
		 boolean campaignpresent= CommonMethods.testDISPLAY(Locators.campaign);
		 
		   
			if(campaignpresent) {
				test.pass("campaign added successfully");
			}
			else {
				
				test.fail("tag does not added");
			}
		
			MyScreenRecorder.stopRecording();
			CommonMethods.timeOut();
		
	}

}
