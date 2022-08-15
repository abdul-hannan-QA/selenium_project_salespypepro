package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver 	driver;
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	
	
	@BeforeSuite
	public static WebDriver  setup() {
		
		extent=new ExtentReports();
		reporter=new ExtentSparkReporter("report.html");
		extent.attachReporter(reporter);
		
		WebDriverManager.chromedriver().setup();
		
		//headless browser
		ChromeOptions option=new ChromeOptions();
		option.addArguments("window-size=1400,800");
		option.addArguments("headless");
		
		driver = new ChromeDriver();
		return driver;
		
		
	}
	
	@AfterSuite
	public static  void teardown() {
		
		extent.flush();
		driver.close();
	}
	

}
