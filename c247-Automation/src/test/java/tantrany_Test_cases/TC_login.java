package tantrany_Test_cases;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import tantrany_methods.*;
public class TC_login {
	
	
	public static void main(String[] args) throws InterruptedException, IOException, ParseException 
	{
		Admin_login admin = new Admin_login();
		admin.runMultipleTestScenarios();
		
	}
}
