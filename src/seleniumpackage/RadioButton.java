package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		   WebDriver browserObject = new ChromeDriver();
		    browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        WebElement radioButtonFemale = browserObject.findElement(By.xpath("//input[@value='female']"));
		    WebElement radioButtonMale = browserObject.findElement(By.xpath("//input[@value='male']"));
		    WebElement radioButtonOther = browserObject.findElement(By.xpath("//input[@value='Other']"));
	        WebElement submitButton = browserObject.findElement(By.xpath("//input[@value='Send']"));
		    radioButtonMale.click();
		    Thread.sleep(6000);
		    radioButtonFemale.click();
		    submitButton.click();
	        }
}
