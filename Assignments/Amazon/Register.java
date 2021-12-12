package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	public WebDriver driver;
	@FindBy(name ="customerName") WebElement Name;
	@FindBy(name = "email") WebElement EMail;
	@FindBy(name ="password") WebElement Pass;
	@FindBy(name = "passwordCheck") WebElement PassCheck;
	@FindBy(id = "continue") WebElement Continue;
	
	public Register(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
	public void NameFieldSendKeys() {
		Name.sendKeys("ozbekmurat");
}
	
	public void MailFieldSendKeys() {
		EMail.sendKeys("muratozbek76@hotmail.com");
}
	
	public void PassFieldSendKeys() {
		Pass.sendKeys("123456");
}
	
	public void PassCheckFieldSendKeys() {
		PassCheck.sendKeys("123456");
}	
	public void ContinueButtonClick() {
		Continue.click();
}
	
}