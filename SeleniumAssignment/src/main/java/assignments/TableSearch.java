package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-filter.php");
		driver.manage().window().maximize();
		
		WebElement SearchName = driver.findElement(By.xpath("//input[@type='text'][1]"));
		SearchName.sendKeys("Bruno Nash");
		WebElement SearchResult = driver.findElement(By.xpath("//tr[@class='odd']"));
		System.out.println(SearchResult.getText());
	}

}
