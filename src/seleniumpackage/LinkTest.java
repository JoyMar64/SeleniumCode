package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {
public static void main(String[] args) {
		
	WebDriver browserObject;
              System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	        browserObject = new ChromeDriver();
       
	        browserObject.get("https://www.google.com/");
	        WebElement blogLink = browserObject.findElement(By.linkText("Gmail"));
			  
			 
	        if (blogLink.isDisplayed()) {
            System.out.println("Gmail link is diplayed usingLinkText");
        } else {
            System.out.println("Unable to find Gmail");
        }
	        browserObject.close();
	}

}
