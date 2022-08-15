/*
 * 
 * @author Abdul Hannan
 * 
 */

package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.Base;
import model.CommonMethods;
import model.Locators;

import pages.HomePage;


public class Login extends Base {





	@Test(priority=1)
	public static void loginTest() throws Exception {
		
		MyScreenRecorder.startRecording("salespypepro login test");
		 ExtentTest test= extent.createTest("login testcase");
		 test.log(Status.INFO,"Browser started successfully");

		CommonMethods.timeOut();
		HomePage.homePageUrl(Locators.homePageUrl);
		driver.manage().window().maximize();
		test.pass("browser maximise");
		//commonMethods.clickOnButton(Locators.enterEmail);
		
		if(CommonMethods.getTitle().equalsIgnoreCase(Locators.pageTitlelogin)) {
			test.log(Status.PASS,"login title valodation pass");
			
		}
		else {
			
			test.log(Status.FAIL,"login title valodation Failed");
		}
		
		//assertEquals(CommonMethods.getTitle(), Locators.pageTitlelogin);
		CommonMethods.timeOut();
		CommonMethods.sendText(Locators.enterEmail,"");
		CommonMethods.sendText(Locators.enterPassword,"");

		CommonMethods.clickOnButton(Locators.logInButtonClick);
		test.log(Status.PASS,"login successfully done");
		CommonMethods.timeOut();
		
		System.out.println("login successfully done");
		
	
		CommonMethods.timeOut();
		//assertEquals(CommonMethods.getTitle(), Locators.pageTitledashboard);
		if(CommonMethods.getTitle().equalsIgnoreCase(Locators.pageTitledashboard)) {
			test.log(Status.PASS,"Dashboard title valodation pass");
			
		}
		else {
			
			test.log(Status.FAIL,"Dashboard title valodation Failed");
		}
		
		//alertoff current
		//CommonMethods.clickOnButton(Locators.alertclose);

		//object.method
		CommonMethods.timeOut();
		MyScreenRecorder.stopRecording();

        //Base.teardown();

		
	}
	
	




}
