package tantrany_methods;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tantrany_elements.*;
import tantrany_methods.*;

public class Admin_login {
	
	private ArrayList<UserDetail> users;
	
	public Admin_login () throws InterruptedException, IOException, ParseException 
	{
		dataProvider dataContainer= new dataProvider();
		users = dataContainer.getUserData();		
	}
	
	public void	runMultipleTestScenarios() {
		for (UserDetail user : users)
			runTestScenario(user);	
	}
	
	public void runSingleTestScenario() {
		runTestScenario((UserDetail) users.get(0));
	}
	
	private void runTestScenario(UserDetail user) {
		System.setProperty("webdriver.chrome.driver","/home/divyanshi/Documents/Browser driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tantra.c247.website/admin/login");
		
		
		Admin_page login = new Admin_page();
		
		
		
		
		//UserDetail user = (UserDetail) dataContainer.getUserData().get(0);
		
		login.Email(driver).sendKeys(user.getUsername());
		login.Password(driver).sendKeys(user.getPassword());
		login.login_Button(driver).click();
		
		String tittle = driver.getTitle();
		System.out.println(tittle);
		
		driver.close();
	}
	

}
