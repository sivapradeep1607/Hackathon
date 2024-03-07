package testrunner;
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//cucumber" }, 
				glue = { "stepdefinition" }, 
                 plugin = {"pretty", "html:reports/myreport.html",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
                 dryRun = false,
                 monochrome = true,
                 publish = true)
                 //tags = "@smoke")

 
public class Testrunner  {
 
}