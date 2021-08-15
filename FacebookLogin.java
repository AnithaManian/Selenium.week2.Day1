package Assignment_Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		//FaceBook:
			// Step 1: Download and set the path 
			// Step 2: Launch the chromebrowser
			// Step 3: Load the URL https://en-gb.facebook.com/
			// Step 4: Maximise the window
			// Step 5: Add implicit wait
			// Step 6: Click on Create New Account button
			// Step 7: Enter the first name
			// Step 8: Enter the last name
			// Step 9: Enter the mobile number
			// Step 10: Enterthe password
			// Step 11: Handle all the three drop downs
			// Step 12: Select the radio button "Female" 
			           // ( A normal click will do for this step) 
			            
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.partialLinkText("Create New Account")).click();
			driver.findElement(By.name("firstname")).sendKeys("Anitha");
			driver.findElement(By.name("lastname")).sendKeys("Rupesh");
			driver.findElement(By.name("reg_email__")).sendKeys("9581154411");
			driver.findElement(By.id("password_step_input")).sendKeys("Admire@143");
			WebElement fillDate = driver.findElement(By.id("day"));
			Select drop1 = new Select(fillDate);
			drop1.selectByValue("31");

			WebElement fillMonth = driver.findElement(By.id("month"));
			Select drop2 = new Select(fillMonth);
			drop2.selectByIndex(8);
			
			WebElement fillYear = driver.findElement(By.id("year"));
			Select drop3 = new Select(fillYear);
			drop3.selectByVisibleText("1984");
			
			WebElement fillSex = driver.findElement(By.xpath("//input[@value='1']"));
			fillSex.click();
			
			driver.findElement(By.name("websubmit")).click();
//			 WebElement radio = driver.findElement(By.xpath("//input[@id='i-green']"));
//		        radio.click();
		 
			//driver.findElement(By.id("u_2_4_B/")).click();
	}
}
