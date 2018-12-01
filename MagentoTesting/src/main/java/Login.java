
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	WebDriver driver;
	By email=By.id("email");
	By pwd=By.id("pass");
	By log=By.id("send2");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterMail(String em)
	{
		driver.findElement(email).sendKeys(em);
	}
	public void enterPass(String password)
	{
		driver.findElement(pwd).sendKeys(password);
	}
	public void clickon()
	{
		driver.findElement(log).click();
	}

}
