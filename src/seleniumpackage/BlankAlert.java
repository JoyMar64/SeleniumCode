package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlankAlert {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver browserObject;
		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		    browserObject = new ChromeDriver();
	        browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
		    browserObject.findElement(By.name("proceed")).click();
	        Alert alert = browserObject.switchTo().alert();
		    Thread.sleep(3000);
		    System.out.println(alert.getText());
		    alert.accept();
		    browserObject.close();
	}

}

