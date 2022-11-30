package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 //open the URL
        driver.get("https://demoqa.com/browser-windows");

        //max
        driver.manage().window().maximize();
        
        //print parent window handle
        String parentwindowhandle = driver.getWindowHandle();
        System.out.println("the parent window handle is "+parentwindowhandle);
        
        for(int i=1;i<=3;i++) {
        	driver.findElement(By.xpath("//button[@id='windowButton']")).click();
        }
        
      //print the window handles
        Set<String>windowhandles = driver.getWindowHandles();
        String lastwindowhandle= "";
        
        for(String handle:windowhandles) {
        	  System.out.println("The window handles are "+handle);
        	  
        	  //switching
              System.out.println("Switching windows "+handle);
              Thread.sleep(2000);
              
              driver.switchTo().window(handle);
              //Navigating to the google
              Thread.sleep(3000);
              driver.get("http://www.google.com");
              driver.manage().window().maximize();
              
        }
        
        Thread.sleep(2000);
        driver.switchTo().window(parentwindowhandle);
        driver.close();
        
        //switch to the other windows
        Thread.sleep(2000);
        driver.switchTo().window(lastwindowhandle);
        Thread.sleep(2000);
        driver.quit();
        

	}

}
