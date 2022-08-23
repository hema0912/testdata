package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class W2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./osasn/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Users/LENOVO/Desktop/t2.html");
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
	boolean	b=ele.isEnabled();
		if(b)
		{
			System.out.println("Textbox is Enabled");
		}
		else
		{
			System.out.println("Textbox is disabled");
		}	
		
	}

}
