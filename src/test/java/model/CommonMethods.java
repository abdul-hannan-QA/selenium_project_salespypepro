package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class CommonMethods extends Base {



	public static String getTitle() {

		return driver.getTitle();
		


	}

	//For button click
	public static void clickOnButton(By btn) {


		driver.findElement(btn).click();


	}

	public static  String getText(By element) {

		return driver.findElement(element).getText();
	}

	public static void sendText(By element,String value) {

		driver.findElement(element).sendKeys(value);

	}
	
	public static  boolean  testDISPLAY(By display) {
		
		return driver.findElement(display).isDisplayed();
		
		
	}
	
	
//	public static void dropdown(By dropdown, String value) {
//		WebElement r= driver.findElement(dropdown);
//		Select drop = new Select(r);
//		drop.selectByVisibleText(value);
//		
//		
//	}


	public static void timeOut() {

		try {
			Thread.sleep(3000);

		}catch(InterruptedException e) {


			e.printStackTrace();


		}


	}

}

