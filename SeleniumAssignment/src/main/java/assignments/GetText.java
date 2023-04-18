package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement EnterMessageField = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		EnterMessageField.sendKeys("Hello Krishna");
		WebElement ShowMessageButton = driver.findElement(By.xpath("//button[text()='Show Message']"));
		ShowMessageButton.click();
		WebElement PrintMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String Text = PrintMessage.getText();
		System.out.println(Text);
	}

}
