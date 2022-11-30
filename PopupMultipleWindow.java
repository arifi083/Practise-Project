package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PopupMultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");			
        driver.manage().window().maximize();	
        
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
        
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);
        Set<String>s1 = driver.getWindowHandles();
        Iterator<String>it = s1.iterator();
        
        while(it.hasNext()) {
        	String childWindow = it.next();
        	System.out.println(childWindow);
        	
        	if(!mainWindow.equalsIgnoreCase(childWindow)) {
        		driver.switchTo().window(childWindow);
        		driver.findElement(By.name("emailid")).sendKeys("arif@gmail.com");
        		driver.findElement(By.name("btnLogin")).click();
        	}
        }

	}

}
