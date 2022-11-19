package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			   	WebDriver browserObject = new ChromeDriver();
			    browserObject.get("http://training.qaonlinetraining.com/testPage.php");
			   Select countrySelect = new Select(browserObject.findElement(By.name("country")));
		        countrySelect.selectByVisibleText("USA"); 
		        countrySelect.selectByVisibleText("France");
		       Select skillSelect = new Select(browserObject.findElement(By.name("skill")));
		        skillSelect.selectByVisibleText("Programming");
		        skillSelect.selectByVisibleText("Database");
		        System.out.println("selectByVisibleText(\"Database");
		        browserObject.findElement(By.name("submit")).click();
		        System.out.println("Form Fill-up Succesfull");
		        browserObject.close();
		}

	}


