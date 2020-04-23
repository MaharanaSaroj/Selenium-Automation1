package E2EMaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import Resources.Browser;
import junit.framework.Assert;

public class FieldValidation extends Browser{
	
	
	//private static Logger log = LogManager.getLogger(FieldValidation.class.getName());

/*	@BeforeTest
	public void Login() throws IOException{
		
		
	}*/
	
	
	@Test
	public void Container() throws IOException{
		
		Bname();
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\SarojRakesh\\E2EFramework\\src\\main\\java\\Resources\\Data.properties");
		prop.load(file);
		sys.get(prop.getProperty("URL"));
		
		
		LandingPage lp = new LandingPage(sys);
		Assert.assertTrue(lp.ContField().isDisplayed());
		
		
	}										
	
	@Test
public void Container2() throws IOException{
		
		Bname();
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\E2EMaven\\Data.properties");
		prop.load(file);
		sys.get(prop.getProperty("URL"));
		
		
		LandingPage lp = new LandingPage(sys);
		Assert.assertTrue(lp.logovalidate().isSelected());
		Assert.assertTrue(lp.getcoursetitle().getText().equalsIgnoreCase("abcd"));
		
	}
	
	@AfterTest
	public void BClose(){
		
		sys.close();
		
	}
	
	

}
