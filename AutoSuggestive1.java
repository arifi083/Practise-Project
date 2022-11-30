package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		WebElement from = driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div.fsw.widgetOpen > div.fsw_inner.returnPersuasion > div.fsw_inputBox.searchCity.inactiveWidget.activeWidget > div:nth-child(2) > div > div > div > input"));
		from.click();

	}

}
