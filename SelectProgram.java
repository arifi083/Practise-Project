package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

	        //max
	        driver.manage().window().maximize();

	        //Select Class
	        Select selectelement=new Select(driver.findElement(By.xpath("//div//div//div[1]//div[2]//select[1]")));
	        //Or
//	        WebElement dropdown=driver.findElement(By.xpath("//div//div//div[1]//div[2]//select[1]"));
//	        Select selectelement=new Select(dropdown);

	        //Find the options present in the dropdown menu
	       List<WebElement> options =selectelement.getOptions();
	        System.out.println(options.size());

	        //print
	        for (WebElement e:options)
	        {
	            System.out.println("The values are "+e.getText());
	        }

	        //Select the options
	        //selectbyvalue
//	        selectelement.selectByValue("Friday");
	        //Selectbyindex
//	        selectelement.selectByIndex(3);
	       //SelectByVisibleText()
	        selectelement.selectByVisibleText("Monday");

	        //ismultiple()
	        Boolean bool1=selectelement.isMultiple();

	        System.out.println(bool1);

	        selectelement.deselectByVisibleText("Monday");

	}

}
