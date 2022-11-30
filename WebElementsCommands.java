package selenium;

import java.awt.Dimension;
import java.awt.Point;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//2.Open the URl
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //max
        driver.manage().window().maximize();

        //Enter username and password
        driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("Admin");
        //driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("//input[@placeholder='Password']")).sendKeys("admin123");
       
        
        //clear the username and password
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).clear();
        Thread.sleep(4000);
        driver.findElement(By.name("//input[@placeholder='Password']")).clear();
        
        //submit
        driver.findElement(By.xpath("//button[@type='submit']")).click(); 
        
        //gettext()
        String getText = driver.findElement(By.linkText("Forgot your password?")).getText();
        System.out.println("The text is "+getText);
        
        //getLocation()
        WebElement element =  driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]"));
        Point point=element.getLocation();
        System.out.println("X cordinates" +point.x);
        System.out.println("Y cordinates "+point.y);
        
        //getsize
        WebElement element1 =  driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]"));
        Dimension dim=element1.getSize();
        System.out.println("Height is "+dim.height);
        System.out.println("Width is "+dim.width);
        
        String getTagName =  driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).getTagName();
        System.out.println(getTagName);
        
        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        
        //check if the login button is displayed on the page
        Boolean bool1= driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
        System.out.println(bool1);
        
        //Check if the login button is enabled
        Boolean bool2=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();//T
        System.out.println(bool2);

        //Check if the login button is selected or not
        Boolean bool3=driver.findElement(By.xpath("//button[@type='submit']")).isSelected();//F
        System.out.println(bool3);
        
        
        
        

	}

}
