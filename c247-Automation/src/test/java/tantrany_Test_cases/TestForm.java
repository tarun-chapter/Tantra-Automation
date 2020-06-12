package tantrany_Test_cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestForm {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","/home/divyanshi/Documents/Browser driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tantra.c247.website/admin/password/reset");
		
		
		WebElement form = driver.findElement(By.tagName("form"));
		String FormName = form.getText();
		System.out.println(FormName);
		Dimension Formsize = form.getSize();
	//	System.out.println(Formsize);
		
		WebElement Element = driver.findElement(By.tagName("input"));
		String Input = Element.getText();
		System.out.println(Input);
		Dimension inputsize = Element.getSize();
	//	System.out.println(inputsize);
		
		driver.close();
	}

}
