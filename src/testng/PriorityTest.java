package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityTest {
	WebDriver browserObject;
	@Test(priority =1)
    	public void openingAmazonSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	    browserObject = new ChromeDriver();
        System.out.println("Open /close  amazon.com in chrome browser");
	    browserObject.get("http://www.amazon.com/");
	    Thread.sleep(2000);
        browserObject.close();
    }
    @Test(priority =2)
    public void openingCNBCSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        browserObject = new ChromeDriver();
        System.out.println("Open /close  cnbc.com in chrome browser");
        browserObject.get("https://www.cnbc.com/");
        Thread.sleep(2000);
        browserObject.close();
    }
    @Test(priority =3)
    public void openingYahooSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        browserObject = new ChromeDriver();
        System.out.println("Open /close  yahoo.com in chrome browser");
        browserObject.get("http://www.yahoo.com/");
        Thread.sleep(2000);
        browserObject.close();
    }

}
