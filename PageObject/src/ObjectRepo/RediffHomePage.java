package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	WebDriver driver;

	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
	}

	By Search = By.id("srchword");
	By Submit = By.xpath("//form[@name='srchform']/input");
	

	public WebElement Search() {
		return driver.findElement(Search);
	}
	
	public WebElement Submit() {
		return driver.findElement(Submit);
	}

}
