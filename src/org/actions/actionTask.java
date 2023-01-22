package org.actions;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actionTask {

//	Task no 1(http://demo.guru99.com/test/drag_drop.html)
//	NOTE: Drag and drop  bank  in Account ,5000 in amount  at debited side 
//  Drag and drop  sales in Account ,5000 in amount  at credited side  

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\LearnTask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = s.nextInt();
		if(n%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is Odd");
		}
	}
}
