package testcase;
import java.io.IOException;
import org.testng.annotations.Test;
import PageObject.travelinsurance;

public class case1 extends testbase.baseclass
{

@Test(priority=1,groups={"smoke"})
public void test(){
	travelinsurance ti = new travelinsurance(driver);
	ti.insuranceproductes();
	ti.travelinsur();
	logger.info("travelinsurance");
}

@Test(priority=2,groups={"smoke"})
public void test1() {
	travelinsurance ti = new travelinsurance(driver);
	ti.country();
	ti.Germany();
	ti.button();
	logger.info("selecting country in travelinsurance");
}

@Test(priority=3,groups={"smoke"})
public void test2(){
	travelinsurance ti = new travelinsurance(driver);
	ti.startdate();
	ti.arrowofdate();
	ti.selectdate();
	ti.enddate();
	ti.doubleclickarrow();
	ti.selectenddate();
	ti.nextbuttonindate();
	logger.info("Selecting date in travelinsurance");
}

@Test(priority=4,groups={"smoke"})
public void test3() {
	travelinsurance ti = new travelinsurance(driver);
	ti.peoplecount();
	ti.traveller1();
	ti.travellerage1();
	ti.traveller2();
	ti.travellerage2();
	ti.nextbuttonintraveller();
	logger.info("Selecting traveller count in travellerinsurance");
}

@Test(priority=5,groups={"smoke"})
public void test4() {
	travelinsurance ti = new travelinsurance(driver);
	ti.medicalissue();
	logger.info("Slecting medical issue in travelinsurance");
}

@Test(priority=6,groups={"smoke"})
public void test5()  {
	travelinsurance ti = new travelinsurance(driver);
	ti.phonenumber();
	ti.nextbuttoninmobilenumber();
	logger.info("Entering phone number in travelinsurance");
}

@Test(priority=7,groups={"smoke"})
public void test6() {
	travelinsurance ti = new travelinsurance(driver);
	ti.studenttrip();
	ti.checkboxoftraveller1();
	ti.checkboxoftraveller2();
	ti.numberofdaystravel();
	ti.selectnumbrofdays();
	ti.nextbuttoninnumberofdaystravell();
	logger.info("Selecting student plan in travelinsurance");
}

@Test(priority=8,groups={"smoke"})
public void test7() throws InterruptedException, IOException {
	travelinsurance ti = new travelinsurance(driver);
	ti.sortby();
	ti.lowprice();
	ti.shorting();
	logger.info("Filtering in travel insurance");
}

}
