package seleniumpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass {

	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			      WebDriver  browserObject = new ChromeDriver();
			        browserObject.get("https://www.amazon.com/");
			        System.out.println("this is " + browserObject.getTitle() + " website");
			        System.out.println("url is: " + browserObject.getCurrentUrl());
	       	        browserObject.navigate().to("http://www.yahoo.com/");
			        System.out.println("this is " + browserObject.getTitle() + " website");
			        System.out.println("url is: " + browserObject.getCurrentUrl());
	       	        browserObject.navigate().to("http://www.facebook.com/");
	        System.out.println("this is " + browserObject.getTitle() + " website");
	        System.out.println("url is: " + browserObject.getCurrentUrl());
	       	        browserObject.navigate().back();
	        System.out.println("this is " + browserObject.getTitle() + " website");
	        System.out.println("url is: " + browserObject.getCurrentUrl());
	       	        browserObject.navigate().back();
		        browserObject.navigate().forward();
	        System.out.println("this is " + browserObject.getTitle() + " website");
	        System.out.println("url is: " + browserObject.getCurrentUrl());
	        browserObject.close();

	}

}