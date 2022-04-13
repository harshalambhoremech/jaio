package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	// elicps has good ui
	@FindBy(xpath = "//*[ @id='branding']//a[@id='welcome']")
	private WebElement meanu;
	//I am a tester
	@FindBy(xpath="//*[@id='welcome-menu']/ul/li[3]/a[text()='Logout']")
	private WebElement logout;
	
	public Homepage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement meanutab (){
		return meanu;
		
	}
	public WebElement Logouttab() {
		return logout;
		
	}

}
