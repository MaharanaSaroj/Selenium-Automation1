package Resources;



import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class Browser {
	
	public static WebDriver sys;
	
	public WebDriver Bname() throws IOException{
	
	
	Properties prop = new Properties();
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\E2EMaven\\Data.properties");
	prop.load(file);
		
		

	String  Bname = prop.getProperty("Browser");
	//String URL = prop.getProperty("URL");
	
	if(Bname.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Selenium Chrome Driver\\chromedriver.exe");
		 sys = new ChromeDriver();
	
	}
	
	else
	{
		System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Selenium Chrome Driver\\chromedriver.exe");
		 sys = new InternetExplorerDriver();
	}
		
	return sys;
	
	
		
}

public void getScreenshot(String result) throws IOException{
	
	File src = ((TakesScreenshot)sys).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("D:\\Screenshots\\"+result+"screen.png"));

}


	
}
