package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
		driver.manage().window().maximize();
		
		WebDriverWait Wait = new WebDriverWait(driver, 20);
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-info']")));
		WebElement NewUser = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		NewUser.click();
		
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-body']//h5")));
		WebElement PersonName = driver.findElement(By.xpath("//div[@class='card-body']//h5"));
		String Name = PersonName.getText();
		System.out.println(Name);
		WebElement PersonEmail = driver.findElement(By.xpath("//div[@class='card-body']//p"));
		String Email = PersonEmail.getText();
		System.out.println(Email);

	}

}
