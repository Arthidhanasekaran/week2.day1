package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();

		// Open the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		// Enter UserName & Password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();

		// Click Find Contacts
		driver.findElement(By.linkText("Find Contacts")).click();

		// Click Email Tab
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();

		// Type e-mail
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");

		// Click Find Contacts
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();

		Thread.sleep(2000);

		// Close the browser
		driver.close();

	}

}
