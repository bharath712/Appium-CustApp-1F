package MoneySign;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import UserManagement.UMLogin;
import io.appium.java_client.AppiumBy;

public class MoneySignDisclaimer extends UMLogin{
  @Test
  public void MoneySignDisclaimerPage() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  //scroll down to the element and click
  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"read the science\").instance(0))")).click(); 
	 
	  
	String letsbegin = "//android.widget.ImageView[2]";
	driver.findElement(By.xpath(letsbegin));
	  


	  
  }
}
