package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsListUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		List<WebElement> Salary = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[6]"));
		for(WebElement element:Salary) {
			String SalaryData = element.getText();
			System.out.println(SalaryData);
		}
		
		List<WebElement> Data = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]"));
		for(WebElement elements:Data) {
			String PersonData = elements.getText();
			System.out.println(PersonData);

	}

}}
