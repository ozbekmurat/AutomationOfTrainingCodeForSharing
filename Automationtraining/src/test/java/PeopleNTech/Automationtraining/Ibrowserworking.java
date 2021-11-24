package PeopleNTech.Automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowserworking {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//i) How to open the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murat\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		String windowhandle = driver.getWindowHandle(); // get the "windowhadle value", put it in "windowhandle"
		System.out.println(windowhandle); // print the prevously gotten value here
		String urlofbrowser= driver.getCurrentUrl();
		System.out.println(urlofbrowser);
		driver.close();
		
		
		
		
	}

}
