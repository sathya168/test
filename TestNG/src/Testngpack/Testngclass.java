package Testngpack;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class Testngclass {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "/usr/bin/chromedriver";
    public WebDriver driver ; 
     
  @Test
  public void verifyHomepageTitle() {https://cdn.guru99.com/images/code-0008.png
       
      System.out.println("launching chrome browser"); 
  	  System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
  	  driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      
      driver.close();
  }
}