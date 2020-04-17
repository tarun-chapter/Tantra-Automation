package tantrany_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Admin_page {
	
	public static WebElement Email(WebDriver driver) 
	{
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		return email;
	} 
	
	public static WebElement Password (WebDriver driver)
	{
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		return password;
	}

}
