package seleniumpackage;

	import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

	    public class SearchCodeJava {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			WebDriver browserObject = new ChromeDriver();
			browserObject.get("https://www.google.com/");
			browserObject.findElement(By.name("q")).sendKeys("Cucumber");
			browserObject.findElement(By.name("btnK")).submit();
			browserObject.close();
		}

	}

