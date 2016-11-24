package module1;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class LoginTestcase_1 {
	  
	public static void main(String[] args) throws InterruptedException {
		
	// Open browser      	
	FirefoxDriver driver=new FirefoxDriver();
	     System.out.println("launch fire fox");
	// maximize browser
	
	driver.manage().window().maximize();
	     System.out.println("maximize the window");
	
	//using implicitly wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	     System.out.println("using wait");
	
	// Open URL
	driver.get("https://github.com/login");
	     System.out.println("open the git hub account");
	
	//filling the field for username 
	WebElement username = driver.findElement(By.xpath(".//*[@id='login_field']"));
	
	    username.sendKeys("ajayshivhare92@gmail.com");
	
	//filling the field for Password 
	WebElement password = driver.findElement(By.xpath(".//*[@id='password']"));
		
		password.sendKeys("ajay.1234");
	        
	// Click on login button
     WebElement clickButton = driver.findElement(By.xpath(".//*[@id='login']/form/div[4]/input[3]"));
		
		clickButton.click();
		
		Thread.sleep(50000);
	
		String actualtext = driver.findElement(By.xpath(".//*[@id='your_repos']/div[1]/a")).getText();
		
		String expected = " New repository";
		
		Assert.assertEquals(actualtext, expected);
		
		System.out.println("login succesfully");
	 
	    }	
	}