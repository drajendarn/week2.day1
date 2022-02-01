package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
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
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Divya");				
		driver.findElement(By.id("lastNameField")).sendKeys("Rajendran");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Page Title is :"+ driver.getTitle());
		WebElement fName=driver.findElement(By.id("viewContact_firstName_sp"));
		String name=fName.getText();
		System.out.println("Fname is " +name);
		driver.close();
	}
	

}
