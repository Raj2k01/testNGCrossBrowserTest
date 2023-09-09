package testngScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGProject {
	RemoteWebDriver driver;
	@Parameters({"emailId","password","browser"})
	@Test
	public void login(String email,String pass,String browser) {
		switch (browser) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
			break;

		default:
			System.err.println("Browser Error");
			break;
		}
		System.out.println(email+" "+pass);
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		
		

	}

}
