package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

 
		// TODO Auto-generated method stub

		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException 
		{
			// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();// download driver automatically
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();

			WebElement usernameuser = driver.findElement(By.id("username"));
			usernameuser.sendKeys("DemoSalesManager");
			Thread.sleep(2000);
			WebElement passworduser = driver.findElement(By.id("password"));
			passworduser.sendKeys("crmsfa");
			Thread.sleep(2000);

			WebElement loginuser = driver.findElement(By.xpath("//input[@value='Login']"));
			loginuser.click();
			Thread.sleep(2000);
			
			//                CRM/SFA

			WebElement CrmSfaUser = driver.findElement(By.partialLinkText("CRM/SFA"));
			CrmSfaUser.click();
			Thread.sleep(2000);

			WebElement leads = driver.findElement(By.xpath("//a[text()='Leads']"));
			leads.click();
			 
			WebElement createlead = driver.findElement(By.xpath("//a[text()='Create Lead']"));
			createlead.click();
			 
			WebElement companyName = driver.findElement(By.xpath("//*[@id='createLeadForm_companyName']"));
			companyName.sendKeys("CTS");
		 
			WebElement companyfirstName = driver.findElement(By.id("createLeadForm_firstName"));
			companyfirstName.sendKeys("ranga");
			 
			WebElement companylastName = driver.findElement(By.id("createLeadForm_lastName"));
			companylastName.sendKeys("rajan");
			 
			WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
			firstNameLocal.sendKeys("madhu");
			 
			WebElement lastNameLocal = driver.findElement(By.id("createLeadForm_lastNameLocal"));
			lastNameLocal.sendKeys("sudhan");
 
	 
			WebElement departmentName = driver.findElement(By.name("departmentName"));
			departmentName.sendKeys("IT");
			
			WebElement description = driver.findElement(By.xpath("//*[@name='description']"));
			description.sendKeys("iam the best");
			 
			WebElement email = driver.findElement(By.xpath("//*[@id='createLeadForm_primaryEmail']"));
			email.sendKeys("ranga5@gmail.com");
		
			WebElement createLead = driver.findElement(By.xpath("//*[@value='Create Lead']"));
			createLead.click();
			WebElement DuplicateLead = driver.findElement(By.xpath("//a[text()='Duplicate Lead']"));
			DuplicateLead.click();
			String title=driver.getTitle();
			System.out.println("title of the page "+title);
			
			WebElement companyName2 = driver.findElement(By.xpath("//*[@id='createLeadForm_companyName']"));
			companyName2.clear();
			companyName2.sendKeys("hss");
			WebElement companyfirstName2 = driver.findElement(By.id("createLeadForm_firstName"));
			companyfirstName2.clear();
			companyfirstName2.sendKeys("wss");
		
			WebElement descriptionclear = driver.findElement(By.xpath("//*[@name='description']"));
			descriptionclear.clear();
		
			WebElement importantNote = driver.findElement(By.xpath("//*[@name='importantNote']"));
			importantNote.sendKeys("u r the best");
	
			WebElement createLeadbutton = driver.findElement(By.xpath("//a[text()='Create Lead']"));
			createLeadbutton.click();
			
			String title2=driver.getTitle();
			System.out.println("title of the page "+title2);
			

	}

} 
