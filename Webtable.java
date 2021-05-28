package browser.org.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthi\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		WebElement Table = driver.findElement(By.id("customers"));
		List<WebElement> row = Table.findElements(By.tagName("tr"));
		for (int i = 2; i < 3; i++) {
			WebElement x = row.get(i);
			
			/*List<WebElement> cell = x.findElements(By.tagName("td"));
			for (int k = 0; k < cell.size(); k++) {
				WebElement x1 = cell.get(k);
				String text = x1.getText();
				if (text.equals("Mexico")) {
					System.out.println(text);
				}
*/
			}

		}

	}
//}
