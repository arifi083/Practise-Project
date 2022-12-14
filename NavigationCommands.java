package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open the amazon page
		driver.get("https://www.amazon.com/");
		System.out.println("opening the amazon page through driver.get()");
		
		 //max
        driver.manage().window().maximize();
        
        //navigate to ebay page
        driver.navigate().to("https://www.ebay.com/");
        System.out.println("Navigated to ebay through driver.navigate.to()");
        
       //enter some value
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("T shirt for men");
        
        //refresh the browser
        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Refresh the browser");
        
        //navigate back to amazon
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("The page is navigated back to amazon");
        
        //navigate Forward to ebay
        Thread.sleep(2000);
        driver.navigate().forward();
        System.out.println("the page is navigated forward");
        
      //close the browser
        driver.close();
        
        
        

	}

}
