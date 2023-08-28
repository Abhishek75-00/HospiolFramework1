package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

		// private variable -- WebElement

		// public contructors -- Intialized the methods ,variable

		// public method -- utilized the method , variable - actions

		@FindBy (xpath="//input[@id='email']")
		private WebElement username;

		@FindBy(xpath="//input[@id='password']")
		private WebElement password;

		@FindBy(xpath="//button[text()='Sign In']")
		private WebElement loginbutton;

		WebDriver driver;
		public LoginPage(WebDriver driver) {

			PageFactory.initElements(driver,this);
			this.driver=driver;
		}

	     public void SendUsername() {
			username.sendKeys("abhishek@marolix.com");
		}
		public void SendPassword() {
			password.sendKeys("Reset@123");
		}
		public void ClickOnLoginbutton() {
			loginbutton.click();

		}

	}

