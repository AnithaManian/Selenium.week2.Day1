package Assignment_Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceLogin {

	public static void main(String[] args) {
		//SalesForce:
			// Step 1: Download and set the path 
			// Step 2: Launch the chromebrowser
			// Step 3: Load the URL 
			          // https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
			// Step 4: Maximise the window
			// Step 5: Add implicit wait
			// Step 6: Fill in all the text boxes
			// Step 7: Handle all the dropdowns
			// Step 8: Click the check box
			// Step 9: Close the browser
			//*Note: No need click Start my freeTrial
WebDriverManager.chromedriver().setup();

ChromeDriver driver = new ChromeDriver();
driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

driver.findElement(By.name("UserFirstName")).sendKeys("Anitha");
driver.findElement(By.name("UserLastName")).sendKeys("Manian");
driver.findElement(By.name("UserEmail")).sendKeys("abc@cognizant.com");

WebElement userTitle = driver.findElement(By.name("UserTitle"));
Select drop1 = new Select(userTitle);
drop1.selectByIndex(8);

driver.findElement(By.name("CompanyName")).sendKeys("Cognizant");

WebElement companyEmp = driver.findElement( By.name("CompanyEmployees"));
Select drop2 = new Select(companyEmp);
drop2.selectByValue("250");

driver.findElement(By.name("UserPhone")).sendKeys("9581154411");
WebElement companyCountry = driver.findElement(By.name("CompanyCountry"));
Select drop3  = new Select(companyCountry);
drop3.selectByVisibleText("India");

driver.findElement(By.partialLinkText("Master Subscription Agreement")).click();
driver.close();			        	   
	}

}
