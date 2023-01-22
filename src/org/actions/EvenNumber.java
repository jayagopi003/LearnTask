package org.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EvenNumber {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\LearnTask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement pathClick = driver
				.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		pathClick.click();
		Thread.sleep(4000);
		WebElement selMon = driver.findElement(By.id("month"));
		Select select = new Select(selMon);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement option = options.get(i);
			String attribute = option.getAttribute("value");
			System.out.println(attribute);
			
			

		}

	}

}
