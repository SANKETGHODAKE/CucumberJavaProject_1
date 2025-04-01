package PageClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage 
{
	WebDriver driver;

	public void OpenUrl()
	{
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.get("https://www.facebook.com");
	}

	public void enterUserName()
	{
		   driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	}

	public void enterPassword()
	{
		   driver.findElement(By.id("pass")).sendKeys("abc123");
	}

	public void clickLoginButton()
	{
		  driver.findElement(By.xpath("//button[text()='Log in']"));
	}

	public void verifyLogin()
	{
		   System.out.println("Verified login");
	}

}
