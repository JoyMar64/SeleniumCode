package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		    WebDriver browserObject = new ChromeDriver();
        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		  WebElement checkboxBoat = browserObject.findElement(By.xpath("//input[@value='boat']"));
		  WebElement checkboxBike = browserObject.findElement(By.xpath("//input[@value='Bike']"));
	      WebElement checkboxCar = browserObject.findElement(By.xpath("//input[@value='car']")); 
	      WebElement checkboxHorse = browserObject.findElement(By.xpath("//input[@value='horse']"));
	      WebElement submitButton = browserObject.findElement(By.xpath("//input[@value='Send']"));
	      checkboxBoat.click();
	      checkboxBike.click();
	      checkboxHorse.click();
	      System.out.println("wait 3 seconds and submit and close");
	      Thread.sleep(3000);
	      submitButton.click();
		  browserObject.close();
		}


	}


