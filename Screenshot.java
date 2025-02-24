package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.openqa.selenium.OutputType;
public class Screenshot {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver (adjust the path as needed)
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shubham\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

        // Initialize WebDriver (example: ChromeDriver)
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the desired page
            driver.get("https://www.google.com");

            // Capture screenshot of the entire page
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Specify the location to save the screenshot
            Path destinationPath = Paths.get("C:\\Users\\Shubham\\Desktop\\quetions.png");  // Destination file path

            // Convert screenshot (File) to Path and copy the file to the destination
            Files.copy(screenshot.toPath(), destinationPath);  // Correct file copy

            System.out.println("Screenshot saved at: " + destinationPath);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
