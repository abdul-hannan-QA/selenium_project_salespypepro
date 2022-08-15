package test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.Base;
import model.CommonMethods;
import model.Locators;

public class Deal extends Base {

	@Test
	public void createpipeline() {

		ExtentTest test= extent.createTest("Deal module testcase"); 
		test.log(Status.INFO, "Deal module open successfully");

		CommonMethods.clickOnButton(Locators.clickdeals);
		CommonMethods.timeOut();
		WebDriverWait wait =new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'/pipelines')]")));

		CommonMethods.clickOnButton(Locators.dealsetting);

		CommonMethods.timeOut();



		CommonMethods.clickOnButton(Locators.createpipeline);
		CommonMethods.timeOut();
		CommonMethods.sendText(Locators.createpipelinetitle, "hannan");
		CommonMethods.clickOnButton(Locators.addpipeline);
		CommonMethods.timeOut();
		test.pass("pipeline create successfully done");




		//	  	  CommonMethods.clickOnButton(Locators.selectpipeline);
		//	  	  CommonMethods.timeOut();
		//	  	  CommonMethods.clickOnButton(Locators.hannanpipeline);

		CommonMethods.timeOut();

		CommonMethods.clickOnButton(Locators.deletepipelinebutton);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.deleteconfirm);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.deletepipelinedeal);
		CommonMethods.timeOut();
		test.pass("pipeline delete successfully done");
		
		
		
	}
	
	@Test
	public void createstage() {
		
		
        
		//create stage
		
		ExtentTest test= extent.createTest("stage module testcase");

		CommonMethods.clickOnButton(Locators.selectpipeline);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.selectpipelineproject11);

		CommonMethods.clickOnButton(Locators.addstage);
		CommonMethods.timeOut();
		CommonMethods.sendText(Locators.stagetitle, "interested");

		CommonMethods.clickOnButton(Locators.selectstagepipeline);

		CommonMethods.clickOnButton(Locators.project11);  
		CommonMethods.timeOut();

		//		 CommonMethods.clickOnButton(Locators.winprobality); 
		//		 CommonMethods.timeOut();
		//	  CommonMethods.clickOnButton(Locators.winpercantage); 
		CommonMethods.clickOnButton(Locators.selectyellocolor); 
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.addstagebutton); 
		CommonMethods.timeOut();
		test.pass("stage create successfully done");

		String interested=CommonMethods.getText(Locators.interestedstage);

		if(Locators.intertestedtext.equalsIgnoreCase(interested)) {

			test.pass("interested stage found");
			System.out.println(" interested stage found  "+ interested);

			CommonMethods.clickOnButton(Locators.interestedstagedelete);
			CommonMethods.timeOut();
			CommonMethods.clickOnButton(Locators.deleteconfirm);
			CommonMethods.timeOut();
			CommonMethods.clickOnButton(Locators.deletepipelinedeal);
			CommonMethods.timeOut();
			test.pass("Stage delete successfully");


		}else
		{
			test.fail("interested stage does not  found");
			System.out.println("The expected stage doesn't match the actual stage ---  "+interested);
		}




		CommonMethods.timeOut();




	}





}







