package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("WebDriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/drag_and_drop");
	Thread.sleep(5000);
	WebElement drag=driver.findElement(By.id("column-a"));
	WebElement drop=driver.findElement(By.id("column-b"));
	Actions action=new Actions(driver);
	action.dragAndDrop(drag, drop).perform();
	Thread.sleep(3000);
	}

}
