package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		
		List<WebElement> Checkbox = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement element:Checkbox) {
			element.click();
		}
		
		for(WebElement element:Checkbox) {
			if(element.isSelected()) {
				System.out.print(true);
			}else {
				System.out.print(false);
			}
		}

	}

}
