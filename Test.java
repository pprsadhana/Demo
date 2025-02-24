package Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); // replace with your path

    // Initialize the WebDriver (ChromeDriver)
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_6o3s351fev_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=674842289449&hvpos=&hvnetw=g&hvrand=18092826963067401972&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062107&hvtargid=kwd-300061672064&hydadcr=5621_2359492&gad_source=1");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   // Thread.sleep(4000);
    WebElement elementover=driver.findElement(By.className("nav-line"));
    Actions actions= new Actions(driver);
    actions.moveToElement(elementover).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    
    
    
    
/*    // Open a website (e.g., Google)
    driver.get("https://en-gb.facebook.com/login/web/");
    
   driver.findElement(By.id("email")).sendKeys("pujarathod71294@gmail.com");
    Thread.sleep(2000); 
    
   driver.findElement(By.name("pass")).sendKeys("Zxcv@1234");
   driver.findElement(By.name("login")).click();
    
    Thread.sleep(2000);
    
 //   WebElement checkbox=driver.findElement(By.className("recaptcha-checkbox-border"));
   */
	}

}
