package MyProject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpFace {
public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murat\\eclipse-workspace 1\\MyProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	    
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement Account=driver.findElement(By.xpath("//*[text()= 'Create new account']"));
	    Account.click();
	    Thread.sleep(3000);
	    WebElement First=driver.findElement(By.name("firstname"));
	    First.sendKeys("Murat");
	    
	    WebElement Last=driver.findElement(By.name("lastname"));
	    Last.sendKeys("Ozbek");
	    
	    WebElement Mail=driver.findElement(By.name("reg_email__"));
	    Mail.sendKeys("ozbekmurat@endustriteknik.com");
	    
	    WebElement Con=driver.findElement(By.name("reg_email_confirmation__"));
	    Con.sendKeys("ozbekmurat@endustriteknik.com");
	  
	    WebElement Pass=driver.findElement(By.name("reg_passwd__"));
	    Pass.sendKeys("1234");
	    
	    WebElement MonthOfBirth=driver.findElement(By.name("birthday_month"));
	    Select ob = new Select(MonthOfBirth);
	    ob.selectByValue("11");
	    WebElement BirthDay=driver.findElement(By.name("birthday_day"));
	    Select birth = new Select(BirthDay);
	    birth.selectByVisibleText("22");
	    WebElement BirthDayYear=driver.findElement(By.name("birthday_year"));
	    Select birth1 = new Select(BirthDayYear);
	    birth1.selectByVisibleText("1976");
	    WebElement maletoggle=driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
	    maletoggle.click();
	    Thread.sleep(3000);
	      
	    WebElement Sign=driver.findElement(By.name("websubmit"));
		Sign.click();
	 
	  
	
		
	}

}
