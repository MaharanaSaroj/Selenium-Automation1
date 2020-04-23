package E2EMaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.Browser;


public class Test1 extends Browser
{
	

//private static Logger log = LogManager.getLogger(Test.class.getName())	;
	
		
	@Test(dataProvider="userData")
	public void InvokeBrowser(String emailid, String pwd) throws IOException{
		
		Bname();
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\E2EMaven\\Data.properties");
		prop.load(file);
		
		sys.get(prop.getProperty("URL"));
		LandingPage lp = new LandingPage(sys);
		//log.info("Landed");
		lp.Login().click();
		//log.info("g to Log in");
		
		LoginPage ll = new LoginPage(sys);
		ll.getEmail().sendKeys(emailid);
		ll.getpwd().sendKeys(pwd);
		ll.Login().click();
		//log.info("Clicked to Log in");
	
	}
	
	@DataProvider // have to write
	public Object[][] userData(){
			
			Object[][] data = new Object[2][2];
			
			data[0][0]="Myemail@email.com";
			data[0][1]="123456";
			
			data[1][0]="Youremail@email.com";
			data[1][1]="654321";
			
			return data;
			
		}


	@AfterTest
	public void BClose(){
		
		sys.quit();
		
	}	
    }
