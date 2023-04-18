package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		
        List<WebElement> Headings = driver.findElements(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//thead//tr[1]//th"));
		
		System.out.println(Headings.size());   //to print element size
		for(int x =0; x<Headings.size(); x++) {
			String textString = Headings.get(x).getText();
			System.out.println(textString);
			
		}  
        List<WebElement> Name = driver.findElements(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tbody//tr//td[1]"));
		
		System.out.println(Name.size());   //to print element size
		for(int x =0; x<Name.size(); x++) {
			String NameString = Name.get(x).getText();
			System.out.println(NameString);
		}

	}

}
