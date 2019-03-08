package StepByStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Md Ahmed\\Documents\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Md Ahmed\\Documents\\GreckoDriver\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
//	    driver.get("http://www.bookfinder4u.com/member/account/register.aspx");// enter url
//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mahmed4@dmacc.edu");// to create our own x path for elements
//        driver.findElement(By.xpath("//*[@id=\"re_email\"]")).sendKeys("mahmed4@dmacc.edu");
//        driver.findElement(By.xpath("//*[@id=\"password1\"]")).sendKeys("12345");
//        driver.findElement(By.xpath("//*[@id=\"re_password\"]")).sendKeys("12345"); 
//        driver.findElement(By.xpath("//*[@id=\"nickname\"]")).sendKeys("riyadahmed");
//        driver.findElement(By.xpath("//*[@id=\"image_verification\"]")).sendKeys("37022"); 
//        driver.findElement(By.xpath("//*[@id=\"Button1\"]")).click();
  
        // if you want to click any like get link name "sign up" go for find element for linkText 
//		driver.findElement(By.name("username")).sendKeys("riyadahmed");
//		driver.findElement(By.name("password")).sendKeys("12345");
////		driver.findElement(By.name("Submit")).click();
//        driver.findElement(By.id("email")).click();
//        driver.findElement(By.linkText("sign up")).click(); // only for link text
        driver.get("https://www.ebay.com/rpp/sale-events/?vname=Shop%20Fashion%20Events");
        driver.findElement(By.linkText("Featured")).click(); // only for link text
        driver.quit();
	}
}
	    

	

