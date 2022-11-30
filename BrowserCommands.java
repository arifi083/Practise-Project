package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 //navigate to the URL
		driver.get("https://demoqa.com/browser-windows");
		
		 //max the window
        driver.manage().window().maximize();
        
      //URL of the page
        String urlofthepage = driver.getCurrentUrl();
        System.out.println("The URL of the page is "+urlofthepage);
        
        //verify the current url
        if(urlofthepage.equals("https://demoqa.com/browser-windows")) {
        	 System.out.println("The URL is verified");
        }
        else {
        	 System.out.println("The URL is not verified");
        }
        
        
        //title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is "+title);
        
        //Verify title
        if(title.equals("ToolsQA")) {
        	System.out.println("The title is verified");
        }
        else {
        	 System.out.println("The title is not verified");
        }
        
        //length of the title
        int titlelength = driver.getTitle().length();
        System.out.println("The length of the title is "+titlelength);
        
        //pagesource
        String ps= driver.getPageSource();
        System.out.println("The page source is "+ps);
        
        //length of page source
        int pslength = driver.getPageSource().length();
        System.out.println("The length of the page source is "+pslength);
        
        
        //click
        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        
        //quit
        Thread.sleep(5000);
        driver.quit();
		
		

	}

}
