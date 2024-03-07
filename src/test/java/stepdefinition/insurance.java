package stepdefinition;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import PageObject.carinsurance;
import PageObject.helthinsurance;
import PageObject.travelinsurance;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class insurance  {    
	  travelinsurance ti;
      carinsurance cr;
      helthinsurance hi;
      
      //s1
      public static WebDriver driver =BaseClass.getDriver();
      @Given("click of travel insurance")
      public void click_of_travel_insurance() {
    	    ti =new travelinsurance(BaseClass.getDriver());
    		ti.insuranceproductes();
    		ti.travelinsur();
          
      }

      @When("selecting of country")
      public void selecting_of_country() {
    	    ti.country();
    		ti.Germany();
    		ti.button();
          
      }

      @Then("selection of date")
      public void selection_of_date() throws InterruptedException {
          
    	    ti.startdate();
    		ti.arrowofdate();
    		ti.selectdate();
    		ti.enddate();
    		ti.doubleclickarrow();
    		ti.selectenddate();
    		ti.nextbuttonindate();
      }

      @Then("selecting number of persons")
      public void selecting_number_of_persons() {
          
            ti.peoplecount();
    		ti.traveller1();
    		ti.travellerage1();
    		ti.traveller2();
    		ti.travellerage2();
    		ti.nextbuttonintraveller();
      }

      @Then("selecting medical issue")
      public void selecting_medical_issue() {
          
    	    ti.medicalissue();
      }

      @Then("phone number page")
      public void phone_number_page() throws InterruptedException {
          
    	    ti.phonenumber();
    		ti.nextbuttoninmobilenumber();
      }

      @Then("clicking of filter")
      public void clicking_of_filter() {
          
    	    ti.studenttrip();
    		ti.checkboxoftraveller1();
    		ti.checkboxoftraveller2();
    		ti.numberofdaystravel();
    		ti.selectnumbrofdays();
    		ti.nextbuttoninnumberofdaystravell();
      }

      @Then("clicking of sort by")
      public void clicking_of_sort_by() throws IOException, InterruptedException {
    	    ti.sortby();
    		ti.lowprice();
    		ti.shorting();
          
      }
//s2
      @Given("click of policy bazaar icon")
      public void click_of_policy_bazaar_icon() {
    	  cr=new carinsurance(BaseClass.getDriver());
    	  try{
  			cr.carins();
  		}
  		catch(Exception e) {}
  		    cr.clickofcarinsurance();
          
      }

      @Then("click of new car")
      public void click_of_new_car() {
          
          cr.clickingofnewcar();

      }

      @Then("click of location")
      public void click_of_location() {
  		cr.clickofnewlocation();

          
      }

      @Then("click of registration number")
      public void click_of_registration_number() {
  		cr.clickingofregistrationno();

          
      }

      @Then("click of car brand")
      public void click_of_car_brand() {
  		cr.brandofcar();

          
      }

      @Then("click of selected car model")
      public void click_of_selected_car_model() {
  		cr.clickofmodel();

          
      }

      @Then("click of selected car edition")
      public void click_of_selected_car_edition() {
  		cr.clickofedition();

          
      }

      @Then("click of user name")
      public void click_of_user_name() {
          
  		cr.clickname();

      }

      @Then("click of user email")
      public void click_of_user_email() throws IOException, InterruptedException {
  		cr.clickemail();

          
      }

      @Then("click of user mobile number")
      public void click_of_user_mobile_number() throws IOException, InterruptedException {
  		cr.clickmobileno();

          
      }
//s3
      @Given("click of policy bazaar icon1")
      public void click_of_policy_bazaar_icon1() {
    	  hi=new helthinsurance(BaseClass.getDriver());
    	  try{
  			hi.clickoficon();
  		}
  		catch(Exception e) {}
  		hi.clickhelthinsurance();
      }
      @Then("click of insurance product")
      public void click_of_insurance_product() throws IOException {
  		hi.listhelthinsurance();
 
          
      }
      
}
