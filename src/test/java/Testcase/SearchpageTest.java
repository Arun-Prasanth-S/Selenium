package Testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.SearchPage;

import base.com.Baseclass;

public class SearchpageTest extends Baseclass{
	SearchPage sp;
	@BeforeTest
	public void tc() {
	browserLanuch("https://www.amazon.in/");
	}
	@Test
	public void tc1() {
		
		sp =new SearchPage(driver);
		sp.searchpage("oneplus","oneplus earbuds");
	}
	

}
