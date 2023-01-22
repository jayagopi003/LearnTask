package org.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinLocation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\LearnTask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement inpuUser = driver.findElement(By.id("username"));
		inpuUser.sendKeys("Greens8767");
		WebElement inpuPass = driver.findElement(By.id("password"));
		inpuPass.sendKeys("L4R739");
		WebElement buttLog = driver.findElement(By.id("login"));
		buttLog.click();
		WebElement dnsLoc = driver.findElement(By.id("location"));
		Select select = new Select(dnsLoc);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement option = options.get(i);
			String attribute = option.getAttribute("value");
			System.out.println(attribute);
			
			
		}
		
		
	}
	
	

}
