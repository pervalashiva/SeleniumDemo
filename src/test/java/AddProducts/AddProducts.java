package AddProducts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProducts {

    public static void main(String[] args) {

        // Set Chrome options to disable the password save prompt
        ChromeOptions options = new ChromeOptions();
        
        // Disable password saving prompt
        options.addArguments("disable-save-password-bubble");
        
        // Disable "Chrome is being controlled by automated software" message
        options.addArguments("disable-infobars");
        
        // Disable password manager and autofill features
        options.addArguments("disable-password-manager");
        options.addArguments("disable-autofill");

        // Start Chrome maximized
        options.addArguments("start-maximized");

        // Set a temporary profile directory (to avoid using existing Chrome profiles)
        String tempProfilePath = "C:\\Path\\To\\Temporary\\Profile";  // Change this path
        options.addArguments("user-data-dir=" + tempProfilePath);

        // Initialize ChromeDriver with the options
        WebDriver driver = new ChromeDriver(options);  // Use options here to pass the configurations
        
        // Open the URL
        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.manage().window().maximize();  // Maximizes the window

        // Log in with username and password
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        // Use a more reasonable wait time (e.g., 10-20 seconds) for elements to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Add products to the cart
        driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory' and normalize-space(text())='ADD TO CART'])[1]")).click();
        driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory' and normalize-space(text())='ADD TO CART'])[3]")).click();
        driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory' and normalize-space(text())='ADD TO CART'])[4]")).click();

        // Go to the shopping cart
        driver.findElement(By.cssSelector("svg[data-icon='shopping-cart'] path")).click();
        
        // Use a reasonable wait time for the shopping cart to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Proceed to checkout
        driver.findElement(By.xpath("//a[normalize-space()='CHECKOUT']")).click();

        // Enter customer information
        driver.findElement(By.id("first-name")).sendKeys("Shiva");
        driver.findElement(By.id("last-name")).sendKeys("Pervala");
        driver.findElement(By.id("postal-code")).sendKeys("502032");
        driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();

        // Use a reasonable wait time for the checkout page to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Find the item price in the cart page and validate
        String itemPrice = driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText();  // Adjust the locator
        if (itemPrice.equals("Total: $103.65")) {
            System.out.println("Correct price for the item.");
        } else {
            System.out.println("Price mismatch for the item.");
        }

        // Complete the order
        driver.findElement(By.xpath("//a[normalize-space()='FINISH']")).click();

        // Validate the order completion message
        String orderComplete = driver.findElement(By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")).getText();  // Adjust the locator
        if (orderComplete.equals("THANK YOU FOR YOUR ORDER")) {
            System.out.println("Your order has been dispatched, and will arrive just as fast as the pony can get there!");
        } else {
            System.out.println("Your Order got failed");
        }

        // Close the browser
        driver.quit();
    }
}
