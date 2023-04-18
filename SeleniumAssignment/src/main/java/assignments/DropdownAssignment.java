package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		
		List<WebElement> Dropdown = driver.findElements(By.xpath("//select[@class='js-states form-control select2-hidden-accessible']//option"));
		
		System.out.println(Dropdown.size());  
		for(int x =0; x<Dropdown.size(); x++) {
			String textString = Dropdown.get(x).getText();
			System.out.println(textString);
			
			//List<WebElement> Dropdown1 = driver.findElements(By.xpath("(//select[@class='js-states form-control select2-hidden-accessible']//option"));
			//Select select = new Select(Dropdown1);
			//select.getOptions();
			
 

	}
	}
}
