package Testngpack;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Firsttestngfile<Workbook> {
	//public String baseUrl = "http://eresidue.com/";
    String driverPath = "/usr/bin/chromedriver";
    public WebDriver driver ; 
    
    @Test
    public void verifyHomepageTitle() {https://cdn.guru99.com/images/code-0008.png)
         
    System.out.println("launching chrome browser"); 
    System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
    driver = new ChromeDriver();
    driver.get("http://192.168.1.111:8090/");}
    
	@Test(priority=1)
	public void c_test(Object workbook) throws InterruptedException {
		//driver.get("http://192.168.1.111:8090/");	
		WebElement usernameInput = driver.findElement(By.id("username"));
		usernameInput.sendKeys("tester13");
		WebElement passwordInput = driver.findElement(By.id("password"));
		passwordInput.sendKeys("123456");
		WebElement loginButton = driver.findElement(By.id("loginsubmit"));
		loginButton.click();
		Thread.sleep(200);
		String actualMSG = driver.findElement(By.className("notify-msg")).getText();
		System.out.println(actualMSG);
		if(actualMSG.equalsIgnoreCase("Invalid credentials!"))
		{
			
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("Fail");
			

		}

		/*Set<Cookie> all = driver.manage().getCookies();
		for(Cookie cok: all) {
			
		}*/
		
		driver.close();


	}
	@Test(priority=0)
	public void A_test() {
		Assert.assertTrue(true);
	}
		@Ignore
		@Test(priority=2)
		public void b_test() {
		throw new SkipException("skipping b_Test..");
		}
	
}
