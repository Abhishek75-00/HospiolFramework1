package testClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom1.LoginPage;
import pom1.RadioLogy;

public class VerificationOfRadioLogy {

WebDriver driver;
RadioLogy Rd;
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BeforeClass");
		System.setProperty("webdriver.chrome.driver","D:\\abhi\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void LoginToApplication() {
		System.out.println("Before Method");
		driver.get("http://admin.hospiol.com/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		LoginPage lp=new LoginPage(driver);
		lp.SendUsername();
		lp.SendPassword();
		lp.ClickOnLoginbutton();

		 Rd=new RadioLogy(driver) ;



	}
	@Test
	public void ToVerifyRadioLogy() {
		Rd.SelectRadiology();
		Rd.SelectRadiologytest();
		Rd.SelectAddRadiology();
		Rd.SelectName();
		Rd.SelectChargeCategory();
		Rd.ChargeN();
		Rd.SelectChargeName();
	}

	@AfterMethod
	public void LogoutFromApplication() {
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void ClosedBrowser()
	{	
		System.out.println("AfterClass");
}
}
