package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S588185352%3A1666153188080942&continue=https%3A%2F%2Fwww.google.com%3Fhl%3Den-US&ec=GAlA8wE&hl=en&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/span/div/div/a")).click();
		System.out.println("Before Switching");
		System.out.println(driver.getTitle());
		
		Set<String>ids = driver.getWindowHandles();
		Iterator<String>it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		
		driver.switchTo().window(childid);
		System.out.println("After Switching");
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		System.out.println("Switching back to parent");
		System.out.println(driver.getTitle());

	}

}
