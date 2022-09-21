package UserManagement;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UMRegistration extends AppLaunch
{
	@Test
	public void RegistrationWithValidDetails() throws InterruptedException {
		System.out.println("Application opened");
		Thread.sleep(10000);
		WebElement firstImage = driver.findElement(By.xpath("//android.view.View"));
		swipeTutorial(firstImage);
		swipeTutorial(firstImage);
		driver.findElement(By.xpath("//android.widget.ImageView")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("9321486061");
		System.out.println("Mobile Number Entered");
		Thread.sleep(3000);
		String checkbox = "(//android.widget.ImageView[2])[1]";
		driver.findElement(By.xpath(checkbox)).click();
		Thread.sleep(1000);
		String numbernext ="(//android.widget.ImageView[2])[2]";
		driver.findElement(By.xpath(numbernext)).click();
		Thread.sleep(15000);

	}
}
