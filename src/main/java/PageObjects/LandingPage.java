package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	public WebDriver sys;
	
	By Signin = By.xpath("//*[@id='homepage']/header/div[1]/div/nav/ul/li[4]/a");
	/*@FindBy(xpath="//*[@id='homepage']/header/div[1]/div/nav/ul/li[4]/a")
	WebElement Signin;*/
	
	By container = By.xpath("//div[@class='container']/nav/ul");
	By logo = By.className("navbar-brand");
	By coursetitle =By.xpath("//div[class='text-center']/h2");
	
	
	
	public LandingPage(WebDriver sys) {
		// TODO Auto-generated constructor stub
		this.sys=sys;
	}

	public WebElement Login(){
		
		return sys.findElement(Signin);
	}
	public WebElement ContField(){
		return sys.findElement(container);
	}
	
	public WebElement logovalidate(){
		
		return sys.findElement(logo);
	}
	
	public WebElement getcoursetitle(){
		return sys.findElement(coursetitle);
	}
	
	
	

}
