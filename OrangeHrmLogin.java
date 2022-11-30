package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 //Max the window
       // driver.manage().window().maximize();
       //driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
       // driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.name("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click(); 
        
      //Verify the URL
        //getCurrentURL()
        String act_url=driver.getCurrentUrl();
        System.out.println(act_url);
        //verify
        String desired_url="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        if (act_url.equals(desired_url))
        {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }

        //Verify Title
        //getTitle()
        String act_title=driver.getTitle();
        System.out.println(act_title);
        String desired_title="OrangeHRM";
        //verify
        if(act_title.equals(desired_title))
        {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
        String ps=driver.getPageSource();
        System.out.println(ps);
        //close the browser
        driver.close();



	}

}
