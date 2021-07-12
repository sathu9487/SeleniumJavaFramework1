package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	public RediffLoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By username=By.xpath("//input[@id='login1']");
	By Password = By.name("passwd");
	By go = By.name("proceed");	
	By home = By.linkText("rediff.com");
	
	public WebElement EmailId() {
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(Password);
	}
	
	public WebElement Submit() {
		return driver.findElement(go);
	}
	
	public WebElement home() {
		return driver.findElement(home);
	}
	
}
