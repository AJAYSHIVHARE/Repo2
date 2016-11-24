package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestCases2 {

	public static void main(String[] args) throws InterruptedException {
		
		// Open browser             
		FirefoxDriver driver=new FirefoxDriver();
		        
		// maximize browser
		driver.manage().window().maximize();
		        
		// Open URL
		driver.get("https://github.com/login");
		
		//filling the field for username 
		WebElement username = driver.findElement(By.xpath(".//*[@id='login_field']"));
		
		username.sendKeys("ajayshivhare@gmail.com");
		
		//filling the field for Password 
		WebElement password = driver.findElement(By.xpath(".//*[@id='password']"));
			
			password.sendKeys("ajay.0987");
		        
		// Click on login button
	     WebElement clickButton = driver.findElement(By.xpath(".//*[@id='login']/form/div[4]/input[3]"));
			
			password.click();
			
             Thread.sleep(50000);
             
			// This will capture error message
			String actual_msg = driver.findElement(By.xpath(".//*[@id='js-flash-container']/div/div")).getText();
			
			String expected_msg=   " Incorrect username or password.";
			
			Assert.assertEquals(actual_msg,expected_msg );

			System.out.println("test cases pass please enter valid username and password");
  }
}