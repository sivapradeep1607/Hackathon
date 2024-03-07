package stepdefinition;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks { 
	static WebDriver driver;
	 static Properties p;
	@Before
	public static  void setup() throws IOException, InterruptedException
	{
		driver=BaseClass.getWebDriver();
		p=BaseClass.getProperties();
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
	}

	@AfterStep
	public void addScreenshot(Scenario scenario) {
	  if(!scenario.isFailed()) {
	  	TakesScreenshot ts=(TakesScreenshot) driver;
	  	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
	  	scenario.attach(screenshot, "image/png",scenario.getName());
	  }
	}
	@After
	public void quit()
	{
		driver.quit();
	}
 
}
