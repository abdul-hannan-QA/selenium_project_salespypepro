package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.util.Assert;

import base.Base;
import io.reactivex.rxjava3.functions.Action;
import model.CommonMethods;
import model.Locators;
import pages.HomePage;

public class Inbox extends Base {

	SoftAssert softassert=new SoftAssert();



	@Test
	public void inboxTest() {

		ExtentTest test= extent.createTest("inbox testcase"); 
		test.log(Status.INFO, "Inbox module open successfully");


		CommonMethods.timeOut();
		//click on inbox menu
		CommonMethods.clickOnButton(Locators.inboxButtonClick);




		//implicitlyWait
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		//ExplicitlyWait

		//search inbox  test contact
		WebDriverWait wait =new WebDriverWait(driver,50);
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search People in Inbox']")));

		boolean status= element.isDisplayed();
		if(status)
		{
			System.out.println("contact found");
			test.pass("search worked properly");
		}
		else
		{
			System.out.println("contact not found");
			test.fail("Search does not work ");
		}

		CommonMethods.timeOut();

		CommonMethods.sendText(Locators.searchPeople,"Test Contact");
		CommonMethods.timeOut();
		driver.findElement(By.xpath("//span[.='Test Contact']")).click();


		CommonMethods.timeOut();


		//senmessage
		CommonMethods.clickOnButton(Locators.sendmessage);
//ignor

		CommonMethods.timeOut();
		CommonMethods.sendText(Locators.textareaText,"hello i am from tecnical_test automation");
		CommonMethods.timeOut();
		//for select dropdown alternative
		//CommonMethods.dropdown(Locators.personalized,"first_name");

		CommonMethods.clickOnButton(Locators.personalized);
		CommonMethods.timeOut();

		CommonMethods.clickOnButton(Locators.selectfirstname);
		CommonMethods.timeOut();

		CommonMethods.clickOnButton(Locators.sendButton);
		test.pass("Text sms send successfully");



		//back to sendmessage
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.sendmessage);

		CommonMethods.timeOut();

		//verify email modal open
		CommonMethods.clickOnButton(Locators.emailButton);
		CommonMethods.timeOut();


		String Emailmodaltext = CommonMethods.getText(Locators.emailmodalopeninbox);
		System.out.println("email modal open from inbox");

		//othertechniqu
		// assertEquals(Emailmodaltext, Locators.emailmodalopen);

		if(Locators.emailmodalopen.equalsIgnoreCase(Emailmodaltext)) {

			test.pass("Email modal open");
			System.out.println("Email modal open successfully"+ Emailmodaltext);

		}else
		{
			test.fail("Email modl does not found");
			System.out.println("The expected heading doesn't match the actual heading --- "+Emailmodaltext);
		}



		CommonMethods.timeOut();
		CommonMethods.sendText(Locators.emailsubject,"Email test from inbox");
		test.pass("Email send successfully");
		//CommonMethods.clickOnButton(Locators.personalizedemail);
		CommonMethods.clickOnButton(Locators.sendemailinbox);

		CommonMethods.timeOut();
		//Email end

		//send video mail

		CommonMethods.clickOnButton(Locators.videoEmail);

		CommonMethods.timeOut();


		String videomodaltext = CommonMethods.getText(Locators.videomodalopeninbox);
		System.out.println("video modal open from inbox");
		if(Locators.videomodalopen.equalsIgnoreCase(videomodaltext)) {

			test.pass("video modal open");
			System.out.println("video modal open successfully /n "+ videomodaltext);

		}else
		{
			test.fail("video modl does not found");
			System.out.println("The expected heading doesn't match the actual heading --- "+videomodaltext);
		}






		//othertechnique
		//assertEquals(videomodaltext, Locators.videomoadlopeninbox,"video madal does not open");
		//softassert

		//	   softassert.assertEquals(true,false, "video modal does not open");
		//	   softassert.assertAll();
		//		

		CommonMethods.clickOnButton(Locators.quickreply);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.selectvideo);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.sendvideomail);
		test.pass("video mail successfully done");

		CommonMethods.timeOut();



		//videomailfromlibrary

		CommonMethods.clickOnButton(Locators.videoEmail);

		CommonMethods.timeOut();

		CommonMethods.clickOnButton(Locators.videolibrary);	
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.videoselectlibrary);
		CommonMethods.timeOut();
		CommonMethods.sendText(Locators.videomailsubject,"video automation testing");
		CommonMethods.clickOnButton(Locators.sendvideomail);
		test.pass("video mail successfully done from library");
		CommonMethods.timeOut();
	}

	@Test(priority=2)
	public void Directpostard() {

		ExtentTest test= extent.createTest("postcard testcase"); 
		//Direct mail
		test.info("Direct mail option");

		CommonMethods.clickOnButton(Locators.directmailopen);
		CommonMethods.clickOnButton(Locators.postcardopen);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.saveandcontinue);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.selectpostcard);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.selectpostcardfeedback);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.feedbackselect);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.saveandcontinue);

		CommonMethods.clickOnButton(Locators.saveandcontinue);


		CommonMethods.timeOut();
		//
		int totaliframe= driver.findElements(By.name("iframe")).size();
		System.out.println("totaliframe"+ totaliframe);

		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		CommonMethods.timeOut();

		//CommonMethods.sendText(Locators.textareapostcard," Hello how are you,  Here the sun is shining, the birds are singing and the waves make a peaceful sound in the background."
		//	+ " It’s exactly what I needed. Can’t wait to see you soon");
		//driver.switchTo().defaultContent();

		//explicitywait

		WebDriverWait wait2 =new WebDriverWait(driver,50);

		CommonMethods.clickOnButton(Locators.generatepdfpostcard);


		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,'Update PDF')]")));
		//			
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//			Actions action=new Actions(driver);
		//			action.moveToElement(driver.findElement(By.xpath("//a[contains(normalize-space(),'Generate PDF')]"))).click();


		//driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
		//CommonMethods.timeOut();
		//CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.sendpostcard);
		CommonMethods.timeOut();
		test.pass("post card send successfully");




	}


	@Test(priority=3)
	public void Directgrettingcard() {

		ExtentTest test= extent.createTest("grettingcard testcase"); 
		//grettingcard


		CommonMethods.clickOnButton(Locators.grettingcardopen);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.selectgrettingcard);
		CommonMethods.clickOnButton(Locators.selectgreetingbirthday);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.selectbirthdaypic);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.saveandcontinuegretting);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.saveandcontinuegretting);

		CommonMethods.timeOut();

		CommonMethods.clickOnButton(Locators.generategreetingcardpdf);
		WebDriverWait wait2 =new WebDriverWait(driver,50);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,'Update PDF')]")));


		CommonMethods.clickOnButton(Locators.sendgreetingcard);
		CommonMethods.timeOut();
		test.pass("gretting card send successfully");
		
	}
	@Test(priority=4)
	public void Directlettercard() {

		ExtentTest test= extent.createTest("letter testcase");

		//letter

		CommonMethods.clickOnButton(Locators.lettercardopen);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.selectlettertemplate);

		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.saveandcontinuegretting);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.saveandcontinuegretting);

		CommonMethods.timeOut();

		CommonMethods.clickOnButton(Locators.generategreetingcardpdf);

		WebDriverWait wait2 =new WebDriverWait(driver,50);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,'Update PDF')]")));
		CommonMethods.clickOnButton(Locators.sendgreetingcard);
		CommonMethods.timeOut();
		test.pass("Letter card send successfully");


	}



	@Test(priority=5)
	public void Directgiftcard() {

		ExtentTest test= extent.createTest("grettingcard testcase");

		//Gift
		CommonMethods.clickOnButton(Locators.giftcardopen);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.selectgift);

		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.saveandcontinuegretting);
		CommonMethods.clickOnButton(Locators.selectgifttemplate);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.selectgetwell);
		CommonMethods.clickOnButton(Locators.selectgetwellpic);
		CommonMethods.clickOnButton(Locators.saveandcontinuegretting);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.saveandcontinuegretting);
		CommonMethods.clickOnButton(Locators.generategreetingcardpdf);
		WebDriverWait wait2 =new WebDriverWait(driver,50);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,'Update PDF')]")));
		CommonMethods.clickOnButton(Locators.sendgreetingcard);
		test.pass("Gift card send successfully");
		CommonMethods.timeOut();

		CommonMethods.timeOut();
		//Note
		CommonMethods.clickOnButton(Locators.noteopeninbox);
		CommonMethods.timeOut();
		CommonMethods.sendText(Locators.noteareatext,"hello ,please attend the sqa metting");
		CommonMethods.clickOnButton(Locators.noteopeninbox);
		CommonMethods.clickOnButton(Locators.addnoteinbox);
		test.pass("Text added into the note");
		CommonMethods.timeOut();

	}


	@Test(priority=6)
	public void chat() {

		ExtentTest test= extent.createTest("chat testcase");
		//chat
		CommonMethods.clickOnButton(Locators.sendmessage);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.chatopeninbox);
		CommonMethods.sendText(Locators.chattextarea, "hello,please contact me through this number");
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.chatpersonalized);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.chatselectmyvirtualnumber);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.chatsend);
		test.pass("Chat send succesgully");
		//driver.manage().deleteAllCookies();
		//chatquickreply

		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.sendmessage);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.chatopeninbox);
		CommonMethods.clickOnButton(Locators.chatquickreply);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.chattemplateselect);
		CommonMethods.timeOut();
		CommonMethods.clickOnButton(Locators.chatsend);
		test.pass("Chat send from quickreply");
		CommonMethods.timeOut();



		}

  
	@Test(priority=7)
	public void important() {
		
		ExtentTest test= extent.createTest("important testcase");
		//mark important

		//test
		try {
			driver.findElement(By.xpath("//a[contains(@title,'Mark as important')]"));


			CommonMethods.clickOnButton(Locators.markimportant);
			CommonMethods.timeOut();
			CommonMethods.clickOnButton(Locators.important);
			CommonMethods.timeOut();

			String contact=CommonMethods.getText(Locators.importanttext);

			if(Locators.TestContact.equalsIgnoreCase(contact)) {

				test.pass("Text contact found in important");
				System.out.println(" Text contact found in important successfully \n "+ contact);

			}else
			{
				test.fail("text contact  does not found");
				System.out.println("The expected heading doesn't match the actual heading ---  "+contact);
			}




			CommonMethods.timeOut();


		}catch(Exception e) {


			CommonMethods.timeOut();

			CommonMethods.clickOnButton(Locators.markunimportant);
			test.pass("contact unimportant successfully");
			CommonMethods.timeOut();

		
		
	}

	}
	


	@Test(priority=8)
	public void read() {

		ExtentTest test= extent.createTest("grettingcard testcase");


		//unread

		CommonMethods.clickOnButton(Locators.contactunread);

		CommonMethods.timeOut();

		String contactnew1=CommonMethods.getText(Locators.contactnew);

		if(Locators.newtext.equalsIgnoreCase(contactnew1)) {

			test.pass("message goes into unread");
			System.out.println("message goes into unread successfully \n "+ contactnew1);

		}else
		{
			test.fail("message does not goes into unread");
			System.out.println("message does not  goes into unread  "+contactnew1);
		}

		CommonMethods.timeOut();


	}



}
