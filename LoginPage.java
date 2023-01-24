package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();// download driver automatically
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		WebElement eleuser = driver.findElement(By.id("username"));
		eleuser.sendKeys("ranga");
		WebElement eleuser2 = driver.findElement(By.id("password"));
		eleuser2.sendKeys("rajan");
		System.out.println("data is-"+eleuser.getText().toString());
		System.out.println(eleuser2.getText().toString());
		

	}

}
