package testcase;
import java.io.IOException;

import org.testng.annotations.Test;
import PageObject.helthinsurance;

public class case3 extends testbase.baseclass{
	
	@Test(priority=1,groups= {"smoke","regression","sanity"})
	public void test18() {
		helthinsurance hi=new helthinsurance(driver);
		hi.clickoficon();
		hi.clickhelthinsurance();
		logger.info("Clicking of insurance product");

	}
	
	@Test(priority=2,groups= {"smoke","regression","sanity"})
	public void test19() throws IOException {
		helthinsurance hi=new helthinsurance(driver);			
		hi.listhelthinsurance();
		logger.info("Clicking of helthinsurance");

	}
	
}
