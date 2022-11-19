package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenWebsites {
WebDriver browserObject;
     @Test
	public void openingAmazonSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	    browserObject = new ChromeDriver();
        System.out.println("Open /close  amazon.com in chrome browser");
	    browserObject.get("http://www.amazon.com/");
	    Thread.sleep(2000);
        browserObject.close();
    }
	
     @Test
    public void openingCnbcSite() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	    browserObject = new ChromeDriver();
        System.out.println("Open /close  cnn.com in chrome browser");
	    browserObject.get("https://www.cnbc.com/");
	    Thread.sleep(2000);
	    browserObject.close();
    }
    
     @Test
    public void openingYahooSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	    browserObject = new ChromeDriver();
        System.out.println("Open /close  yahoo.com in chrome browser");
	    browserObject.get("http://www.yahoo.com/");
	    Thread.sleep(2000);
	    browserObject.close();
    }


}
