package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class Generic_PropertiesFile 
{
	@Test
	public static String test(String path, String key) throws FileNotFoundException, IOException
	{
		//1. Create object for Properties class;
		Properties p2=new Properties();
		
		
		//2. Specify the path of properties file;
		p2.load(new FileInputStream(path));
		
		//3. Specify the key and it will fetch the value; 
		 String value = p2.getProperty(key);
		System.out.println(value);
		return value;
		
		
	}

}
