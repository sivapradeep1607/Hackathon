package PageObject;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.excelUtils;
public class carinsurance extends basepage{
	public carinsurance(WebDriver driver)
	{
		super(driver);
	}
	
	//pop up
	@FindBy(xpath="//div[@id=\"exit-intent-popup-close\"]")
    WebElement popup;
	
	
	
	@FindBy(xpath="//a[text()='Policybazaar']")
	WebElement car;
	
	@FindBy(xpath="(//i[@class='icon-bg homeIconsBg car-insurance'])[2]")
	WebElement carinsurance;
	
	
	
	/***************************old page************************/
	@FindBy(xpath="//a[@class='btn-proceed']")
	WebElement newcar;
	
	@FindBy(xpath="//span[text()='Chennai']")
	WebElement location;
	
	@FindBy(xpath="//span[text()='TN01']")
	WebElement registrationno;
	
	@FindBy(xpath="//span[@class='tata']")
	WebElement brand;
	
	@FindBy(xpath="//b[text()='SAFARI']")
	WebElement model;
	
	@FindBy(xpath="//b[text()='Accomplished Dark Edition AT (1956 cc)']")
	WebElement edition;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement name;
		
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"mobileNo\"]")
	WebElement mobileno;
	
	@FindBy(xpath="//div[@id='dvVariant']//div[2]//div[2]//div[2]")
	WebElement emailerr;
	
		
	/***********************updated page locaters****************************/
	
	@FindBy(xpath="//span[text()='Click here ']")
	WebElement new1car;
	
	@FindBy(xpath="//span[text()='Chennai']")
	WebElement newlocation;
	
	@FindBy(xpath="//*[text()='TN01']")
	WebElement newregistrationno;
	
	@FindBy(xpath="//*[@class='tata ']")
	WebElement newbrand;
	
	@FindBy(xpath="//li[text()='SAFARI']")
	WebElement newmodel;
	
	@FindBy(xpath="//li[text()='Accomplished Dark Edition AT (1956 cc)']")
	WebElement newedition;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement newname;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement newemail;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	WebElement newmobileno;
	
	@FindBy(xpath="//div[text()='Enter a valid email id']")
	WebElement newemailerr;
	
	@FindBy(xpath="(//*[text()='Input required'])[1]")
	WebElement newemailerrin;
	
	String[] input=excelUtils.read();
	
	//1(1)click of policy bazaar icon
	public void carins() {
		car.click();
		try {
			popup.click();}
			catch(Exception e) {}
	}
	//1(2)click of car insurance icon in home page
	public void clickofcarinsurance() {
		carinsurance.click();
	}
	//2 click of new car 
	public void clickingofnewcar() {
		try {
		newcar.click();}
		catch(Exception e) {
			new1car.click();
		}
	}
	//3 click of location
	public void clickofnewlocation() {
		try {
		location.click();
		}
		catch(Exception e) {
			newlocation.click();
		}
	}
	//4click of registration number
	public void clickingofregistrationno() {
		try {
		registrationno.click();
		}catch(Exception e) {
			newregistrationno.click();
		}
	}
	//5 click of car brand 
	public void brandofcar() {
		try {
		brand.click();
		}catch(Exception e) {
			newbrand.click();
		}		
	}
	//6 click of selected car model
	public void clickofmodel() {
		try {
		model.click();
		}catch(Exception e) {
			newmodel.click();
		}
	}
	//7 click of selected car edition 
	public void clickofedition() {
		try {
		edition.click();
		}catch(Exception e) {
			newedition.click();
		}
	}//8 click of user name
	public void clickname() {
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click();", name);
		//name.click();		
		name.sendKeys(input[0]);
		}catch(Exception e) {
			//e.printStackTrace();
			newname.click();
			newname.sendKeys(input[0]);
		}
	}
	//9click of user email
	public void clickemail() throws IOException, InterruptedException {
		try {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", email);
		email.sendKeys(input[1]);
		email.sendKeys(Keys.ENTER);
		excelUtils.write("Sheet1",5, 0,emailerr.getText());
   	    System.out.println("ERROR MESSAGE OF E-MAIL1");
   	    System.out.println("----------------------");
   	    System.out.println(emailerr.getText());
		}
		catch(Exception e){
			//e.printStackTrace();
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", newemail);
			newemail.click();
			newemail.sendKeys(input[1]);
			newmobileno.click();
			try {
			excelUtils.write("Sheet1",5, 0,newemailerr.getText());
			System.out.println("ERROR MESSAGE OF E-MAIL2");
	   	    System.out.println("----------------------");
	   	    System.out.println(newemailerr.getText());
			}catch(Exception r) {
				excelUtils.write("Sheet1",5, 0,newemailerrin.getText());
				System.out.println("ERROR MESSAGE OF E-MAIL3");
		   	    System.out.println("----------------------");
		   	    System.out.println(newemailerrin.getText());
			}
	    }
    }	
	//10click of user mobile number 
	public void clickmobileno() throws IOException, InterruptedException {	
		 try{
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", mobileno);
		 mobileno.sendKeys(input[2]);
         Thread.sleep(5000);
         }
		 catch(Exception e){
			 //e.printStackTrace();
			 newmobileno.click();
		     newmobileno.sendKeys(input[2]);
		     Thread.sleep(5000);
		    }	
		}
	}