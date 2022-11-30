package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the page
		driver.navigate().to("https://wordpress.com/");
		
		//max
        driver.manage().window().maximize();
        
      //click on get start
       driver.findElement(By.xpath("//a[normalize-space()='Get Started']")).click();
       
       //back
       Thread.sleep(2000);
       driver.navigate().back();
       
     //forward
       Thread.sleep(2000);
       driver.navigate().forward();
       
     //refresh
       Thread.sleep(5000);
       driver.navigate().refresh();
       
     //close the browser
       driver.close();
       
       
		

	}

}
