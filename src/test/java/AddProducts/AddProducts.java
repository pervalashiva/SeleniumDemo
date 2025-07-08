package AddProducts;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 

public class AddProducts {

	public static void main(String[] args) {
		
		//Launch the Browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		// Open URL
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize(); //maximizes window
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory' and normalize-space(text())='ADD TO CART'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory' and normalize-space(text())='ADD TO CART'])[3]")).click();
		driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory' and normalize-space(text())='ADD TO CART'])[4]")).click();
		
		driver.findElement(By.cssSelector("svg[data-icon='shopping-cart'] path")).click();
		driver.findElement(By.xpath("//a[normalize-space()='CHECKOUT']")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Shiva");
		driver.findElement(By.id("last-name")).sendKeys("Pervala");
		driver.findElement(By.id("postal-code")).sendKeys("502032");
		driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));

		
		// Find the item price in the cart page and validate
		String itemPrice = driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText();  // Adjust the locator
		if(itemPrice.equals("Total: $103.65")) {
		    System.out.println("Correct price for the item.");
		} else {
		    System.out.println("Price mismatch for the item.");
		}

		
		driver.findElement(By.xpath("//a[normalize-space()='FINISH']")).click();

		String orderComplete = driver.findElement(By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")).getText();  // Adjust the locator
		if(orderComplete.equals("THANK YOU FOR YOUR ORDER")) {
		    System.out.println("Your order has been dispatched, and will arrive just as fast as the pony can get there!");
		} else {
		    System.out.println("Your Order got failed");
		}
	}
	
		
		
	

}
