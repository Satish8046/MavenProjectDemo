

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class MagentoTest {

	
	@Test
	public void test()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		Welcome w=new Welcome(driver);
		w.clickon();
		
		Login l=new Login(driver);
		l.enterMail("sucheendra.abc@gmail.com");
		l.enterPass("Welcome123");
		l.clickon();
		
		Logout o=new Logout(driver);
		o.clickon();
				
		driver.close();

	}
}
