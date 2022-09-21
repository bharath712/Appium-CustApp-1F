package UserManagement;

import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.sound.midi.Sequence;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppLaunch {

	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	public UiAutomator2Options options;

	@BeforeMethod
	public void ConfigApp() throws MalformedURLException {

		options = new UiAutomator2Options();
		options.setDeviceName("emulator-5554");
//		options.setDeviceName("IBRWIBV8QCFUV4HM");
		options.setApp("/Users/bharath/eclipse-workspace/appiumproject/src/test/resources/1 Finance.apk");
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);

	}
	
	 public void swipeTutorial(WebElement ele) {
		  ((JavascriptExecutor)driver).executeScript("mobile:swipeGesture",ImmutableMap.of(
		          "elementId",((RemoteWebElement)ele).getId(),
		          "direction", "left" ,
		          "percent",0.75
				  ));
		  
		  }
	 
	 public void scrollToWebElement(WebElement locator)
	    {
	        try
	        {
	            JavascriptExecutor js = (JavascriptExecutor) driver;    
	            js.executeScript("arguments[0].scrollIntoView();", locator);
	        }
	        catch (Exception e)
	        {
	            System.err.println("Unable to scroll to webelement.  WebElement is not visible.");
	        }
	    }
	 
	 public void ScrollPage() {
	 boolean canScrollMore ;
	 do
	 {
	  canScrollMore = ( Boolean ) ( ( JavascriptExecutor ) driver ) .executeScript ( " mobile : scrollGesture " , ImmutableMap.of (
	         " left " , 100 , " top " , 100 , " width " , 200 , " height " , 200 ,
	         " direction " , " down " ,
	         " percent " , 3.0
	     ) ) ;
	 } while ( canScrollMore ) ;
	 }  
	 
	@AfterClass
	public void CloseApp() {
		driver.quit();



	}

}
