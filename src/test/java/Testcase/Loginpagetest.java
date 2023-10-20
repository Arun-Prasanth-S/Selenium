package Testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Loginpage;

import base.com.Baseclass;

public class Loginpagetest extends Baseclass{
	Loginpage lp;

	@BeforeTest
	public void login1() {
		browserLanuch("https://www.amazon.in/");
				
	}
	@Test
	public void tc1() {
		lp=new Loginpage(driver);
		lp.login("arun");
		lp.validate();
	}

}
