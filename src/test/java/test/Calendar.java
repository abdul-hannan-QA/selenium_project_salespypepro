package test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.Base;
import model.CommonMethods;
import model.Locators;

public class Calendar extends Base {
	
	@Test(priority = 1)
	public void addactivity() {
		
		
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[@id='root']//li[4]//a[1]"))).build().perform();
	    CommonMethods.timeOut();
	    CommonMethods.clickOnButton(Locators.selectcalendar);
	    CommonMethods.timeOut();
	    CommonMethods.clickOnButton(Locators.addnewactivity);
	    CommonMethods.clickOnButton(Locators.selectappoinment);
	    CommonMethods.sendText(Locators.appoinmenttitle, "metting with client");
	    CommonMethods.sendText(Locators.appentdescription, "pypepro new design");
	    CommonMethods.clickOnButton(Locators.selectuser);
	    CommonMethods.timeOut();
	    CommonMethods.clickOnButton(Locators.selectusertechnical);
	    CommonMethods.timeOut();
	    CommonMethods.sendText(Locators.searchcontactcalendar, "crmhannan");
	    CommonMethods.timeOut();
	    CommonMethods.clickOnButton(Locators.contactcalendar);
	    CommonMethods.timeOut();
	    CommonMethods.clickOnButton(Locators.checknotification);
	    CommonMethods.clickOnButton(Locators.addactivity);
	    CommonMethods.timeOut();
	    
	    

	}
	
	

}
