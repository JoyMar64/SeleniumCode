package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFillUp {
	
public static void main(String[] args) {
	
  
    WebDriver browserObject;
      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	
       browserObject = new ChromeDriver();
        browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
    
        browserObject.findElement(By.name("name")).sendKeys("Joyce");
 
    browserObject.findElement(By.name("email")).sendKeys("JoyMar@demo.com");
    
    browserObject.findElement(By.name("website")).sendKeys("www.demosite.com");
    
       browserObject.findElement(By.name("comment")).sendKeys("Hello");
    
       browserObject.findElement(By.name("submit")).click();
      browserObject.close();
}
}
