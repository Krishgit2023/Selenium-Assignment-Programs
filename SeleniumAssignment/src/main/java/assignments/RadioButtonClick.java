package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement maleradioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleradioButton.click();
		WebElement femaleradioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		femaleradioButton.click();
	}

}
