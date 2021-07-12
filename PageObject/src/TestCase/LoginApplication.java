package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepo.RediffHomePage;
import ObjectRepo.RediffLoginPage;
import ObjectRepo.RediffLoginPageObjectFactory;

public class LoginApplication {
	
	@Test
	public void Login() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Satheesh\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Implicit timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage  rd= new RediffLoginPage(driver);
		rd.EmailId().sendKeys("hello");
		rd.Password().sendKeys("Pass");
		
		
		RediffLoginPageObjectFactory rdpof = new RediffLoginPageObjectFactory(driver);
		rdpof.Submit().click();
		rdpof.home().click();
		
		RediffHomePage rh = new RediffHomePage(driver);
		rh.Search().sendKeys("redfiff");
		rh.Submit().click();
				
	}
	

}
