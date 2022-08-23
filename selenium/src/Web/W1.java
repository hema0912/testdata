package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class W1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./osasn/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Users/LENOVO/Desktop/t1.html");
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
	boolean	b=ele.isDisplayed();
		if(b)
		{
			System.out.println("Ele is diplayed");
		}
		else
		{
			System.out.println("Ele isnt diplayed");
		}	
		
	}

}
