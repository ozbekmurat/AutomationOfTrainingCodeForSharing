package MyProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PapaJohn {
	
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murat\\git\\repository2\\MyProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.papajohns.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement startorder=driver.findElement(By.xpath("//*[text()= 'Start Your Order']"));
		startorder.click();
	
		Thread.sleep(1000);
		
		WebElement country1  =driver.findElement(By.name("country"));
		Select ob1 = new Select(country1);
		ob1.selectByVisibleText("USA");
		
		Thread.sleep(1000);
		
		WebElement adress1  =driver.findElement(By.name("locationType"));
		Select ob3 = new Select(adress1);
		ob3.selectByVisibleText("Residence");
		
		Thread.sleep(1000);
		
		WebElement street=driver.findElement(By.name("input-autocomplete"));
	    street.sendKeys("9915 Longford Ct. Vienna, VA");
	    
	    Thread.sleep(1000);
	    
	    WebElement apt=driver.findElement(By.name("aptstefloor"));
	    apt.sendKeys("None");
	    
		Thread.sleep(1000);
		
	    WebElement zip=driver.findElement(By.name("zipcode"));
	    zip.sendKeys("22181");
	   
		Thread.sleep(1000);
		
	    WebElement submit=driver.findElement(By.xpath("//input[@value='Submit']"));
		Thread.sleep(1000);
		
		submit.click();
		
		Thread.sleep(1000);
	
		WebElement own=driver.findElement(By.xpath("//*[text()= ' ORIGINAL CRUST ']"));
		own.click();
		
		Thread.sleep(1000);
		
		WebElement bs=driver.findElement(By.xpath("//*[text()= 'Base']"));
		bs.click();
		
		Thread.sleep(1000);
		
		WebElement lg=driver.findElement(By.xpath("//*[text()= 'Large']"));
		lg.click();
		
		Thread.sleep(1000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		
		Thread.sleep(1000);
		
		WebElement oc=driver.findElement(By.xpath("//*[text()= 'Original Crust']"));
		oc.click();
		
		Thread.sleep(1000);
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,250)");
		
		Thread.sleep(1000);
		
		WebElement ga=driver.findElement(By.xpath("//*[text()= ' Garlic Parmesan Cheese  ']"));
		ga.click();
		
		Thread.sleep(3000);
		
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,250)");
		
		Thread.sleep(1000);
		
		WebElement nn=driver.findElement(By.xpath("//*[text()= ' Ranch ']"));
		nn.click();
		
		//System.exit(0);
				
		Thread.sleep(3000);
		
		WebElement ch=driver.findElement(By.xpath("//*[text()= 'Cheese']"));
		ch.click();

		Thread.sleep(1000);
		
		JavascriptExecutor jse5 = (JavascriptExecutor)driver;
		jse5.executeScript("window.scrollBy(0,250)");
		
		Thread.sleep(1000);
		
		WebElement bo=driver.findElement(By.xpath("//*[text()= ' Extra Cheese ']"));
		bo.click();
		
		JavascriptExecutor jse4 = (JavascriptExecutor)driver;
		jse4.executeScript("window.scrollBy(0,250)");
		
		Thread.sleep(1000);
		
		WebElement add =driver.findElement(By.id("addProductToCart"));
		add.click();
		
		Thread.sleep(1000);
		
		WebElement own5=driver.findElement(By.xpath("//*[text()= 'View Cart']"));
		own5.click();
		
		Thread.sleep(1000);
		
		WebElement own6=driver.findElement(By.xpath("//*[text()= 'Check Out']"));
		own6.click();
		
		Thread.sleep(1000);
		
		WebElement own3=driver.findElement(By.id("contact-firstname"));
		own3.sendKeys("Ismail Murat");
		
		Thread.sleep(1000);
		
		WebElement ln=driver.findElement(By.id("contact-lastname"));
		ln.sendKeys("Ozbek");
		
		Thread.sleep(1000);
		
		WebElement em=driver.findElement(By.id("contact-email"));
		em.sendKeys("ozbekmurat@endustriteknik.com");
		
		Thread.sleep(1000);
		
		WebElement ph=driver.findElement(By.id("phone-number"));
		ph.sendKeys("5714517500");
		
		Thread.sleep(1000);
		
		WebElement eo=driver.findElement(By.id("create-account-emailoffers"));
		eo.click();
		
		Thread.sleep(1000);
		
		WebElement cc=driver.findElement(By.id("credit-card-number"));
		cc.sendKeys("122333445742");
		
		Thread.sleep(1000);
		
		WebElement ccn=driver.findElement(By.id("credit-card-name"));
		ccn.sendKeys("Ismail Murat Ozbek");
		
		Thread.sleep(1000);
		
		WebElement exm=driver.findElement(By.id("credit-card-expiration-month"));
		exm.sendKeys("10");
		
		Thread.sleep(1000);
		
		WebElement exy=driver.findElement(By.id("credit-card-expiration-year"));
		exy.sendKeys("2023");
		
		Thread.sleep(1000);
		
		WebElement zc=driver.findElement(By.id("billing-zipcode"));
		zc.sendKeys("22191");
		
		Thread.sleep(1000);
		
		WebElement se=driver.findElement(By.id("credit-card-cvv"));
		se.sendKeys("121");
		
		Thread.sleep(1000);
		
		WebElement inp=driver.findElement(By.id("input"));
		inp.click();
		Thread.sleep(1000);
		
		WebElement vo=driver.findElement(By.id("validate-order"));
		vo.click();
		
		
		
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,250)");
		
		//WebElement order=driver.findElement(By.xpath("//button[@class='button button--small d-none d-md-inline-block']"));
		
		//WebElement order=driver.findElement(By.xpath("//a[contains@aria-label, 'ADD TO ORDER Sausage Pizza']"));
		//order.click();
		
		//WebElement order=driver.findElement(By.xpath("//*[text()= 'Order Now'][5]"));
		//WebElement order =driver.findElement(By.xpath("//div[contains(@aria-label, 'ADD TO ORDER Garden Fresh Pizza']"));
		
		//WebElement add=driver.findElement(By.xpath("html/body/div/div/div/rwd-root/rwd-menu/div/main/divdiv/rwd-tabset/ngb-tabset/div/div/section/div/div/div/div/ul/li/rwd-menu-card/div/div/a/div/div"));
	    //WebElement submit=driver.findElement(By.className("button button-large"))
		
		/*WebElement country1 =driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div/div/form/div/span[1]/select"));
		Select ob4 = new Select(country1);
		ob4.selectByValue("USA");
		
		WebElement language=driver.findElement(By.className("popup-trigger"));
		Select ob2 = new Select(language);
	    ob2.selectByValue("English");
		
		WebElement country =driver.findElement(By.id("locations-country"));
		Select ob = new Select(country);
		ob.selectByValue("USA");
		
	    WebElement adress=driver.findElement(By.className("address-type-change-util valid"));
		Select ob3 = new Select(adress);
	    ob3.selectByValue("Residence");*/
		
		 //WebElement street1 =driver.findElement(By.id("autocomplete__option--0"));
		//Select ob4 = new Select(street1);
		
		//WebElement own4=driver.findElement(By.xpath("//*[text()= 'Extra']"));
		//own4.click();
	
		
		//WebElement sm1=driver.findElement(By.xpath("//*[text()= 'Light Cheese']"));
		//sm1.click();
		
		//WebElement md1=driver.findElement(By.xpath("//*[text()= 'No Cheese']"));
		//md1.click();
		
		//WebElement sm=driver.findElement(By.xpath("//*[text()= 'Small']"));
		//sm.click();
				
		//WebElement md=driver.findElement(By.xpath("//*[text()= 'Medium']"));
		//md.click();
		//System.exit(0);
		
		//WebElement own14 =driver.findElement(By.xpath("//input[contains(@aria-label, '3-Cheese Blend-topping']"));	
		
		//WebElement submit=driver.findElement(By.className("button button-large"));
	
		//WebElement order=driver.findElement(By.xpath("//a[contains@aria-label, 'ADD TO ORDER Sausage Pizza']"));
		//order.click();
		
	}


	}


