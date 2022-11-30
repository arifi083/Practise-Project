package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");;
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		String alertMessage = driver.switchTo().alert().getText();
    	System.out.println(alertMessage);
    	//driver.switchTo().alert().sendKeys("fesfe");
    	driver.switchTo().alert().accept();
    	//driver.switchTo().alert().dismiss();

	}

}
