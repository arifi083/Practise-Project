package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
    	driver.get("http://demo.guru99.com/test/delete_customer.php");
    	
    	driver.findElement(By.name("cusid")).sendKeys("53920");
    	driver.findElement(By.name("submit")).click();
    	Alert alert = driver.switchTo().alert();
    	// Capturing alert message.
    	String alertMessage = driver.switchTo().alert().getText();
    	System.out.println(alertMessage);
    	Thread.sleep(2000);
    	alert.dismiss();

	}

}
