package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageObjectFactory {
	
	WebDriver driver;
	public RediffLoginPageObjectFactory(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,  this);
	}
	
	/*By username=By.xpath("//input[@id='login1']");
	By Password = By.name("passwd");
	By go = By.name("proceed");	
	By home = By.linkText("rediff.com");*/
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement Password;
	
	@FindBy(name="proceed")
	WebElement go;
	
	@FindBy(linkText="rediff.com")
	WebElement home;
	
	public WebElement EmailId() {
		return username;
	}
	
	public WebElement Password() {
		return Password;
	}
	
	public WebElement Submit() {
		return go;
	}
	
	public WebElement home() {
		return home;
	}
	
}
