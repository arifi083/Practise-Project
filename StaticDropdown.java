package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/newtours/register.php");
//		Select country = new Select(driver.findElement(By.name("country")));
		//country.selectByVisibleText("ANTARCTICA");
		//country.selectByVisibleText("ALGERIA");
//		country.selectByValue("ARGENTINA");
//		country.selectByIndex(10);
		
		
		//spicejet website static dropdown
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']")).click();
		int i=1;
		while(i<5) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}

		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		
		
	}

}
