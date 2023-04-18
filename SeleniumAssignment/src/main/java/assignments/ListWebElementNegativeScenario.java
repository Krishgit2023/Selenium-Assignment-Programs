package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebElementNegativeScenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
		
		WebElement SubmitButton =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		SubmitButton.click();
		
		List<WebElement> SubmitErrorMsg= driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
		for(WebElement element:SubmitErrorMsg) {
			String textStrings = element.getText();
			System.out.println(textStrings);
		}
	}

}
