package browser.org.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthi\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/automation-practice-form/");
	   Thread.sleep(3000);
		WebElement state = driver.findElement(By.xpath("//div[text()='Select State']"));
		Select sc = new Select(state);
		List<WebElement> options = sc.getOptions();
		for (WebElement x : options) {
			String s = x.getText();
			if (s=="Haryana") {
				x.click();
				
			}
		}
		
	   }

}
