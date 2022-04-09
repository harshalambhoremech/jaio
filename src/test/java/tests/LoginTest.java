package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

import org.testng.annotations.BeforeClass;

public class LoginTest extends Basetest {
	LoginPage lc;
 
  @BeforeClass
  public void beforeClass() {
	  lc= new LoginPage(driver);
	  
  }
  @Test
  public void m1() {
	  lc.usernametab().sendKeys("Admin");
	  lc.passwordtab().sendKeys("admin123");
	  lc.buttontab().click();

 

}
  }
