package tantrany_methods;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class dataProvider {
	
	
	public ArrayList getUserData() throws IOException, ParseException
	{
		JSONParser js = new JSONParser();
		FileReader reader = new FileReader(".//tantrany_json_folder/admin_credential.json");
		
		Object obj = js.parse(reader);
		
		JSONObject userloginjson = (JSONObject) obj; 
		JSONArray jsonarrylogin	=(JSONArray) userloginjson.get("userlogins");

		
		 ArrayList<UserDetail> list = new ArrayList<UserDetail>();
		
		for (int i=0; i<jsonarrylogin.size();i++)
		{
			JSONObject users = (JSONObject)jsonarrylogin.get(i);
			
			UserDetail z = new UserDetail();
			z.setUsername((String) users.get("Email"));
			z.setPassword((String) users.get("password"));

			
			list.add(z);
		
		}
		
		return list;
	}
}