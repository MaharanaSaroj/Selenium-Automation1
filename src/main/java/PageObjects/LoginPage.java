package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver sys;
	
	public LoginPage(WebDriver sys){
		this.sys=sys;
		
	}
	
	By email = By.name("user[email]");
	By pwd = By.name("user[password]");
	By go = By.name("commit");
	
	
	
	public WebElement getEmail(){
		return sys.findElement(email);
	}

	public WebElement getpwd(){
		return sys.findElement(pwd);
	}

	public WebElement Login(){
		return sys.findElement(go);
	}

}
