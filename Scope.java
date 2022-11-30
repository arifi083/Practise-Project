package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
    	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
    	
    	//how much link in this page
    	System.out.println(driver.findElements(By.tagName("a")).size());
    	
    	//how much link in this page footer section
    	WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
    	System.out.println(footerDriver.findElements(By.tagName("a")).size());
    	
    	//how much link in footer section one column part
    	WebElement columnDriver = footerDriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
    	System.out.println(columnDriver.findElements(By.tagName("a")).size());
    	
    	int count = columnDriver.findElements(By.tagName("a")).size();
    	
    	for(int i=1;i<count;i++) {
    		String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
    		columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
    	}
    	
    	Set<String>abc = driver.getWindowHandles();
    	Iterator<String>it = abc.iterator();
    	while(it.hasNext()) {
    		driver.switchTo().window(it.next());
    		System.out.println(driver.getTitle());
    	}

	}

}
