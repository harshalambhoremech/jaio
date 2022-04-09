package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//*[@id='txtUsername']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='txtPassword']")
	private WebElement pasword;
	
	@FindBy(xpath="//*[@id='btnLogin']")
	private WebElement button;
	
	//constructor
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement usernametab() {
	return username;	
	}
	
	public WebElement passwordtab() {
		return pasword;
	}
	public WebElement buttontab() {
		return button;
		
	}

}
