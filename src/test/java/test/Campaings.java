package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import base.Base;
import model.CommonMethods;
import model.Locators;

public class Campaings extends Base {
	
	@Test(priority = 1)
	public void createcampaign() {
	    ExtentTest test= extent.createTest("campaign Module ");
	    Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[@id='root']//li[6]//a[1]"))).build().perform();
		CommonMethods.timeOut();
	    CommonMethods.clickOnButton(Locators.selectcampaigns);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		CommonMethods.clickOnButton(Locators.newcampaign);
		CommonMethods.clickOnButton(Locators.fullfeature);
		CommonMethods.timeOut();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Write Campaign Name')]")).clear();
		CommonMethods.timeOut();
		
		CommonMethods.sendText(Locators.campaignname, "AUTOMATION TEST CAMPAIGN");
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.opencampaignnumber);
		CommonMethods.clickOnButton(Locators.selectcampaignnumber);
		CommonMethods.timeOut();
		
		CommonMethods.clickOnButton(Locators.campaigntimezone);
		CommonMethods.clickOnButton(Locators.selectEasterntimezone);
		CommonMethods.clickOnButton(Locators.addcontactbuttoncampaign);
		CommonMethods.clickOnButton(Locators.selectexistingcontact);
		CommonMethods.timeOut();
		CommonMethods.sendText(Locators.searchexitingcontact, "crmhannan");
		CommonMethods.timeOut();
		
		
		
		 boolean campaigncontact= CommonMethods.testDISPLAY(Locators.campaigncontacttext);
		   
			if(campaigncontact) {
				test.pass("contact found  successfully");
			}
			else {
				
				test.fail("contact does not found");
			}
				
		
		
		
		
		CommonMethods.clickOnButton(Locators.addcontactcampaign);
		
		CommonMethods.clickOnButton(Locators.addnewcontactcampaign);
		CommonMethods.timeOut();
		
		test.pass("contact added successfully");
		
		
		
	
	}
	@Test(priority = 2)
	public void campaignsetting() {
		 ExtentTest test= extent.createTest("campaign setting ");
		CommonMethods.clickOnButton(Locators.campaignsettingtext);
		CommonMethods.sendText(Locators.campaignsettingtextarea, "hello, are you interested to buy new house");
		CommonMethods.clickOnButton(Locators.campaigntextpersonalized);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.campaigntextpersonalizedselect);
		CommonMethods.clickOnButton(Locators.campaignsetfollowupsms);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//edit
		CommonMethods.clickOnButton(Locators.campaigsmsedit);
		CommonMethods.clickOnButton(Locators.campaigsmseditbutton);
		CommonMethods.timeOut();
		 boolean campaignsmsmodal= CommonMethods.testDISPLAY(Locators.smsfollowupmodaltext);
		   
			if(campaignsmsmodal) {
				test.pass("Edit modal open successfully");
			}
			else {
				
				test.fail("Edit modal does not open");
			}
				
				
		
	    CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.smseditmodalclose);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.startcampaign);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.startcampaignyes);
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.navigate().back();
		CommonMethods.timeOut();
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 boolean runningtext= CommonMethods.testDISPLAY(Locators.runningcampaigtext);
		   
			if(runningtext) {
				test.pass("campaign running successfully");
			}
			else {
				
				test.fail("campaign does not running");
			}
		
		
		
		
		
	}

}
