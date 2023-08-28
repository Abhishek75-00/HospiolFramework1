package testClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom1.LoginPage;
import pom1.RadioLogy;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\abhi\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();


			driver.get("http://admin.hospiol.com/site/login");


			//driver.manage().window().maximize();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			LoginPage lp=new LoginPage(driver);
			lp.SendUsername();
			lp.SendPassword();
			lp.ClickOnLoginbutton();




			RadioLogy Rd=new RadioLogy(driver) ;
			Rd.SelectRadiology();
			Rd.SelectRadiologytest();
			Rd.SelectAddRadiology();
			Rd.SelectName();
			Rd.SelectChargeCategory();
			Rd.ChargeN();
			Rd.SelectChargeName();
		}
	}


