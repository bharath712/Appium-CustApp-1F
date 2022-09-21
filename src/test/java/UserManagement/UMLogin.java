package UserManagement;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;

public class UMLogin extends AppLaunch{

	@Test
	public void LoginWithValidDetails() throws InterruptedException 
	{
		System.out.println("Application opened");
		Thread.sleep(10000);
		WebElement firstImage = driver.findElement(By.xpath("//android.view.View"));
		swipeTutorial(firstImage);
		swipeTutorial(firstImage);
		driver.findElement(By.xpath("//android.widget.ImageView")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("8898782353");
		System.out.println("Mobile Number Entered");
		Thread.sleep(3000);
		String checkbox = "(//android.widget.ImageView[2])[1]";
		driver.findElement(By.xpath(checkbox)).click();
		Thread.sleep(1000);
		String numbernext ="(//android.widget.ImageView[2])[2]";
		driver.findElement(By.xpath(numbernext)).click();
		Thread.sleep(20000);
		
	
//		String letsbeginsss = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]";
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().xpath(\"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]\"));")).click();		

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"read the science\"));"));	
		Thread.sleep(2000);
		String emailid = "//android.widget.EditText";
		driver.findElement(By.xpath(emailid)).click();
		driver.findElement(By.xpath(emailid)).sendKeys("Hiiiii");

//		WebElement checkkk = driver.findElement(By.xpath("//android.view.View[@content-desc=\"read the science\"]"));
//		scrollToWebElement(checkkk);
		Thread.sleep(5000);
		String letsbegin = "//android.widget.ImageView[2]";
//		driver.findElement(By.xpath(letsbegin)).click();
		  
	}
	
	@Test
	public void LoginWithInvalidDetails() throws InterruptedException 
	{
		System.out.println("Application opened");
		Thread.sleep(10000);
		WebElement firstImage = driver.findElement(By.xpath("//android.view.View"));
		swipeTutorial(firstImage);
		swipeTutorial(firstImage);
		driver.findElement(By.xpath("//android.widget.ImageView")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("889878235");
		System.out.println("Invalid Mobile Number Entered");
		Thread.sleep(3000);
		String checkbox = "(//android.widget.ImageView[2])[1]";
		driver.findElement(By.xpath(checkbox)).click();
		Thread.sleep(1000);
		String numbernext ="(//android.widget.ImageView[2])[2]";
		driver.findElement(By.xpath(numbernext)).click();
		String actualresult = driver.findElement(By.xpath(numbernext)).getAttribute("focused");
		Assert.assertEquals(actualresult, "false");
	
		}
		
	@Test
	public void LoginWithoutCheckbox() throws InterruptedException 
	{
		System.out.println("Application opened");
		Thread.sleep(10000);
		WebElement firstImage = driver.findElement(By.xpath("//android.view.View"));
		swipeTutorial(firstImage);
		swipeTutorial(firstImage);
		driver.findElement(By.xpath("//android.widget.ImageView")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("8898782353");
		System.out.println("Invalid Mobile Number Entered");
		Thread.sleep(3000);
//		String checkbox = "(//android.widget.ImageView[2])[1]";
//		driver.findElement(By.xpath(checkbox)).click();
		Thread.sleep(1000);
		String numbernext ="(//android.widget.ImageView[2])[2]";
		driver.findElement(By.xpath(numbernext)).click();
		String actualresult = driver.findElement(By.xpath(numbernext)).getAttribute("focused");
		Assert.assertEquals(actualresult, "false");
	
		}
	

}

