package week3.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();// download driver automatically
		ChromeDriver driver = new ChromeDriver();
//			FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.leafground.com/select.xhtml");

		driver.manage().window().maximize();

		 
		WebElement eleTool = driver.findElement(By.className("ui-selectonemenu"));

		// Create an object for Select class
		Select dd = new Select(eleTool);

		dd.selectByVisibleText("Puppeteer");

		List<WebElement> options = dd.getOptions();

//			for(int i=0; i < options.size(); i++) {
//				WebElement option = options.get(i);
//				String text = option.getText();
//				System.out.println(text);
//			}
		System.out.println("Relavent options are  as follows ");
		for (WebElement eachOption : options) {

			System.out.println(eachOption.getText());

		}

		WebElement firstSelectedOption = dd.getFirstSelectedOption();
		System.out.println("Selected option is -" + firstSelectedOption.getText());
	}

}
