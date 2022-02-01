package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestCase3 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
       // driver.close();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		//Enter values in Create Lead section 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
		//source dropdown
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd=new Select(source);
		dd.selectByVisibleText("Employee");
				
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Divyalocal");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5000");//AnnualRevenue
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5000");
		//Industry dropdown
		WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd1=new Select(industry);
		dd1.selectByValue("IND_SOFTWARE");
		//Ownership dropdown
				WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select dd2=new Select(ownership);
				dd2.selectByIndex(1);
				
				driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("ABC");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("created Divya as lead");
				driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
				//Marrigin Cambigin
				WebElement marigin=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				Select dd3=new Select(marigin);
				dd3.selectByIndex(1);
				driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("LastNamelocal");
				driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/12/1991");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("DeptName");
				driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("3000");
				driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("trickerSymbol");
				//Preferred Currency
				WebElement currency=driver.findElement(By.id("createLeadForm_currencyUomId"));
				Select dd4=new Select(currency);
				dd4.selectByIndex(1);
				
				//contact Information
				driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("01");
				driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("606907");
				driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("12345");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9012345666");
				driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Lead");
				driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
				//Primary Address
				driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Harsha");
				driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Near 2nd cross street");
				driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Washington");
				driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("20011");
				driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("122");
				driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("AttnName");
				driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address Line 2");
				//Country dropdown
				WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				Select dd5=new Select(country);
				dd5.selectByVisibleText("United States");
				//state dropdown
				WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select dd6=new Select(state);
				dd6.selectByIndex(2);
				// clcik on Create Leadbutton
				driver.findElement(By.xpath("//input[contains(@value,'Create Lead')]")).click();
		//driver.close();
				System.out.println("Testcase 3 Ran successfully ");
		
	}
	

}
