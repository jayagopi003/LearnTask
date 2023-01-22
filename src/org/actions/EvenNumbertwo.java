package org.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EvenNumbertwo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\LearnTask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement pathClick = driver
				.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		pathClick.click();
		Thread.sleep(4000);
		WebElement dnsSelect = driver.findElement(By.id("year"));
		Select select = new Select(dnsSelect);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement getOption = options.get(i);
			String attribute = getOption.getAttribute("value");
			System.out.println(attribute);
			
			
			
			
		}
	}
		
		

	}


