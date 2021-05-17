package google;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google_Test {

	@Test
	public void t() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dev\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> el = driver.findElements(By.className("sbtc"));
		for (WebElement list : el) {
			Thread.sleep(3000);
			if (list.getText().equalsIgnoreCase("selenium webdriver")) {

				list.click();
				System.out.println("click successful on selenium webdriver");
				break;
			}
			// System.out.println(list.getText());

		}

	}

}
