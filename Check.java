package Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.Chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); // replace with your path\r\n"
		 		
         WebDriver driver=new ChromeDriver();
           driver.get("https://en-gb.facebook.com/login/web/");
           driver.manage().window().maximize();
           WebElement email= driver.findElement(By.id("email"));
           email.sendKeys("Pooja");
           WebElement password=driver.findElement(By.name("pass"));
           password.sendKeys("1234");
           WebElement login=driver.findElement(By.name("login"));
           login.click();
   

	}

}
