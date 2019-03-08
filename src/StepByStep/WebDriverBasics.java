package StepByStep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// priorities for elements pick are id, name, link text only for link, xpath, css selectors for id #(id name)
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Md Ahmed\\Documents\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Md Ahmed\\Documents\\GreckoDriver\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
	      WebDriver driver = new FirefoxDriver();
	      driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			// dynamic wait
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.ebay.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay")) {
		System.out.println("Correct");
		}else {
			System.out.println("Incorrect");
			
		}
		driver.quit();;
		
	}


	}


