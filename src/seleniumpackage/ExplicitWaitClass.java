package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitClass {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	    WebDriver browserObject = new ChromeDriver();
       	WebDriverWait wait=new WebDriverWait(browserObject, 10);
      browserObject.get("http://google.com" );
        WebElement gmailLink;
	  gmailLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[contains(text(),'Gmail')]")));
      gmailLink.click();
      System.out.println("Test passed.");
     browserObject.quit();
	}



}
