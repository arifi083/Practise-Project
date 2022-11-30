package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!ETA!108599293!6504095653!491718594877!e!goibibo!c!&ef_id=CjwKCAiA9bmABhBbEiwASb35V6oEH8H_qAAuHLmQirX9_U-HS2cpgsgTJ1U6QCggc5Av55P1XWX0OhoCQxMQAvD_BwE:G:s&gclid=CjwKCAiA9bmABhBbEiwASb35V6oEH8H_qAAuHLmQirX9_U-HS2cpgsgTJ1U6QCggc5Av55P1XWX0OhoCQxMQAvD_BwE");
        
		

        //max
        driver.manage().window().maximize();
        WebElement from = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/input"));
        from.click();
        from.sendKeys("Dubai");
        Thread.sleep(2000);
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);
        
        WebElement to= driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']"));
        to.click();
        to.sendKeys("Indore");
        Thread.sleep(2000);
        to.sendKeys(Keys.ARROW_DOWN);
        to.sendKeys(Keys.ENTER);
		
	}

}
