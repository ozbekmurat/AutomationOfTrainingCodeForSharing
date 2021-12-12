package MyProject;

import org.testng.annotations.Test;

import PageObjectModel.CreateAnAccount;
import PageObjectModel.Home;
import PageObjectModel.Register;
import PageObjectModel.SignInPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignInAmazon {
   public WebDriver driver;
   
  @Test
  public void f() throws InterruptedException {
	  Home ob = new Home (driver);
	  Thread.sleep(6000);
	  ob.SignToClick();
	  SignInPage it = new SignInPage(driver);
	  it.EmailFieldSendKeys();
	  it.ContinueButtonClick();
	
	  Thread.sleep(2000);
	  
	  CreateAnAccount ab= new CreateAnAccount(driver);
	  
	  Thread.sleep(2000);
	  
	  ab.CreateButtonClick();
	  
	  Thread.sleep(2000);
	  
	  Register re =new Register(driver);
	  re.NameFieldSendKeys();
	  re.MailFieldSendKeys();
	  re.PassFieldSendKeys();
	  re.PassCheckFieldSendKeys();
	  re.ContinueButtonClick();
  }
  @BeforeMethod
  
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\murat\\eclipse-workspace 1\\MyProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
