package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("volante");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Krishna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bharathi");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Krishn");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Bhar");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("350");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("B");

		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Automation Testing");
		driver.findElement(By.name("annualRevenue")).sendKeys("10000.00");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("234567");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi Welcome To testleaf");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Testleaf Training");
		WebElement cntryCd = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		cntryCd.clear();
		cntryCd.sendKeys("30");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600091");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bhar@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("KB");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.leaftaps.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("KB");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("RVI Towers, 6th Floor");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Bharathi");
		driver.findElement(By.id("createLeadForm_generalAddress2"))
				.sendKeys("#149, Velachery-Tambaram Main Road,Pallikaranai");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600100");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/09/96");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("23");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TN");
		// System.out.println(driver.findElement(By.id("createLeadForm_firstName")).getText());
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("First name is " + driver.findElement(By.id("viewLead_firstName_sp")).getText());
		System.out.println(
				"Title of resulting page is :" + driver.findElement(By.id("sectionHeaderTitle_leads")).getText());
		System.out.println("Title of the browser is: " + driver.getTitle());

	}

}
