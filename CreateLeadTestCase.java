package Assignment_Week2.Day1;

import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadTestCase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		// driver.close();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MyOwnCompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manian");
		WebElement leadCountryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		leadCountryCode.clear();
		leadCountryCode.sendKeys("91");
		WebElement text = driver.findElement(By.id("createLeadForm_firstName"));
		System.out.println("Print First Name:" +text.getAttribute("value"));

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1 = new Select(source);
		drop1.selectByVisibleText("Conference");

		WebElement mrktCampID = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2 = new Select(mrktCampID);
		drop2.selectByValue("CATRQ_CARNDRIVER");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nithu");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Ma");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs.");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/01/1990");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SoftwareTester");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
		
		WebElement fillCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drop4 = new Select(fillCurrency);
		drop4.selectByValue("INR");
		
		WebElement indusEnumID = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drop3 = new Select(indusEnumID);
		drop3.selectByIndex(8);//Insurance
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		
		WebElement fillOwnerShip = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop5 = new Select(fillOwnerShip);
		drop5.selectByVisibleText("S-Corporation");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("124");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Just a sample");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Nothing much");
		WebElement findElement1 = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		findElement1.clear();
		findElement1.sendKeys("91");
				driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("641001");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9581154411");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Anitha Manian");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Anitha");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("85 Raja Street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("5 Corner");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Coimbatore");
		WebElement fillState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop6 = new Select(fillState);
		drop6.selectByValue("NY");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("10001");
		WebElement fillCountry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop7 = new Select(fillCountry);
		drop7.selectByVisibleText("United States");
		//driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("Coimbatore");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("New York");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("05");
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
	}

}
