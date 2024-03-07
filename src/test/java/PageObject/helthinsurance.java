package PageObject;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.excelUtils;
public class helthinsurance extends basepage {
	 
		public helthinsurance(WebDriver driver)
		{
			super(driver);
		}
		@FindBy(xpath="//a[@class='pb-logo']")
		WebElement policy;
		
		@FindBy(xpath="//img[@alt='policybazaar']")
		WebElement policy1;
		
		@FindBy(xpath="//a[contains(text(),'Insurance Products ')]")
		WebElement helth;
		
		@FindBy(xpath="//li//div[3]/ul/li")
		List<WebElement> helthins;
		
		
		//1click of policy bazaar icon 
        public void clickoficon() {
        	try {
        	JavascriptExecutor executor = (JavascriptExecutor) driver;
        	executor.executeScript("arguments[0].click();", policy);
        	}catch(Exception e) {
        		JavascriptExecutor executor = (JavascriptExecutor) driver;
            	executor.executeScript("arguments[0].click();", policy1);
        	}
        }
        //2(1)click of insurance product
		public void clickhelthinsurance() {
			helth.click();
		}
		//2(2) click of list of insurance
		public void listhelthinsurance()throws IOException {
			int row=8;
			for(WebElement i:helthins) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				System.out.println(i.getText());
				excelUtils.write("sheet1",row, 0,i.getText());
				row++;
				}
		}
			

}
