package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericScreenshot 
{
	public static String photo(WebDriver driver, String tcname) throws IOException
	{
		String photo="./screenshots/";  //Mistach (/) then take screenshots outside the folder;
		Date d=new Date();				//Capture the date;
		String d1=d.toString();			//Convert into String Format;
		String date=d1.replaceAll(":", "-");  //selenium not support (:) to convert(-); 
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+date+tcname+".jpeg");
		
		String path=dst.getAbsolutePath(); 	//path = exact location of screenshor;
		FileUtils.copyFile(src, dst);
		return path;

	}

}
