package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

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

		// Click Create Contact
		driver.findElement(By.linkText("Create Contact")).click();

		// Type First Name
		driver.findElement(By.id("firstNameField")).sendKeys("Arthi");

		// Type Last Name
		driver.findElement(By.id("lastNameField")).sendKeys("Dhanasekaran");

		// Click Create Contact Button
		driver.findElement(By.name("submitButton")).click();

		// Print the first name and browser title
		String title = driver.getTitle();
		System.out.println(title);

		Thread.sleep(2000);

		// Close the browser
		driver.close();

	}

}
