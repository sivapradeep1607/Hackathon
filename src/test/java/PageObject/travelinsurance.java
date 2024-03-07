package PageObject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.excelUtils;

public class travelinsurance extends basepage {

	public travelinsurance(WebDriver driver)
	{
		super(driver);
	}
	
	//pop up xpath
	@FindBy(xpath="//div[@id='exit-intent-popup-close']")
    WebElement popup;
	
	
	@FindBy(xpath="//a[contains(text(),'Insurance Products ')]")
	WebElement insuranceproduct;
	
    @FindBy(xpath="(//span[text()='Travel Insurance'] )[1]")
    WebElement travel;
    
    @FindBy(xpath="//input[@id='destination-autocomplete']")
    WebElement countryeurope;
    
    @FindBy(xpath="//em[contains(text(),'Germany')]")
    WebElement ger;
    
    @FindBy(xpath="(//div//div//div//button[contains(text(),'Continue')])[2]")
    WebElement but;
    
    @FindBy(xpath="//input[@id='startdate']")
    WebElement start;
    
    @FindBy(xpath="//button[@class='lightpick__next-action']")
    WebElement arrow ;
    
    @FindBy(xpath="//div[contains(text(),'19')]")
    WebElement date ;
    
    @FindBy(xpath="//input[@id='enddate'] ")
    WebElement edate ;
    
    @FindBy(xpath="//button[@class='lightpick__next-action']")
    WebElement dca ;
    
    @FindBy(xpath="//div[contains(text(),'19')]")
    WebElement sed ;
    
    @FindBy(xpath="(//div[@class='nextbtn'])[1]")
    WebElement nbid ;
    
    @FindBy(xpath="//div[@class='tcl-item']")
    WebElement pc ;
    
    @FindBy(xpath="//select[@id='travellerAge1']")
    WebElement t1 ;
    
    @FindBy(xpath="(//option[contains(text(),'21')])[1]")
    WebElement ta1 ;
    
    @FindBy(xpath="//select[@id='travellerAge2']")
    WebElement t2 ;
    
    @FindBy(xpath="(//option[contains(text(),'22')])[2]")
    WebElement ta2 ;
    
    @FindBy(xpath="//button[@class='process-button enable thirdStep']")
    WebElement nbit ;
    
    @FindBy(xpath="//label[contains(text(),'No')]")
    WebElement mi ;
    
    @FindBy(xpath="//input[@id='travelmobile']")
    WebElement pn ;
    
    @FindBy(xpath="//button[@class='process-button enable fifthStep']")
    WebElement nbimn ;
    
    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/summary/p")
    WebElement sb ;
    
    @FindBy(xpath="//input[@id='17_sort']")
    WebElement lp ;
    
    @FindBy(xpath="//input[@id='studentTrip']")
    WebElement st ;
    
    @FindBy(xpath="//input[@id='Traveller_1']")
    WebElement cbot1 ;
    
    @FindBy(xpath="//input[@id='Traveller_2']")
    WebElement cbot2 ;
    
    @FindBy(xpath="//select[@id='feet']")
    WebElement nodt ;
    
    @FindBy(xpath="//option[contains(text(),'30 Days')]")
    WebElement snodt ;
    
    @FindBy(xpath="//button[contains(text(),'Apply')]")
    WebElement cbutton;
    
    //1(1)click of of insurance product
    public void insuranceproductes() {
	try {
	popup.click();}
	catch(Exception e) {}
	insuranceproduct.click();
    }
    //1(2)click of travel insurance
    public void travelinsur() {
	try {
		popup.click();}
		catch(Exception e) {}	
	travel.click();
    }
    //2(1)click of country in ti
    public void country() {
	countryeurope.click();
	countryeurope.sendKeys("Germany");
	try {
		popup.click();}
		catch(Exception e) {}}
    //2(2)click of one european country as germany  
    public void Germany() {
	ger.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //2(3)click of of next button in country page
    public void button() {
	but.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //3(1)click of start date 
    public void startdate(){
	start.click();
	try {
		popup.click();}
		catch(Exception e) {}}

    //3(2)click of arrow in start date
    public void arrowofdate() {
	arrow.click();
	try {
		popup.click();}
		catch(Exception e) {}
	}
    //3(3)select of date as 19
    public void selectdate(){
	date.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //3(4)click of end date
    public void enddate() {
    JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", edate);
	try {
		popup.click();}
		catch(Exception e) {}}
    //3(5)double click of date 
    public void doubleclickarrow() {
	Actions action = new Actions(driver);
	dca.click();
	action.doubleClick(dca).perform();
	try {
		popup.click();}
		catch(Exception e) {}}
    //3(6)click of end date
    public void selectenddate() {
	sed.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //3(7)click of next button in date page
    public void nextbuttonindate() {
	nbid.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //4(1)click number of persons 
    public void peoplecount() {
	pc.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //4(2) click of traveller1 age box
    public void traveller1() {
	t1.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //4(3) click of traveller1 age
    public void travellerage1() {
	ta1.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //4(4) click of traveller2 age box
    public void traveller2() {
	t2.click();
	try {
		popup.click();}
		catch(Exception e) {}}
	//4(5) click of traveller2 age
    public void travellerage2() {
	ta2.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //4(6) click of next button in person count page
    public void nextbuttonintraveller() {
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", nbit);
	try {
		popup.click();}
		catch(Exception e) {}}
    //5(1) click of medical issue
    public void medicalissue() {
	mi.click();
	}
    //6(1) click of phone number box 
    public void phonenumber(){
	pn.click();
	pn.sendKeys("9999999999");
	}
    //6(2) click of next button in phone number page
    public void nextbuttoninmobilenumber() {
	nbimn.click();
	try {
		popup.click();}
		catch(Exception e) {}}

    //7(1)click of student trip in the filter drop down
    public void studenttrip() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", st);
	try {
		popup.click();}
		catch(Exception e) {}}
    //7(2) click of traveller1 box
    public void checkboxoftraveller1() {
	cbot1.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //7(3) click of traveller2 box 
    public void checkboxoftraveller2() {
	cbot2.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //7(4) click of number of days
    public void numberofdaystravel() {
	nodt.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //7(5)click of number of days  
    public void selectnumbrofdays() {
	snodt.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //7(6) click of apply button 
    public void nextbuttoninnumberofdaystravell() {
	cbutton.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //8(1) click of sort by drop down
    public void sortby() throws InterruptedException {
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", sb);
	try {
		popup.click();}
		catch(Exception e) {}
	}
    //8(2) click of low price 
    public void lowprice() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	lp.click();
	try {
		popup.click();}
		catch(Exception e) {}}
    //8(3) fetching of insurance company name and price  
    public void shorting() throws IOException {
	for(int i=1;i<4;i++) {
   	 String text=driver.findElement(By.xpath("(//p[@class='quotesCard--insurerName'])["+i+"]")).getText();
   	 String text2=driver.findElement(By.xpath("(//span[@class='premiumPlanPrice'])["+i+"]")).getText();
   	System.out.println(i+")"+text+"----->"+text2);
   	excelUtils.write("Sheet1", i, 0, text);
   	excelUtils.write("Sheet1", i, 1, text2);
   	 try {
   		 popup.click();
   	 }
   	 catch(Exception e) {}
   	 
    }


}
}