package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/upload");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement uploadfile=driver.findElement(By.id("file-upload"));
	java.lang.String filepath="C:\\Users\\Shubham\\Downloads\\nkeyboardactiob.pdf";
	
	uploadfile.sendKeys(filepath);
	Thread.sleep(3000);
	WebElement button=driver.findElement(By.id("file-submit"));
	button.click();
	Thread.sleep(5000);
	System.out.println("file uploaded successfully");
	
	driver.quit();
	}
	}
