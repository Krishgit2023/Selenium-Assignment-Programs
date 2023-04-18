package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		//to inspect the heading
		WebElement Text = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//thead//tr[1]//th[2]"));
		String Title = Text.getText();
		System.out.println(Title);
		//to inspect body
		WebElement Text1 = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tbody//tr[1]//td[1]"));
		String Title1 = Text1.getText();
		System.out.println(Title1);
		WebElement Text2 = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tbody//tr[1]//td[2]"));
		String Title2 = Text2.getText();
		System.out.println(Title2);
		//to print entire row
		WebElement Text3 = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tbody//tr[1]"));
		String Title3 = Text3.getText();
		System.out.println(Title3);
		
		//using find elements to print to  all name in first row
		
		List<WebElement> Names = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(WebElement element:Names) {
			String textStrings = element.getText();
			System.out.println(textStrings);
		}
			
			List<WebElement> Names1 = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
			for(WebElement elements:Names1) {
				String textStrings1 = elements.getText();
				System.out.println(textStrings1);
			
			

	}

}}
