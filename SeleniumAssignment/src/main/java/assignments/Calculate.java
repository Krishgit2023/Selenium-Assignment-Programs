package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement Field1 = driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		Field1.sendKeys("10");
		WebElement Field2 = driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
		Field2.sendKeys("5");
		WebElement GetTotalButton = driver.findElement(By.xpath("//button[text()='Get Total']"));
		GetTotalButton.click();
		WebElement TotalText = driver.findElement(By.xpath("//div[@id='message-two']"));
		String Sum = TotalText.getText();
		System.out.println(Sum);
		
	}

}
