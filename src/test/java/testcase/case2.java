package testcase;
import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.Test;
import PageObject.carinsurance;

public class case2 extends testbase.baseclass {
	
	@Test(priority=1,groups= {"smoke","regression"})
	public void test8() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		carinsurance cr = new carinsurance(driver);
		try{
			cr.carins();
		}
		catch(Exception e) {}
		cr.clickofcarinsurance();
		logger.info("Clicking of carinsurance");
	}
	
	@Test(priority=2,groups= {"smoke","regression"})
	public void test9() {
		carinsurance cr = new carinsurance(driver);
        cr.clickingofnewcar();
		logger.info("Clicking of new buying a car");
	}
	
	@Test(priority=3,groups= {"smoke","regression"})
	public void test10() {
		carinsurance cr = new carinsurance(driver);
		cr.clickofnewlocation();
		logger.info("Clicking of RTO location");
	}
	
	@Test(priority=4,groups= {"smoke","regression"})
	public void test11() {
		carinsurance cr = new carinsurance(driver);
		cr.clickingofregistrationno();
		logger.info("Click of RTO number");
	}
	
	@Test(priority=5,groups= {"smoke","regression"})
	public void test12() {
		carinsurance cr = new carinsurance(driver);
		cr.brandofcar();
		logger.info("Clicking of car brand");

	}
	
	@Test(priority=6,groups= {"smoke","regression"})
	public void test13() {
		carinsurance cr = new carinsurance(driver);
		cr.clickofmodel();
		logger.info("Clicking of car model");
	}
	
	@Test(priority=7,groups= {"smoke","regression"})
	public void test14() {
		carinsurance cr = new carinsurance(driver);
		cr.clickofedition();
		logger.info("Clicking of car edition");
	}
	@Test(priority=8,groups= {"smoke","regression"})
	public void test15() {
		carinsurance cr = new carinsurance(driver);
		cr.clickname();
		logger.info("Entering user name");
	}
	
	@Test(priority=9,groups= {"smoke","regression"})
	public void test16() throws IOException, InterruptedException {
		carinsurance cr = new carinsurance(driver);
		cr.clickemail();
		logger.info("Entering user E-mail");

	}
	
	@Test(priority=10,groups= {"smoke","regression"})
	public void test17() throws IOException, InterruptedException {
		carinsurance cr = new carinsurance(driver);
		cr.clickmobileno();
		logger.info("Entering user P.NO");
	}
	
}
