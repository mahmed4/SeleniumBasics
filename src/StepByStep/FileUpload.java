package StepByStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Md Ahmed\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\Md Ahmed\\Documents\\GreckoDriver"); // don't click on it you will lose control
	    driver.findElement(By.name("submit")).click();
	
	
	}

}
