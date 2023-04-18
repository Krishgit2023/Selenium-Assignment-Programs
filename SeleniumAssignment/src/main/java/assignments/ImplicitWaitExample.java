package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement NewUser = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		NewUser.click();
		WebElement PersonName = driver.findElement(By.xpath("//div[@class='card-body']//h5"));
		String Name = PersonName.getText();
		System.out.println(Name);
		WebElement PersonEmail = driver.findElement(By.xpath("//div[@class='card-body']//p"));
		String Email = PersonEmail.getText();
		System.out.println(Email);
		

	}

}
