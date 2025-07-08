package Login;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 

public class login {

	public static void main(String[] args) {
		
		//Launch the Browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		// Open URL
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize(); //maximizes window
		
		//Validating the application title
		String act_title = driver.getTitle();
		
		if(act_title.equals("Swag Labs"))
		{
			System.out.println("Title Passed");
		}
		else
		{
			System.out.println("Title Failed");
		}	
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	}
	
		
		
	

}
