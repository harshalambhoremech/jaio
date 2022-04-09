package tests;

import org.testng.annotations.Test;

import pages.Homepage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Hometest extends Basetest {
	Homepage pc;

  @BeforeClass
  public void beforeClass() {
	  pc=new Homepage(driver);
	 
  }
  @Test
  public void m2() {
	  System.out.println("pass");
	  pc.meanutab().click();
	  pc.Logouttab().click();
  }

  @AfterClass
  public void afterClass() {
  }

}
