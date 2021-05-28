package browser.org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\karthi\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.close();
	WebElement txtp = driver.findElement(By.id("dest"));
		txtp.sendKeys("chennai");
		WebElement txtd = driver.findElement(By.id("onward_cal"));
		txtd.sendKeys("May 02");
		
		
}
}
