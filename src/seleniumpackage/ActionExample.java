package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {
       public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			WebDriver browserObject = new ChromeDriver();
			browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	        Actions action = new Actions(browserObject);    
		    WebElement rightClickElement = browserObject.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	       action.contextClick(rightClickElement).build().perform();
	     }
}
